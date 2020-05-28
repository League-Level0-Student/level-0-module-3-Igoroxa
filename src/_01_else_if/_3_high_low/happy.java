package _01_else_if._3_high_low;

import javax.swing.JOptionPane;

public class happy {
public static void main(String[] args) {
	String question1 = JOptionPane.showInputDialog("ARE YOU HAPPY?");
			if( question1.equalsIgnoreCase("no")){
				
			
			 {JOptionPane.showMessageDialog(null, "DO WHATEVER YOU ARE DOING");
				String question2 = JOptionPane.showInputDialog("DO YOU WANT TO BE HAPPY");
				if (question2.equalsIgnoreCase("yes")){
					JOptionPane.showMessageDialog(null, "CHANGE SOMETHING");
				}
					else { JOptionPane.showMessageDialog(null, "DO WAHTEVER YOU ARE DOING");
					}}}}}