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
import java.util.*;
import java.io.*;

public class NewBook extends javax.swing.JFrame {


    public NewBook() {

        copy_of_book();
    }


    private void copy_of_book() {
        book_no = new javax.swing.JLabel();
        book_name = new javax.swing.JLabel();
        auther_name = new javax.swing.JLabel();
        catagory_name = new javax.swing.JLabel();
        about_book = new javax.swing.JLabel();
        copy_of_book_name = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bookno = new javax.swing.JTextField();
        bookname = new javax.swing.JTextField();
        auther = new javax.swing.JTextField();
        catagory = new javax.swing.JTextField();
        copy_of_book = new javax.swing.JTextField();
        aboutbook = new javax.swing.JTextField();
        addbook = new javax.swing.JButton();
        finish = new javax.swing.JButton();

        getContentPane().setLayout(null);

    
        setTitle("NEW BOOK");
        setFont(new java.awt.Font("Arial", 1, 14));
        book_no.setFont(new java.awt.Font("Swis721 BlkOul BT", 3, 24));
        book_no.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        book_no.setText("BOOK No:");
        book_no.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(book_no);
        book_no.setBounds(80, 70, 150, 30);

        book_name.setFont(new java.awt.Font("Tahoma", 1, 14));
        book_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        book_name.setText("BOOK NAME");
        book_name.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(book_name);
        book_name.setBounds(80, 110, 150, 30);

        auther_name.setFont(new java.awt.Font("Tahoma", 1, 14));
        auther_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        auther_name.setText("AUTHER");
        auther_name.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(auther_name);
        auther_name.setBounds(80, 160, 150, 30);

        copy_of_book_name.setFont(new java.awt.Font("Tahoma", 1, 14));
        copy_of_book_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copy_of_book_name.setText("COPY_OF_BOOK");
        copy_of_book_name.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(copy_of_book_name);
        copy_of_book_name.setBounds(80, 210, 150, 30);

        catagory_name.setFont(new java.awt.Font("Tahoma", 1, 14));
        catagory_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        catagory_name.setText("CATEGORY");
        catagory_name.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(catagory_name);
        catagory_name.setBounds(80, 260, 150, 30);

       

        about_book.setFont(new java.awt.Font("Tahoma", 1, 14));
        about_book.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        about_book.setText("ABOUT THE BOOK");
        about_book.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(about_book);
      //  about_book.setBounds(30, 260, 160, 25);

        jLabel6.setBackground(new java.awt.Color(255, 255, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ADD THE BOOK'S DETAILS");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 30, 420, 20);

        bookno.setFont(new java.awt.Font("Tahoma", 1, 14));
        getContentPane().add(bookno);
        bookno.setBounds(270, 70, 160, 30);

        bookname.setFont(new java.awt.Font("Tahoma", 1, 14));
        getContentPane().add(bookname);
        bookname.setBounds(270, 110, 160, 30);

        auther.setFont(new java.awt.Font("Tahoma", 1, 14));
        getContentPane().add(auther);
        auther.setBounds(270, 160, 160, 30);

        copy_of_book.setFont(new java.awt.Font("Tahoma", 1, 14));
        getContentPane().add(copy_of_book);
        copy_of_book.setBounds(270, 210, 160, 30);

        catagory.setFont(new java.awt.Font("Tahoma", 1, 14));
        getContentPane().add(catagory);
        catagory.setBounds(270, 260, 160, 30);

        aboutbook.setFont(new java.awt.Font("Tahoma", 1, 14));
        getContentPane().add(aboutbook);
       //aboutbook.setBounds(210, 260, 400, 25);

        addbook.setFont(new java.awt.Font("Tahoma", 1, 14));
        addbook.setText("ADD BOOK");
		addbook.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent evt)
			{
			if( bookno.getText().equals(""))
					{
					JOptionPane.showMessageDialog((Component) null, "Plese Enter \n the book detail ", "Login Error", JOptionPane.INFORMATION_MESSAGE);
					}
					else{
					 addbooks();

					}


            }
        });
        getContentPane().add(addbook);
        addbook.setBounds(490, 70, 110, 40);

        finish.setFont(new java.awt.Font("Tahoma", 1, 14));
        finish.setText("FINISH");
		finish.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent evt)
			{
				    setVisible(false);
					//AdminPage app=new AdminPage();

            }
        });
        getContentPane().add(finish);
        finish.setBounds(490, 130, 110, 40);

        pack();
		setSize(630,335);
		setVisible(true);
		setLocation(200,200);
    }
    public static void main(String args[]) {
        NewBook nb=new NewBook();
    }

   
    private javax.swing.JLabel about_book;
    private javax.swing.JTextField aboutbook;
    private javax.swing.JButton addbook;
    private javax.swing.JTextField auther;
    private javax.swing.JLabel auther_name;
    private javax.swing.JLabel book_name;
    private javax.swing.JLabel book_no;
    private javax.swing.JTextField bookname;
    private javax.swing.JTextField bookno;
    private javax.swing.JButton finish;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField catagory;
    private javax.swing.JLabel catagory_name;
    private javax.swing.JTextField copy_of_book;
    private javax.swing.JLabel copy_of_book_name;
   


	void addbooks()
		{
				Connection con=null;

                                String DBDriver = "com.mysql.jdbc.Driver";
	                        String DBUrl = "jdbc:mysql://localhost:3306/library_system";
	                        String DBUserName = "root";
	                        String DBPassword = "";

				
				Statement st=null;

			  try
			  {

					String Book_No =bookno.getText();
					Book_No =  Book_No.trim();

					String Book_Name=bookname.getText();
					Book_Name=Book_Name.trim();

					String Author_Name=auther.getText();
					Author_Name=Author_Name.trim();

                                        String Copy_Of_Books= copy_of_book.getText();
					Copy_Of_Books=Copy_Of_Books.trim();

                                        String Category=catagory.getText();
					Category=Category.trim();

					
					Class.forName(DBDriver);

			   		con=DriverManager.getConnection(DBUrl,DBUserName,DBPassword );

			   		st = con.createStatement();
					mdate dd=new mdate();
	          System.out.println(mdate.todaydatee.toString());
	System.out.println(Book_No);
	String qq="insert into tblbooks(Book_No+,Book_Name,Author_Name,Copy_Of_Books,Category)"+"values('?','?','?','?','?')";
	//String qq="Insert into books values ('"+bk_no+"','"+bk_name+"','"+sub+"','"+at+"','"+det+"')";
	//String qqq="Insert into bookcopy values ('"+bk_no+"','free','user','"+cdate.todaydatee.toString()+"','"+cdate.returndate.toString()+"')";
				int ii=st.executeUpdate(qq);
				//int iii=st.executeUpdate(qqq);

				if(ii>0)
				{
					bookno.setText("");
					bookname.setText("");
				        auther.setText("");
                                        copy_of_book.setText("");
                                        catagory.setText("");
					
					JOptionPane.showMessageDialog((Component) null, "books added", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
			    }
					else
					{

				JOptionPane.showMessageDialog((Component) null, "SORRY try again", "Error", JOptionPane.INFORMATION_MESSAGE);

					}
					//rs.close();
						st.close();
						con.close();
			  }
			  catch(SQLException ex)
			   {
			    System.out.println("Unable to access the database");
			   }
			  catch(ClassNotFoundException ex)
			   {
			    System.out.println("Class not found");
			   }
			  catch(Exception ex)
			  {
               System.out.println("Exception raised is:"+ex);
			  }

		}







}