package org.tain.test.t01.sample07;

public class ThreadTestMain {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			for (int i=0; i < 10; i++) {
				System.out.println("> " + i);
				try { Thread.sleep(1000); } catch (InterruptedException e) {}
			}
		});
		thread.start();
		
		Runnable runnable = () -> {
			for (int i=0; i < 10; i++) {
				System.out.println(">> " + i);
				try { Thread.sleep(1000); } catch (InterruptedException e) {}
			}
		};
		thread = new Thread(runnable);
		thread.start();
	}
}
