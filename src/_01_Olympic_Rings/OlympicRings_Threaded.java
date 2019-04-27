package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot one = new Robot(400, 700);
		Robot two = new Robot(800, 700);
		Robot three = new Robot(1200, 700);
		Robot four = new Robot(1600, 700);
		Robot five = new Robot(2000, 700);
		
		one.setSpeed(10);
		two.setSpeed(10);
		three.setSpeed(10);
		four.setSpeed(10);
		five.setSpeed(10);
		
		Thread r1 = new Thread(()->{
			for(int i = 0; i < 360; i++) {
				one.move(1);
				one.turn(1);
			}	
		});
		Thread r2 = new Thread(()->two.move(400));
		Thread r3 = new Thread(()->three.move(400));
		Thread r4 = new Thread(()->four.move(400));
		Thread r5 = new Thread(()->five.move(400));
		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
	}
	
}

