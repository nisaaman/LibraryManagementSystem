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
import javax.swing.*;
import java.sql.*;

public class SearchBook extends JFrame
{
	Dimension screen 		 = 	Toolkit.getDefaultToolkit().getScreenSize();
	public static JPanel 	jpnlMain  		 = new JPanel();

        JButton bttnSearch 		 = new JButton("Search",	new ImageIcon("@imgs/search.gif"));
	JButton bttnExit 		 = new JButton("Cancel",	new ImageIcon("@imgs/cancel.gif"));

         public static JTable 		JTBooksTbl;
         public static JScrollPane 	BooksTblJSP = new JScrollPane();
         public static Statement stmtBooks;
	 public static ResultSet rsBooks;

	 public static String sSQL;
	 public static String Content[][];

	 public static int rowNum = 0;
	 public static int total = 0;

	 boolean goEOF;



	JLabel  lblHeader	 	 = new JLabel();
	JLabel  lblIcon		 	 = new JLabel();
	JLabel  lblCaption		 = new JLabel("IMPORTANT: All Fields are required.");
	JLabel  lblSearchFor	 = new JLabel("Search For:");
	JLabel 	lblSearchIn 	 = new JLabel("Look In:");

	JTextField txtSearchFor  = new JTextField();
	JComboBox cbSearchIn;

	String sFilter;

        String DBDriver = "com.mysql.jdbc.Driver";
	String DBSource = "jdbc:mysql://localhost:3306/Books";
	String DBUserName = "root";
	String DBPassword = "";
	Connection conn;


         Functions module_func = new Functions();

	public SearchBook()
	{
		super("Search");

		//sFilter = sSearch;


		String sBooks[]={"Books_No","Books_Name","Author_Name","Copy_of_Book"};

		if(sFilter == "Books"){cbSearchIn = new JComboBox(sBooks);}

		module_func.setJComboBox(cbSearchIn,110,72,225,20);
		module_func.setJTextField(txtSearchFor,110,50,225,20);



		module_func.setJLabel(lblCaption,60,2,500,40);
			lblCaption.setFont(new Font("Dialog", Font.BOLD, 12));
			lblCaption.setForeground(new Color(255,255,255));
		module_func.setJLabel(lblHeader,0,0,500,40);
		module_func.setJLabel(lblIcon,5,2,50,40);
		module_func.setJLabel(lblSearchFor,5,50,105,20);
		module_func.setJLabel(lblSearchIn,5,72,105,20);

		module_func.setJButton(bttnExit,235,100,100,24,"exit","Unload Form");
		module_func.setJButton(bttnSearch,135,100,100,24,"search","Search");
		bttnExit.setMnemonic(KeyEvent.VK_C);
		bttnSearch.setMnemonic(KeyEvent.VK_S);
		bttnExit.addActionListener(JBActionListener);
		bttnSearch.addActionListener(JBActionListener);


		jpnlMain.add(cbSearchIn);

		jpnlMain.add(txtSearchFor);

		jpnlMain.add(lblCaption);
		jpnlMain.add(lblIcon);
		jpnlMain.add(lblHeader);
		jpnlMain.add(lblSearchFor);
		jpnlMain.add(lblSearchIn);

		jpnlMain.add(bttnExit);
		jpnlMain.add(bttnSearch);

		jpnlMain.setBackground(Color.WHITE);
		jpnlMain.setLayout(null);

		getContentPane().setLayout(new BorderLayout(0,0));
		getContentPane().add(BorderLayout.CENTER, jpnlMain);

		setSize(350,160);
		setResizable(false);
		setLocation((screen.width - 350)/2,((screen.height-170)/2));

	}

	ActionListener JBActionListener = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			String srcObj = e.getActionCommand();
			if(srcObj=="search")
			{
				 if(sFilter == "Books")
				{
					reloadRecord("select * from tblBooks where " + cbSearchIn.getSelectedItem().toString().replaceAll(" ", "") + " LIKE '%" + txtSearchFor.getText() + "%' ORDER BY Books_No ASC");
					dispose();
				}
                        }
			else if(srcObj=="exit"){dispose();}
		}
	};
        public static void reloadRecord(String srcSQL)
	{
		sSQL = srcSQL;
		BooksTblJSP.getViewport().remove(JTBooksTbl);
		JTBooksTbl=CreateTable();
		BooksTblJSP.getViewport().add(JTBooksTbl);
		jpnlMain.repaint();
	}

        public static  JTable CreateTable(){
		String ColumnHeaderName[] = {
			"Books_No","Books_Name","Author_Name", "Copy_of_book"
		};
		try{
			rsBooks = stmtBooks.executeQuery(sSQL);
			total = 0;

			rsBooks.afterLast();

			if(rsBooks.previous())total = rsBooks.getRow();

			rsBooks.beforeFirst();
			if(total != 0){
				Content = new String[total][5];
				while(rsBooks.next())
				{
					Content[rowNum][0] = "" + rsBooks.getString("Books_No");
					Content[rowNum][1] = "" + rsBooks.getString("Books_Name");
					Content[rowNum][2] = "" + rsBooks.getString("Author_Name");
					Content[rowNum][3] = "" + rsBooks.getString("Copy_of_book");
					rowNum++;
				}
			}else{
				Content = new String[0][5];
				Content[0][0] = " ";
				Content[0][1] = " ";
				Content[0][2] = " ";
				Content[0][3] = " ";
			}
		}catch(Exception eE){
		}
		JTable NewTable = new JTable (Content,ColumnHeaderName){
			public boolean isCellEditable (int iRows, int iCols) {
				return false;
			}
		};

		NewTable.setPreferredScrollableViewportSize(new Dimension(708, 323));
		NewTable.setBackground(Color.white);


		NewTable.getColumnModel().getColumn(0).setMinWidth(0);
		NewTable.getColumnModel().getColumn(0).setPreferredWidth(100);
		NewTable.getColumnModel().getColumn(1).setPreferredWidth(100);
		NewTable.getColumnModel().getColumn(2).setPreferredWidth(150);
		NewTable.getColumnModel().getColumn(3).setPreferredWidth(100);


		ColumnHeaderName=null;
		Content=null;

		rowNum = 0;

		return NewTable;
	}
          public static void main(String args[]) {

              SearchBook sb = new SearchBook();
          }

}
