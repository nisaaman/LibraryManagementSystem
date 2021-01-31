/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package libraeymanagmentsystem;

/**
 *
 * @author NISA'S PC
 */
import java.beans.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.plaf.metal.*;

public class Books extends JFrame implements ActionListener,InternalFrameListener
{

	JDesktopPane desktop = new JDesktopPane();
	JLabel StatusLabel = new JLabel("Library Manegement By Nisa,Hafsa,Rinki",JLabel.CENTER);

	JMenuBar menubar = new JMenuBar();
        JMenu mnuFile =  new JMenu("File");
	JMenu mnuHelp =  new JMenu("Help");

	JMenuItem itmBooks = new JMenuItem();
	JMenuItem itmExit = new JMenuItem();



	String DBDriver = "com.mysql.jdbc.Driver";
	String DBSource = "jdbc:mysql://localhost:3306/Books";
	String DBUserName = "root";
	String DBPassword = "";
	Connection conn;




	frmBooks objBooks;


	public static void main(String[] args)
        {

		new Books();
	}

	public Books ()
	{
		super("PATUAKHALI SCIENCE & TECHNOLOGY UNIVERSITY [LIBRARY  SYSTEM]");
		StatusLabel.setFont(new Font("Dialog", Font.PLAIN, 12));

		desktop.setBackground(Color.GRAY);
		desktop.setBorder(BorderFactory.createLoweredBevelBorder());
		desktop.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);

		getContentPane().add(CreateJToolBar(),BorderLayout.PAGE_START);
		getContentPane().add(desktop,BorderLayout.CENTER);
		getContentPane().add(StatusLabel,BorderLayout.PAGE_END);

		addWindowListener(new WindowAdapter(){
      	        public void windowClosing(WindowEvent e){UnloadWindow();}});

		setJMenuBar(CreateJMenuBar());
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                setIconImage(new ImageIcon("FRNT_ico.gif").getImage());
                setLocation(0,0);
		setSize(1200,800);
		setResizable(true);
		setVisible(true);
		show();

		try
		{
			Class.forName(DBDriver);
			conn = DriverManager.getConnection(DBSource,DBUserName ,DBPassword);
		}
		catch(ClassNotFoundException e)
		{
 			System.err.println("Failed to load driver");
 			e.printStackTrace();
 			System.exit(1);
 		}
 		catch(SQLException e)
 		{
 			System.err.println("Unable to connect");
 			e.printStackTrace();
 			System.exit(1);
 		}



	}

	protected JMenuBar CreateJMenuBar()
	{



		mnuFile.setMnemonic('F');
		mnuHelp.setMnemonic('H');

		menubar.add(setJMenu(mnuFile));
		menubar.add(setJMenu(mnuHelp));



			itmBooks.setAccelerator(KeyStroke.getKeyStroke
			(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
			itmExit.setAccelerator(KeyStroke.getKeyStroke
			(KeyEvent.VK_X,ActionEvent.CTRL_MASK));

		        mnuFile.add(setJMenuItem(itmBooks,"Books","c:\\@imgs\\books_ico.gif"));
			mnuFile.add(setJMenuItem(itmExit,"Exit Application","c:\\@imgs\\_cancel.gif"));

                        itmBooks.addActionListener(this);
			itmExit.addActionListener(this);

		menubar.setBackground(new Color(255,255,255));
		return menubar;
	}

	protected JMenu setJMenu(JMenu menu)
	{
		menu.setFont(new Font("Dialog", Font.BOLD, 12));
		menu.setBackground(new Color(255,255,255));
		return menu;
	}
        protected JMenuItem setJMenuItem(JMenuItem mnuitem, String sCaption,String imgLocation)
	{


		mnuitem.setText(sCaption);
                mnuitem.setIcon(new ImageIcon(imgLocation));
		mnuitem.setFont(new Font("Dialog", Font.PLAIN, 12));
		mnuitem.setBackground(new Color(255,255,255));
		return 	mnuitem;

	}

	protected JToolBar CreateJToolBar()
        {
		JToolBar toolbar = new JToolBar("Toolbar");

		toolbar.setMargin(new Insets(0,0,0,0));


		toolbar.add(CreateJToolbarButton("Books Records","tlBooks"));
		toolbar.setBackground(new Color(255,255,255));
		return toolbar;

	}

	protected JButton CreateJToolbarButton(String srcToolTipText,String srcActionCommand)
	{
		JButton NewJButton = new JButton();

		NewJButton.setActionCommand(srcActionCommand);
		NewJButton.setToolTipText(srcToolTipText);
		NewJButton.setBackground(new Color(255,255,255));
		NewJButton.addActionListener(JToolBarActionListener);
		return NewJButton;
	}

	ActionListener JToolBarActionListener = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			String srcObject = e.getActionCommand();

			if(srcObject=="tlBooks")
			{
				try{loadBooks();}
				catch(SQLException sqle){}
			}


		}
	};


    protected void loadBooks() throws SQLException
	{
		boolean load_books = isLoaded("Books Records");
		if(load_books == false)
		{
			objBooks = new frmBooks(conn, this);
			desktop.add(objBooks);

			objBooks.setVisible(true);
			objBooks.show();
		}else
		{
			try{
				objBooks.setIcon(false);
				objBooks.setSelected(true);
			}catch(PropertyVetoException e){
			}
		}
	}


	private void menubar_actionPerformed(ActionEvent event, int intWhich)
	{
		switch(intWhich)
		{
			case 0:
				UnloadWindow();
				break;

			case 1:
				try{loadBooks();}
				catch(SQLException sqle){}
				break;

		}
	}

	public void actionPerformed(ActionEvent event)
	{
		Object object = event.getSource();
		 if(object == itmBooks){menubar_actionPerformed(event,1);}
	         else if(object == itmExit){menubar_actionPerformed(event,0);}
	}

	protected boolean isLoaded(String FormTitle) {

		JInternalFrame Form[] = desktop.getAllFrames();
		for (int i = 0; i < Form.length; i++) {
			if (Form[i].getTitle().equalsIgnoreCase (FormTitle)) {
				Form[i].show ();
				try{
					Form[i].setIcon(false);
					Form[i].setSelected(true);
				}catch(PropertyVetoException e){
				}
				return true;
			}
		}
		return false;
	}

	protected void UnloadWindow()
	{
		try
		{
	    	int reply = JOptionPane.showConfirmDialog(this,
	    	                                          "Are you sure you want to exit?",
	    	                                          "Library System " ,
	    	                                          JOptionPane.YES_NO_OPTION,
	    	                                          JOptionPane.WARNING_MESSAGE);

			if (reply == JOptionPane.YES_OPTION)
			{
				conn.close();
		    	setVisible(false);
		    	dispose();
		    	System.exit(0);
			}
		}
		catch(Exception e) {}
	}

	public void internalFrameClosing(InternalFrameEvent e){UnloadWindow();}
	public void internalFrameClosed(InternalFrameEvent e){}
	public void internalFrameOpened(InternalFrameEvent e){}
	public void internalFrameIconified(InternalFrameEvent e){}
	public void internalFrameDeiconified(InternalFrameEvent e){}
	public void internalFrameActivated(InternalFrameEvent e){}
	public void internalFrameDeactivated(InternalFrameEvent e){}

}