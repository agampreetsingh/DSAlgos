package threads;

import java.util.concurrent.TimeUnit;

public class deadlocks {
	
	class forLoop{
		public void printThis() throws InterruptedException {
			for(int i=0;i<10;i++) {
				System.out.println("Sent");
				System.out.println("Number: "+(i+1));
				TimeUnit.SECONDS.sleep(10);
		}
		}
	}
	
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			printUser();
			printELP();
			//forLoop l1=new forLoop();
			
			sendEmailJOBAsync();
			sendEmailJOBAsync();
			printStatus();
		}

		private static void sendEmailJOBAsync() throws InterruptedException {
			//sendEmail();
			new Thread(new Runnable(){
				public void run() {
					try{
						sendAnddeleteDBQueue();
					}
					catch(Exception e) {
						
					}
				}
			}).start();
			
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
		
		private static void sendAnddeleteDBQueue() throws InterruptedException {			
			
			synchronized()
			{
				for(int i=0;i<10;i++) {
				System.out.println("Sent");
				System.out.println("Number: "+(i+1));
				TimeUnit.SECONDS.sleep(10);
			}
			}
		
		System.out.println("deleted");

}

		private static void printUser() throws InterruptedException {
			System.out.println("User printed");
		}

		private static void printELP() throws InterruptedException {
			System.out.println("ELP printed");
		}

}
