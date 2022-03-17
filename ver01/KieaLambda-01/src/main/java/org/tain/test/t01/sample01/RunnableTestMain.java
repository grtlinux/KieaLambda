package org.tain.test.t01.sample01;

public class RunnableTestMain {

	public static void main(String[] args) {
		Thread thr = new Thread(new Runnable() {
			public void run() {
				for (int i=0; i < 10; i++) {
					System.out.println("> " + i);
					try { Thread.sleep(1000); } catch (InterruptedException e) {}
				}
			}
		});
		thr.start();
		
		//////////////////////////////////////////
		Runnable runnable = null;
		runnable = () -> {
			for (int i=0; i < 10; i++) {
				System.out.println(">> " + i);
				try { Thread.sleep(1000); } catch (InterruptedException e) {}
			}
		};
		
		runnable.run();
	}
}
