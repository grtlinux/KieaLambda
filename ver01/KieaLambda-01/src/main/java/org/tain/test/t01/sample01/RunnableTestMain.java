package org.tain.test.t01.sample01;

public class RunnableTestMain {

	public static void main(String[] args) {
		Runnable runnable = null;
		
		runnable = new Runnable() {
			public void run() {
				for (int i=0; i < 10; i++) {
					System.out.println("> " + i);
					try { Thread.sleep(1000); } catch (InterruptedException e) {}
				}
			}
		};
		
		runnable.run();
		
		runnable = () -> {
			for (int i=0; i < 10; i++) {
				System.out.println(">> " + i);
				try { Thread.sleep(1000); } catch (InterruptedException e) {}
			}
		};
		
		runnable.run();
	}
}
