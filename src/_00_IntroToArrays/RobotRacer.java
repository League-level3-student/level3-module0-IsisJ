package _00_IntroToArrays;


import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class RobotRacer {

	public static void main(String[] args) {
		
		int finishLine = 1000;
		Random ranNum = new Random();
		int randomSpeed = ranNum.nextInt(20);
		
		Robot[] robots = new Robot[5];
		for(int i=0; i< robots.length; i++){
			robots[i]= new Robot();
			robots[i].moveTo((i*170)+100,500);
		}
		 
		for(int i=0; i< robots.length; i++){
			robots[i].setSpeed(randomSpeed);
			robots[i].move(finishLine);
		}
		
		
		
		
	}
	
	
}
