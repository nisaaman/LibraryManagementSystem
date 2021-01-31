/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package libraeymanagmentsystem;

/**
 *
 * @author NISA'S PC
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class LibraryProject extends javax.swing.JFrame {
    
    public LibraryProject() {
	super("Library Managment System");
        super.setIconImage(new ImageIcon("c:\\@imgs\\FRNT_ico.gif").getImage());
        initComponents();
		
        }
        JPanel Panel1;
	JDesktopPane Desk1 = new JDesktopPane();

        String DBDriver = "com.mysql.jdbc.Driver";
	String DBSource = "jdbc:mysql://localhost:3306/BookList";
	String DBUserName = "root";
	String DBPassword = "";
	Connection conn;

        Dimension screen = 	Toolkit.getDefaultToolkit().getScreenSize();
	Splash splash = new Splash();

        Thread ThSplash = new Thread(splash);




        private void initComponents() {

	loadSplashScreen();

	splash.dispose();


        jLabel1 = new javax.swing.JLabel(new ImageIcon("C:\\@imgs\\logo.png"));
	jLabel2 = new javax.swing.JLabel(new ImageIcon("C:\\@imgs\\pstu.png"));
        jLabel3 = new javax.swing.JLabel(new ImageIcon("C:\\@imgs\\dumki.png"));
        ldate = new javax.swing.JLabel();
	ddate = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
       
        jButton1 = new javax.swing.JButton();



        getContentPane().setLayout(null);
        getContentPane().setBackground(new java.awt.Color(204, 204, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 174, 235);

        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200,10, 836, 71);

        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel3);
        jLabel3.setBounds(400,90, 308, 25);

        ldate.setFont(new java.awt.Font("Swis721 BlkOul BT", 3,24));
        ldate.setForeground(new java.awt.Color(51,0,153));
        ldate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	ldate.setText("DATE  : ");
        getContentPane().add(ldate);
        ldate.setBounds(650, 120,200, 70);


	ddate.setFont(new java.awt.Font("Swis721 BlkOul BT", 3,24));
        ddate.setForeground(new java.awt.Color(51, 0,153));
        ddate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	ddate.setText(dat);
        getContentPane().add(ddate);
        ddate.setBounds(800,120,250,70);



        jLabel4.setFont(new java.awt.Font("Ravie", 3, 48));
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("WELCOME TO THE");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150,200, 800,110 );

        jLabel5.setFont(new java.awt.Font("Ravie", 3, 48));
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CENTERAL LIBRARY ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150,300,800,110);

       



        jButton1.setFont(new java.awt.Font("Arial Black", 1, 24));
        jButton1.setForeground(new java.awt.Color(102, 102, 0));
        jButton1.setText("ENTER");
		jButton1.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent evt)
			{
				    setVisible(false);
					
					Frant_Page fp = new Frant_Page();

            }
         }
        );


        getContentPane().add(jButton1);
        jButton1.setBounds(700, 500, 210, 50);

        pack();
		setSize(1100,700);
		setLocation(50,50);
		
		setVisible(true);


    }

	protected void loadSplashScreen(){

		ThSplash.start();
		while(!splash.isShowing()){
			try{

				Thread.sleep(3000);
			}catch(InterruptedException e){
			}
		}
	}


    public static void main(String args[]) {

	      mdate dd=new mdate();
		  dd.ccdate();
		  dat=dd.todaydate.toString();

		  System.out.println(dat);

                LibraryProject lp=new LibraryProject();

    }



    
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
 
    private javax.swing.JLabel ldate;
    private javax.swing.JLabel ddate;
    private javax.swing.JButton jButton1;
    
    private  static String dat;


}



