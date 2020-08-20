package threads;

import java.util.concurrent.TimeUnit;

public class AsyncTester {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		printUser();
		printELP();
		sendEmailAsync();
		printStatus();
	}

	private static void printStatus() throws InterruptedException {
		System.out.println("Status printed");
	}

	private static void sendEmailAsync() throws InterruptedException {

		new Thread(new Runnable() {
			public void run() {
				try {
					TimeUnit.SECONDS.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("email sent");
			}
		}).start();

	}

	private static void sendEmail() throws InterruptedException {

		
					TimeUnit.SECONDS.sleep(10);
				
				System.out.println("email sent");
		
	}

	private static void printUser() throws InterruptedException {
		System.out.println("User printed");
	}

	private static void printELP() throws InterruptedException {
		System.out.println("ELP printed");
	}

}
