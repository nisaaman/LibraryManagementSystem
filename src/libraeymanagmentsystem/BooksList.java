/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package libraeymanagmentsystem;

/**
 *
 * @author NISA'S PC
 */
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.ImageIcon;



public class BooksList extends JFrame 
 {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/library_system";
    static final String USER_NAME = "root";
    static final String PASSWORD = "";

    static final String DEFAULT_QUERY = "select * from tblbooks";

    private BooksListTable tableModel;
    private JTextArea queryArea;
  
    

    public BooksList()
      {
        super("Displaying Books List");
        super.setIconImage(new ImageIcon ("C:\\@imgs\\books.gif").getImage());
        
    try
         {

           tableModel = new BooksListTable(JDBC_DRIVER,DATABASE_URL,USER_NAME,PASSWORD,DEFAULT_QUERY);
           queryArea = new JTextArea(DEFAULT_QUERY,3,50);
           queryArea.setFont(new java.awt.Font("Jokerman", 3, 14));
           queryArea.setForeground(new java.awt.Color(102, 0, 102));
           queryArea.setBackground(new java.awt.Color(255, 255, 204));
           queryArea.setWrapStyleWord( true );
           queryArea.setLineWrap(true);

           JScrollPane scrollPane = new JScrollPane (queryArea,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
           JButton submitButton = new JButton ("Submit Books List");

           Box box = Box.createHorizontalBox();
           box.add(scrollPane);
           box.add(submitButton);
           JTable resultTable = new JTable(tableModel);
           add(box, BorderLayout.NORTH);
           add(new JScrollPane(resultTable),BorderLayout.CENTER);

           submitButton.addActionListener(
                   new ActionListener()
           {
               public void actionPerformed(ActionEvent event)
               {
                   try
                   {
                       tableModel.setQuery(queryArea.getText());

                   }
                  catch(SQLException sqlException)
                   {
                    JOptionPane.showMessageDialog(null, sqlException.getMessage(), "Database error", JOptionPane.ERROR_MESSAGE);

                   try
                   {
                    tableModel.setQuery(DEFAULT_QUERY);
                    queryArea.setText(DEFAULT_QUERY);
                   }
               catch(SQLException sqlException2)
                     {
                    JOptionPane.showMessageDialog(null, sqlException2.getMessage(), "Database error", JOptionPane.ERROR_MESSAGE);
                    tableModel.disconnectFromDatabase();
                    System.exit(1);
                    }
               }
           }
      }

    );
    
       setSize(1000,500);
       setVisible(true);

        }
        catch(ClassNotFoundException classNotFound)
           {
             JOptionPane.showMessageDialog(null, "MySQL driver not found", "Driver not found", JOptionPane.ERROR_MESSAGE);
             System.exit(1);
           }
        catch(SQLException sqlException)
          {
           JOptionPane.showMessageDialog(null, sqlException.getMessage(), "Database error", JOptionPane.ERROR_MESSAGE);
           tableModel.disconnectFromDatabase();
           System.exit(1);
          }
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        addWindowListener(
                new WindowAdapter()
                  {
                  public void windowClosed(WindowEvent event)
                     {
                       tableModel.disconnectFromDatabase();
                       System.exit(1);
                     }
                  }
        );
    }
    public static void main(String args[])
       {

        new BooksList();

       }

 }

