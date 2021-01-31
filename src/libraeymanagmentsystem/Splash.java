/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package libraeymanagmentsystem;

/**
 *
 * @author NISA'S PC
 */

import javax.swing.*;
import java.awt.*;

public class Splash extends JWindow implements Runnable{
	public void run(){
		JLabel SplashLabel = new JLabel(new ImageIcon("C:\\@imgs\\fmain.jpg"));
		Dimension screen = 	Toolkit.getDefaultToolkit().getScreenSize();

		getContentPane().add(SplashLabel,BorderLayout.CENTER);

		setSize(1252,865);
		setLocation((screen.width - 1252)/2,((screen.height-865)/2));
		show();
	}
}