package _02_Advanced_Robot_Race;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0.
	// This time, use threads to make all of the robots go at the same time.
	Robot one;
	Robot two;
	Robot three;
	Robot four;
	Robot five;
	String first = "";
	boolean contest = true;
	
	public void roboMaker() {
		Robot one = new Robot(100, 800);
		Robot two = new Robot(200, 800);
		Robot three = new Robot(300, 800);
		Robot four = new Robot(400, 800);
		Robot five = new Robot(500, 800);
		
		one.setSpeed(10);
		two.setSpeed(10);
		three.setSpeed(10);
		four.setSpeed(10);
		five.setSpeed(10);
		
		Thread r1 = new Thread(()->{
			while(one.getY() > 0) {
				Random r = new Random();
				int a = r.nextInt(10);
				one.move(a);
			}
			if(one.getY() <= 0 && contest) {
				first = "one";
				contest = false;
			};
		});
		Thread r2 = new Thread(()->{
			while(two.getY() > 0) {
				Random r = new Random();
				int a = r.nextInt(10);
				two.move(a);
			}
			if(two.getY() <= 0 && contest) {
				first = "two";
				contest = false;

			};
		});
		Thread r3 = new Thread(()->{
			while(three.getY() > 0) {
				Random r = new Random();
				int a = r.nextInt(10);
				three.move(a);
			}
			if(three.getY() <= 0 && contest) {
				first = "three";
				contest = false;

			};
		});
		Thread r4 = new Thread(()->{
			while(four.getY() > 0) {
				Random r = new Random();
				int a = r.nextInt(10);
				four.move(a);
			}
			if(four.getY() <= 0 && contest) {
				first = "four";
				contest = false;

			};
		});
		Thread r5 = new Thread(()->{
			while(five.getY() > 0) {
				Random r = new Random();
				int a = r.nextInt(10);
				five.move(a);
			}
			if(five.getY() <= 0 && contest) {
				first = "five";
				contest = false;

			};
		});
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
		
		try {
			r1.join();
			r2.join();
			r3.join();
			r4.join();
			r5.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!contest) {
			JOptionPane.showMessageDialog(null, "The winner is... " + first + "!");
		}
		
	}


	
	
	public static void main(String[] args) {
		AdvancedRobotRace race = new AdvancedRobotRace();
		race.roboMaker();
		
		
		
		
	}
}
