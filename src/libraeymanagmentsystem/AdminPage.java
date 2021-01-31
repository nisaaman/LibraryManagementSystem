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
import javax.swing.table.*;
public class AdminPage extends javax.swing.JFrame {


    public AdminPage() {
        super("ADMINISTRATOR PAGE");
        super.setIconImage(new ImageIcon("C:\\@imgs\\AdminPage.jpg").getImage());
        initComponents();
    }

    
    private void initComponents() {
        head = new javax.swing.JLabel(new ImageIcon("c:\\@imgs\\CLib.jpg"));
        heading = new javax.swing.JLabel(new ImageIcon("c:\\@imgs\\BANGLA.png"));
        heading1 = new javax.swing.JLabel();
        heading2 = new javax.swing.JLabel();
        heading3 = new javax.swing.JLabel();
        heading4 = new javax.swing.JLabel();
        newaccount = new javax.swing.JButton("ACCOUNT", new ImageIcon("C:\\@imgs\\new.gif"));
        addbooks = new javax.swing.JButton("BOOK",new ImageIcon("C:\\@imgs\\new.gif"));
        deletebooks = new javax.swing.JButton("DELETE BOOK",new ImageIcon("C:\\@imgs\\remove.gif"));
        deleteaccount = new javax.swing.JButton("DELETE ACC.",new ImageIcon("C:\\@imgs\\remove.gif"));
        jButton1 = new javax.swing.JButton("LOG OUT",new ImageIcon("C:\\@imgs\\log_out.gif"));

        getContentPane().setLayout(null);
        getContentPane().setBackground(new java.awt.Color(255,204,204));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        setForeground(new java.awt.Color(254, 215, 3));
        getContentPane().add(heading);
        heading.setBounds(70, 20, 576, 59);

        getContentPane().add(head);
        head.setBounds(160, 80, 405, 72);


        heading1.setFont(new java.awt.Font("Swis721 BlkOul BT", 3, 24));
        heading1.setForeground(new java.awt.Color(0, 51, 153));
        heading1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        heading1.setText("ADD NEW USER ACCOUNT :");
        getContentPane().add(heading1);
        heading1.setBounds(60, 220, 390, 30);

        heading2.setFont(new java.awt.Font("Swis721 BlkOul BT", 3, 24));
        heading2.setForeground(new java.awt.Color(0, 51, 153));
        heading2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        heading2.setText("ADD NEW BOOKS  :");
        getContentPane().add(heading2);
        heading2.setBounds(60, 280, 270, 30);

        heading3.setFont(new java.awt.Font("Swis721 BlkOul BT", 3, 24));
        heading3.setForeground(new java.awt.Color(0, 51, 153));
        heading3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        heading3.setText("DELETE BOOK DETAIL :");
        getContentPane().add(heading3);
        heading3.setBounds(60, 340, 330, 30);

        heading4.setFont(new java.awt.Font("Swis721 BlkOul BT", 3, 24));
        heading4.setForeground(new java.awt.Color(0, 51, 153));
        heading4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        heading4.setText("DELETE USER ACCOUNT :");
        getContentPane().add(heading4);
        heading4.setBounds(60, 400, 360, 30);

        
        newaccount.setForeground(new java.awt.Color(0, 51, 153));
        newaccount.setToolTipText("Click to Create New Account");
		newaccount.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent evt)
			      {
				   
			      NewAccount na=new NewAccount();

                              }
        });
        getContentPane().add(newaccount);
        newaccount.setBounds(460, 220, 150, 30);

       
        addbooks.setForeground(new java.awt.Color(0, 51, 153));
        addbooks.setToolTipText("Adding new Boooks");
		addbooks.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent evt)
			    {
				   
			     NewBook nb=new NewBook();

                            }
        });
        getContentPane().add(addbooks);
        addbooks.setBounds(460, 280, 150, 30);

        deletebooks.setForeground(new java.awt.Color(0, 51, 153));
        deletebooks.setForeground(new java.awt.Color(0, 51, 153));
        deletebooks.setToolTipText("Delete book");
		deletebooks.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent evt)
			        {
				  
				 DeleteBook db=new DeleteBook();

                               }
        });
        getContentPane().add(deletebooks);
        deletebooks.setBounds(460, 340, 150, 30);

        deleteaccount.setForeground(new java.awt.Color(0, 51, 153));
        deleteaccount.setToolTipText("Delete Account");
        deleteaccount.setFocusPainted(false);
		deleteaccount.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent evt)
			        {
				
				 DeleteAccount da=new DeleteAccount();

                                 }
        });
        getContentPane().add(deleteaccount);
        deleteaccount.setBounds(460, 400, 150, 30);

     
        jButton1.setForeground(new java.awt.Color(0, 51, 153));
        jButton1.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent evt)
			{
				    setVisible(false);
					Frant_Page fp = new Frant_Page();

            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(550, 450, 150, 40);

        pack();

		setSize(800,600);
		setLocation(50,50);
		setVisible(true);

    }

   
    public static void main(String args[]) {

               AdminPage ap= new AdminPage();

    }

 
    private javax.swing.JButton addbooks;
    private javax.swing.JButton deleteaccount;
    private javax.swing.JButton deletebooks;
    private javax.swing.JLabel head;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel heading1;
    private javax.swing.JLabel heading2;
    private javax.swing.JLabel heading3;
    private javax.swing.JLabel heading4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton newaccount;

  
}
