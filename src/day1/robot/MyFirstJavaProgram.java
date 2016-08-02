package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		Robot cam = new Robot();
		cam.penDown();
		cam.setRandomPenColor();
		cam.setSpeed(10);
		for (int i = 0; i < 4; i++) {
			cam.turn(90);
			cam.move(300);
			
		}
		
		
		
	

	
		
		
	}
}
