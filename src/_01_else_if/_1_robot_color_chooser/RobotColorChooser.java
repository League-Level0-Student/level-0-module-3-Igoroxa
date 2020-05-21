
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot igor = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		igor.setSpeed(100);
		igor.penDown();
		igor.move(100);
		igor.turn(90);
		igor.move(100);
		igor.turn(90);
		igor.move(100);
		igor.turn(90);
		igor.move(100);
		igor.turn(90);
		//3. Set the pen width to 10
		igor.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		String color = JOptionPane.showInputDialog("What color do you want to draw with? Red or Blue");
		//5. Use an if/else statement to set the pen color that the user requested
	if (color.equalsIgnoreCase("red")) {
			igor.setPenColor(255,0,0);
		
		}
		else if ((color.equalsIgnoreCase("blue"))){
		igor.setPenColor(0,0,255);	
		}igor.penDown();
	igor.move(100);
	igor.turn(90);
	igor.move(100);
	igor.turn(90);
	igor.move(100);
	igor.turn(90);
	igor.move(100);
	igor.turn(90);
	
	 { 
		igor.setPenColor(0,255,0);
	}
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
