package org.tain.test.t02.test07;

public class ThreadTestMain {

	public static void main(String[] args) {
		new Thread(() -> {
			for (int i=0; i < 10; i++) {
				System.out.println(">>> " + i);
				try { Thread.sleep(1000); } catch(InterruptedException e) {}
			}
		}).start();
	}
}
