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

public class AdminLogin extends javax.swing.JFrame {


    public AdminLogin() {
        super("Administrator Login");
        super.setIconImage(new ImageIcon("C:\\@imgs\\Admin Log_icon.jpg").getImage());
        initComponents();
    }



    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        userid = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        update = new javax.swing.JButton();
        finish = new javax.swing.JButton();

        getContentPane().setLayout(null);
        getContentPane().setBackground(new java.awt.Color(255,255,204));




        jLabel1.setFont(new java.awt.Font("Swis721 BlkOul BT", 3, 24));
        jLabel1.setForeground(new java.awt.Color(102, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("USER ID :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 100, 150, 30);

        jLabel2.setFont(new java.awt.Font("Swis721 BlkOul BT", 3, 24));
        jLabel2.setForeground(new java.awt.Color(102, 0, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("PASSWORD :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 150, 180, 30);

        jLabel6.setFont(new java.awt.Font("Jokerman", 3, 36));
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ADMINISTRATOR LOGIN");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 20, 500, 40);

        userid.setFont(new java.awt.Font("Tahoma", 0, 14));
        getContentPane().add(userid);
        userid.setBounds(220, 100, 170, 25);

        password.setFont(new java.awt.Font("Tahoma", 0, 14));
        password.setEchoChar('*');
        getContentPane().add(password);
        password.setBounds(220, 150, 170, 25);

        update.setText("LOGIN");
		update.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent evt)
			{

					if( userid.getText().equals(""))
					{
					JOptionPane.showMessageDialog((Component) null, "Plese Enter \n login and password ", "Login Error", JOptionPane.INFORMATION_MESSAGE);
					}
					else{
					     verifyAdmLogin();

					     }
					}
        });
        update.setToolTipText("CLICK TO LOGIN");
        getContentPane().add(update);
        update.setBounds(450, 100, 80, 30);

        finish.setText("EXIT");
		finish.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent evt)
			{
		                setVisible(false);
				Frant_Page fp = new Frant_Page();
			}
        });
        finish.setToolTipText("CLICK TO EXIT");
         getContentPane().add(finish);
        finish.setBounds(450, 150, 80, 30);

      
        pack();
		setSize(600,300);
		setVisible(true);
		setLocation(200,200);
    }


    public static void main(String args[]) {
        AdminLogin adlog = new AdminLogin();

    }


    private javax.swing.JButton finish;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton update;
    private javax.swing.JTextField userid;

   

	void verifyAdmLogin()
		{
				Connection con=null;

                                String DBDriver = "com.mysql.jdbc.Driver";
	                        String DBUrl = "jdbc:mysql://localhost:3306/LibraryManegment";
	                        String DBUserName = "root";
	                        String DBPassword = "";

                                Statement st=null;

			  try
			  {

						 String val1 = userid.getText();
						 val1=val1.trim();
					         String val2 =  (String)password.getText();
						 val2 =  val2.trim();



					Class.forName(DBDriver);

			   		con=DriverManager.getConnection(DBUrl,DBUserName,DBPassword);

			   		st = con.createStatement();


				ResultSet rs=st.executeQuery("select Password from AdminLog where UserId='"+val1+"'");


				while(rs.next()){
					String user = rs.getString(1);
					System.out.println(user);

					boolean b=user.equals(val2);



					if(b)
					{
					setVisible(false);
					AdminPage aaa=new AdminPage();
					}
					 else
					{




						JOptionPane.showMessageDialog((Component) null, "Invalid \n password. Please enter again. ", "Login Error", JOptionPane.INFORMATION_MESSAGE);
						setVisible(false);
						AdminLogin alog=new AdminLogin();


					}

					}



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
			  finally {
			  con=null;
			  }
		}

}
