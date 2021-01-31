/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package libraeymanagmentsystem;

/**
 *
 * @author NISA'S PC
 */

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class frmBooks extends JInternalFrame implements ActionListener
{
	public static JScrollPane 	BooksTblJSP = new JScrollPane();
	public static JPanel 		jpnlMain  	= new JPanel();
	public static JTable 		JTBooksTbl;

	Connection cnBooks;

	public static Statement stmtBooks;
	public static ResultSet rsBooks;

	public static String sSQL;
	public static String Content[][];

	public static int rowNum = 0;
	public static int total = 0;

	boolean goEOF;

	Dimension screen 	= 	Toolkit.getDefaultToolkit().getScreenSize();




        JButton bttnSearch 	= new JButton("Search", new ImageIcon("c:\\@imgs\\search.gif"));

	JButton bttnExit   	= new JButton("Cancel", new ImageIcon("c:\\@imgs\\cancel.gif"));

	JLabel  lblHeader	= new JLabel();
	JLabel  lblIcon		= new JLabel();


	JFrame JFParentFrame;

	Functions module_func = new Functions();


	public frmBooks(Connection conn, JFrame getParentFrame) throws SQLException
	{
		super("Books Records",false,true,false,true);

		jpnlMain.setBackground(Color.WHITE);
		jpnlMain.setLayout(null);

		JFParentFrame = getParentFrame;

		cnBooks = conn;
		stmtBooks = cnBooks.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		sSQL = "select * from tblBooks ORDER BY Books_No ASC";


		JTBooksTbl = CreateTable();
		BooksTblJSP.getViewport().add(JTBooksTbl);
		BooksTblJSP.setBounds(5,55,708,323);
		jpnlMain.add(BooksTblJSP);


		module_func.setJButton(bttnSearch,313,390,99,25,"search","Search");
		bttnSearch.setMnemonic(KeyEvent.VK_S);
		bttnSearch.addActionListener(JBActionListener);



		module_func.setJButton(bttnExit,614,390,99,25,"exit","Unload Form");
		bttnExit.setMnemonic(KeyEvent.VK_C);
		bttnExit.addActionListener(JBActionListener);

                lblHeader.setIcon(new ImageIcon("c:\\@imgs\\Barrowers Records.gif"));
		lblIcon.setIcon(new ImageIcon("c:\\@imgs\\bookslist.gif"));

		module_func.setJLabel(lblHeader,0,0,750,40);
		module_func.setJLabel(lblIcon,5,2,50,40);

		//Add Labels


		jpnlMain.add(lblIcon);
		jpnlMain.add(lblHeader);

                jpnlMain.add(bttnSearch);

		jpnlMain.add(bttnExit);

		getContentPane().setLayout(new BorderLayout(0,0));
		getContentPane().add(BorderLayout.CENTER, jpnlMain);


		setSize(728,450);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setLocation((screen.width - 728)/2,((screen.height-450)/2)-45);
	}

	ActionListener JBActionListener = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			String srcObj = e.getActionCommand();
			if(srcObj=="search")
			{
				JDialog JDSearch = new SearchBook(JFParentFrame, "Books");
				JDSearch.show();
			}

			else if(srcObj=="exit"){dispose();}
		}
	};

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

	public static void reloadRecord(String srcSQL)
	{
		sSQL = srcSQL;
		BooksTblJSP.getViewport().remove(JTBooksTbl);
		JTBooksTbl=CreateTable();
		BooksTblJSP.getViewport().add(JTBooksTbl);
		jpnlMain.repaint();
	}

	public void actionPerformed(ActionEvent event)
	{
		setVisible(false);
		dispose();
	}

}
