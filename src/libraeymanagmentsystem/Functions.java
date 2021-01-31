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

 public class Functions
 {
 	public JButton setJButton(JButton bttn, int sLeft, int sTop, int sWidth, int sHeight, String setActionCmd, String srcToolTipText)
	{
		bttn.setBounds(sLeft,sTop,sWidth, sHeight);
		bttn.setFont(new Font("Dialog", Font.PLAIN, 12));
		bttn.setBackground(new Color(255,255,255));
		bttn.setToolTipText(srcToolTipText);
		bttn.setActionCommand(setActionCmd);
		return bttn;
	}

	public JLabel setJLabel(JLabel lbl, int sLeft, int sTop, int sWidth, int sHeight)
	{
		lbl.setBounds(sLeft,sTop,sWidth, sHeight);
		lbl.setFont(new Font("Dialog",Font.PLAIN,12));
		lbl.setBackground(new Color(255,255,255));
		return lbl;
	}

	public JTextField setJTextField(JTextField txtfield, int sLeft, int sTop, int sWidth, int sHeight)
	{
		txtfield.setBounds(sLeft,sTop,sWidth, sHeight);
		txtfield.setFont(new Font("Dialog",Font.PLAIN,12));
		txtfield.setBackground(new Color(255,255,255));
		return txtfield;
	}



	public JComboBox setJComboBox(JComboBox cbField, int sLeft, int sTop, int sWidth, int sHeight)
	{
		cbField.setBounds(sLeft,sTop,sWidth, sHeight);
		cbField.setFont(new Font("Dialog",Font.PLAIN,12));
		cbField.setBackground(new Color(255,255,255));
		return cbField;
	}


 }
