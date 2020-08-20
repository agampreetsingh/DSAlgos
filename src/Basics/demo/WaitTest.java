package Basics.demo;

import java.util.Timer;
import java.util.TimerTask;

public class WaitTest {

	public static void main(String[] args) {
		System.out.println("Here...");
		Long start =System.currentTimeMillis();
		
		while(System.currentTimeMillis() - start <10000) {
			
		}
		System.out.println("Gotcha!");
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				
			}
		}, 10000);
		System.out.println("Works!");	
	}
	

}
