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


import javax.swing.*;



public class TableDisp extends JFrame {

	private JPanel pBook = new JPanel ();
	private JScrollPane scroller;
	private JTable table;
	public TableDisp(JTable j)
	{
	super("Table Display");


		setSize(700,300);
		setLocation(100,300);
		pBook.setLayout (null);
		table=j;
		scroller = new JScrollPane (table);	
		scroller.setBounds (20, 50, 460, 200);	
		pBook.add(scroller);
		getContentPane().add (pBook, BorderLayout.CENTER);
		setVisible(true);
	}

}