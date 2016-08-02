package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot cam = new Robot();
		// 5. Set your robot's pen to the down position

		// 3. Set the robot to go at max speed (10)
		cam.setSpeed(10);

		// 4. Do the following (steps 6-9) 75 times
		for (int i = 0; i < 1300; i++) { 

			// 7. Change the pen color to random
		
			if (i % 2 == 0) {
				cam.setPenColor(20, 20, 20);
			}
			else {
				cam.setPenColor(250,250,250);
			}
			cam.penDown();
			
		
	         
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
		     cam.move(i);
		     cam.setPenWidth(i * 100);
		 	// 2. Turn the robot 1/3 of 360 degrees to the right
			 cam.turn(360 / 7);
		
	
		
	
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
	
			// 9. Set the pen width to i
		}

	}
}
