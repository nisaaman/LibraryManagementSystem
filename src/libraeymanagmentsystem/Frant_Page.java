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

public class Frant_Page extends javax.swing.JFrame {
       
    public Frant_Page() {
        super("ADMINISTRATOR PAGE");
        super.setIconImage(new ImageIcon("c:\\@imgs\\Admin.jpg").getImage());

        initComponents();
    }



    private void initComponents() {
        headimg = new javax.swing.JLabel(new ImageIcon("c:\\@imgs\\pstuslide.gif"));
        heading = new javax.swing.JLabel();
        heading1 = new javax.swing.JLabel();
		ldate = new javax.swing.JLabel();
		ddate = new javax.swing.JLabel();
        heading2 = new javax.swing.JLabel();
        heading3 = new javax.swing.JLabel();
        adminlog = new javax.swing.JButton("LOGIN",new ImageIcon("C:\\@imgs\\login.jpg"));
        liblog = new javax.swing.JButton("LOGIN",new ImageIcon("C:\\@imgs\\login.jpg"));
        userlog = new javax.swing.JButton("LOGIN",new ImageIcon("C:\\@imgs\\login.jpg"));
        jButton1 = new javax.swing.JButton("EXIT",new ImageIcon("C:\\@imgs\\_cancel.gif"));
	bookdetail = new javax.swing.JButton("BOOK'S TABLE",new ImageIcon("C:\\@imgs\\book.gif"));
	search = new javax.swing.JButton("SEARCH BOOK",new ImageIcon("C:\\@imgs\\search.jpg"));

        getContentPane().setLayout(null);
        getContentPane().setBackground(new java.awt.Color(204,255,204));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        
        setForeground(new java.awt.Color(254, 215, 3));
        heading.setFont(new java.awt.Font("Tahoma", 3, 48));
        heading.setForeground(new java.awt.Color(102, 0, 102));
        heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heading.setText("CENTERAL LIBRARY IN");
        getContentPane().add(heading);
        heading.setBounds(10, 10,600,100);

        
        getContentPane().add(headimg);
        headimg.setBounds(620, 10, 237, 95);

        heading1.setFont(new java.awt.Font("Swis721 BlkOul BT", 3, 24));
        heading1.setForeground(new java.awt.Color(51,0,153));
        heading1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        heading1.setText("ADMINISTRATOR LOGIN :");
        getContentPane().add(heading1);
        heading1.setBounds(160, 180, 350, 30);


        ldate.setFont(new java.awt.Font("Swis721 BlkOul BT", 3,24));
        ldate.setForeground(new java.awt.Color(51,0,153));
        ldate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	ldate.setText("DATE  : ");
        getContentPane().add(ldate);
        ldate.setBounds(550,120,120,30);


	ddate.setFont(new java.awt.Font("Swis721 BlkOul BT", 3,24));
        ddate.setForeground(new java.awt.Color(51, 0,153));
        ddate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	ddate.setText(datt);
        getContentPane().add(ddate);
        ddate.setBounds(700,100,250,70);

		
        heading2.setFont(new java.awt.Font("Swis721 BlkOul BT", 3, 24));
        heading2.setForeground(new java.awt.Color(51,0,153));
        heading2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        heading2.setText("LIBRARIAN  LOGIN : ");
        getContentPane().add(heading2);
        heading2.setBounds(160, 250, 290, 30);

        heading3.setFont(new java.awt.Font("Swis721 BlkOul BT", 3, 24));
        heading3.setForeground(new java.awt.Color(51,0,153));
        heading3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        heading3.setText("USER LOGIN : ");
        getContentPane().add(heading3);
        heading3.setBounds(160, 310, 210, 30);

        adminlog.setForeground(new java.awt.Color(153, 0, 204));
        adminlog.setToolTipText("Administrator Login ");
		adminlog.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent evt)
			{
				    setVisible(false);
					AdminLogin adlog= new AdminLogin();

            }
        });
        getContentPane().add(adminlog);
        adminlog.setBounds(570, 180, 120, 30);

        liblog.setForeground(new java.awt.Color(153, 0, 204));
        liblog.setToolTipText("Librarian Login");
		liblog.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent evt)
			{
				    setVisible(false);
					stafflog stf=new stafflog();

            }
        });
        getContentPane().add(liblog);
        liblog.setBounds(570, 250, 120, 30);

        
                userlog.setForeground(new java.awt.Color(153, 0, 204));
		userlog.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent evt)
			{
				   setVisible(false);
					userlogin ull=new userlogin();

            }
        });
        getContentPane().add(userlog);
        userlog.setBounds(570, 310, 120, 30);

        jButton1.setForeground(new java.awt.Color(153,0,153));
        jButton1.setToolTipText("EXIT");
		jButton1.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent evt)
			{

				    setVisible(false);
					FirstPage1 fppp=new FirstPage1();

            }
        });
		getContentPane().add(jButton1);
        jButton1.setBounds(700, 440, 150, 50);

        bookdetail.setForeground(new java.awt.Color(51,0,153));
        bookdetail.setToolTipText("click to see all the book");
		bookdetail.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent evt)
			{

                   BooksList bkList = new BooksList();
	}
        });
        getContentPane().add(bookdetail);
        bookdetail.setBounds(60, 440, 200, 30);

		
	search.setForeground(new java.awt.Color(51,0,153));
        search.setToolTipText("click to search book");
		search.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent evt)
			{


                             SearchBook bk =new SearchBook();

            }
        });
        getContentPane().add(search);
        search.setBounds(60, 480, 200, 30);



        pack();
		setSize(1000,600);
		setLocation(50,50);
		setVisible(true);
    }


    public static void main(String args[]) {

                  mdate dd=new mdate();
		  dd.ccdate();
		  datt=dd.todaydate.toString();

		  System.out.println(datt);

        Frant_Page fp=new Frant_Page();
    }


    private javax.swing.JButton adminlog;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel headimg;
    private javax.swing.JLabel heading1;
	private javax.swing.JLabel ldate;
	private javax.swing.JLabel ddate;
    private javax.swing.JLabel heading2;
    private javax.swing.JLabel heading3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton liblog;
    private javax.swing.JButton userlog;
	private javax.swing.JButton bookdetail;
	
	private javax.swing.JButton search;
	private  static String datt;

	


		}

