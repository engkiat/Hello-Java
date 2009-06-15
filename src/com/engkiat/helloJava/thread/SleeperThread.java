package com.engkiat.helloJava.thread;

public class SleeperThread extends Thread {
	private long sleepTime = 1000;
	public SleeperThread(long sleep) {
		sleepTime = sleep;
	}
	public void run() {
		try {
			sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
