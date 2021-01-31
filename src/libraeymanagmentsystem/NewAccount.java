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

public class NewAccount extends JFrame {

    Dimension screen = 	Toolkit.getDefaultToolkit().getScreenSize();

    public NewAccount() {
       super("DETAIL OF NEW USER");
       super.setIconImage(new ImageIcon("C:\\@imgs\\users list.gif").getImage());
         initComponents();
    }



    private void initComponents() {
        head1 = new javax.swing.JLabel(new ImageIcon("C:\\@imgs\\logo.png"));
	head2 = new javax.swing.JLabel(new ImageIcon("C:\\@imgs\\pstu.png"));
        head3 = new javax.swing.JLabel(new ImageIcon("C:\\@imgs\\dumki.png"));
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
     
        name = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        mname = new javax.swing.JTextField();
        vname = new javax.swing.JTextField();
        post = new javax.swing.JTextField();
        upz = new javax.swing.JTextField();
        zil = new javax.swing.JTextField();
        vname1 = new javax.swing.JTextField();
        post1 = new javax.swing.JTextField();
        upz1 = new javax.swing.JTextField();
        zil1 = new javax.swing.JTextField();

        update = new javax.swing.JButton();
        finish = new javax.swing.JButton();

         

        getContentPane().setLayout(null);
        getContentPane().setBackground(new java.awt.Color(204,204,204));

        head1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(head1);
        head1.setBounds(10, 10, 174, 235);

        head2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(head2);
        head2.setBounds(200,10, 836, 71);

        head3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(head3);
        head3.setBounds(400,90, 308, 25);

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14));
        jLabel1.setForeground(new java.awt.Color(153, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("1. Name :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 280, 90, 20);

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14));
        jLabel2.setForeground(new java.awt.Color(153, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("2. Father's Name :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 310, 160, 20);

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14));
        jLabel3.setForeground(new java.awt.Color(153, 0, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("3. Mother's Name :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 340, 170, 20);

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14));
        jLabel4.setForeground(new java.awt.Color(153, 0, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("4. Parmanent Address :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(45, 370, 210, 20);

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14));
        jLabel5.setForeground(new java.awt.Color(153, 0, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Village/Town :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(300, 370, 150, 20);

        jLabel6.setFont(new java.awt.Font("Jokerman", 3, 24));
        jLabel6.setForeground(new java.awt.Color(102, 0,102 ));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("LIBRARY CARD INFORMATION");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(350, 150, 450, 20);

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14));
        jLabel7.setForeground(new java.awt.Color(153, 0, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Post :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(650, 370, 80, 20);


        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14));
        jLabel8.setForeground(new java.awt.Color(153, 0, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Upzille :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(300, 400, 150, 20);


        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14));
        jLabel9.setForeground(new java.awt.Color(153, 0, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Zille :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(650, 400, 80, 20);

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14));
        jLabel10.setForeground(new java.awt.Color(153, 0, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("5. Present Address :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(43, 440, 190, 20);

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14));
        jLabel11.setForeground(new java.awt.Color(153, 0, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Village/Town :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(300, 440, 150, 20);
        
        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14));
        jLabel12.setForeground(new java.awt.Color(153, 0, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Post :");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(650, 440, 80, 20);


        jLabel13.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14));
        jLabel13.setForeground(new java.awt.Color(153, 0, 102));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Upzille :");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(300, 470, 150, 20);


        jLabel14.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14));
        jLabel14.setForeground(new java.awt.Color(153, 0, 102));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Zille :");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(650, 470, 80, 20);

        jLabel15.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14));
        jLabel15.setForeground(new java.awt.Color(153, 0, 102));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("6. Admit Session :");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(25, 500, 180, 20);

        jLabel16.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14));
        jLabel16.setForeground(new java.awt.Color(153, 0, 102));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Roll No. :");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(600, 500, 120, 20);

        jLabel17.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14));
        jLabel17.setForeground(new java.awt.Color(153, 0, 102));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("7. Faculty :");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(30, 530, 120, 20);

        name.setFont(new java.awt.Font("Tahoma", 0, 14));
        getContentPane().add(name);
        name.setBounds(330, 280, 450, 25);

        fname.setFont(new java.awt.Font("Tahoma", 0, 14));
        getContentPane().add(fname);
        fname.setBounds(330, 310, 450, 25);

        mname.setFont(new java.awt.Font("Tahoma", 0, 14));
        getContentPane().add(mname);
        mname.setBounds(330, 340, 450, 25);

        vname.setFont(new java.awt.Font("Tahoma", 0, 14));
        getContentPane().add(vname);
        vname.setBounds(470, 370, 200, 25);

        post.setFont(new java.awt.Font("Tahoma", 0, 14));
        getContentPane().add(post);
        post.setBounds(740, 370, 200, 25);

        
        upz.setFont(new java.awt.Font("Tahoma", 0, 14));
        getContentPane().add(upz);
        upz.setBounds(470, 400, 200, 25);

        zil.setFont(new java.awt.Font("Tahoma", 0, 14));
        getContentPane().add(zil);
        zil.setBounds(740, 400, 200, 25);

        vname1.setFont(new java.awt.Font("Tahoma", 0, 14));
        getContentPane().add(vname1);
        vname1.setBounds(470, 440, 200, 25);

        post1.setFont(new java.awt.Font("Tahoma", 0, 14));
        getContentPane().add(post1);
        post1.setBounds(740, 440, 200, 25);


        upz1.setFont(new java.awt.Font("Tahoma", 0, 14));
        getContentPane().add(upz1);
        upz1.setBounds(470, 470, 200, 25);

        zil1.setFont(new java.awt.Font("Tahoma", 0, 14));
        getContentPane().add(zil1);
        zil1.setBounds(740, 470, 200, 25);



        update.setText("UPDATE");
        update.setToolTipText("click to add new account");
		update.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent evt)
			{
				if( name.getText().equals(""))
					{
					JOptionPane.showMessageDialog((Component) null, "Plese Enter \n the details ", "ERROOOOOOOR", JOptionPane.ERROR_MESSAGE);
					}
					else{

					
					 //addnewuser();

					}


            }
        });
        //getContentPane().add(update);
        update.setBounds(530, 200, 80, 30);

        finish.setText("FINISH");
        finish.setToolTipText("click to return");
		finish.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent evt)
			{
				    setVisible(false);
					//AdminPage app=new AdminPage();

            }
        });
        //getContentPane().add(finish);
        finish.setBounds(530, 240, 80, 30);

        pack();

		setSize(1100,800);
		setVisible(true);
		setLocation((screen.width - 1100)/2,((screen.height-800)/2));
              
              
    }

    public static void main(String args[]) {

                NewAccount na=new NewAccount();

    }

   
    //private javax.swing.JTextField branch;
   
    private javax.swing.JButton update;
    private javax.swing.JButton finish;
    private javax.swing.JLabel head1;
    private javax.swing.JLabel head2;
    private javax.swing.JLabel head3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;

    private javax.swing.JTextField name;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField mname;
    private javax.swing.JTextField vname;
    private javax.swing.JTextField post;
    private javax.swing.JTextField upz;
    private javax.swing.JTextField zil;
    private javax.swing.JTextField vname1;
    private javax.swing.JTextField post1;
    private javax.swing.JTextField upz1;
    private javax.swing.JTextField zil1;
    private javax.swing.JTextField admit_ses;
    private javax.swing.JTextField roll;
    private javax.swing.JTextField faculty;
    



/*void addnewuser()
		{
				Connection con=null;
				String url="jdbc:odbc:Nitlibrary";
				Statement st=null;

			  try
			  {

					String user_idd =  userid.getText();
						   user_idd =  user_idd.trim();
					String user_name =  username.getText();
						   user_name =  user_name.trim();
					String brc =  branch.getText();
						   brc =  brc.trim();
					String dep =  department.getText();
						   dep =  dep.trim();
					String cor =  course.getText();
						   cor =  cor.trim();
					String semm =  semester.getText();
						   semm =  semm.trim();


					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

			   		con=DriverManager.getConnection(url);

			   		st = con.createStatement();


				int ii=st.executeUpdate("Insert into usernpasswd values ('"+user_idd+"','nitrkl')");
				int iii=st.executeUpdate("Insert INTO userdata values ('"+user_idd+"','"+user_name+"','"+brc+"','"+dep+"','"+cor+"','"+semm+"',0)");

				if(ii>0)
				{
					userid.setText("");
					JOptionPane.showMessageDialog((Component) null, "NEW USER CREATED", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);


				}
					else
					{
					userid.setText("");
				JOptionPane.showMessageDialog((Component) null, "SORRY TRY AGAIN", "Error", JOptionPane.INFORMATION_MESSAGE);

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
			  finally{
			  con=null;
			  }
		}*/


}
