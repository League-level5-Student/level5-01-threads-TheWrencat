package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot one = new Robot(100, 700);
		Robot two = new Robot(200, 800);
		Robot three = new Robot(300, 700);
		Robot four = new Robot(400, 800);
		Robot five = new Robot(500, 700);
		
		one.setSpeed(10);
		one.setPenColor(Color.BLUE);
		one.penDown();
		
		two.setSpeed(10);
		two.setPenColor(Color.YELLOW);
		two.penDown();
		
		three.setSpeed(10);
		three.setPenColor(Color.BLACK);
		three.penDown();
		
		four.setSpeed(10);
		four.setPenColor(Color.green);
		four.penDown();
		
		five.setSpeed(10);
		five.setPenColor(Color.RED);
		five.penDown();
		
		Thread r1 = new Thread(()->{
			for(int i = 0; i < 180; i++) {
				one.move(3);
				one.turn(2);
				
			}
			one.move(200);
		});
		Thread r2 = new Thread(()->{
			for(int i = 0; i < 180; i++) {
				two.move(3);
				two.turn(2);
			}
			two.move(200);
		});
		Thread r4 = new Thread(()->{
			for(int i = 0; i < 180; i++) {
				four.move(3);
				four.turn(2);
			}	
			four.move(200);
		});
		Thread r3 = new Thread(()->{
			for(int i = 0; i < 180; i++) {
				three.move(3);
				three.turn(2);
			}
			three.move(200);
		});Thread r5 = new Thread(()->{
			for(int i = 0; i < 180; i++) {
				five.move(3);
				five.turn(2);
			}	
			five.move(200);
		});
		r1.start();
		r2.start();
		r3.start(); 			
		r4.start();
		r5.start();
	}
	
}

