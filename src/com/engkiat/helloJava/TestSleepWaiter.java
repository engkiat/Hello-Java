package com.engkiat.helloJava;

import java.util.Random;

import com.engkiat.helloJava.thread.SleeperThread;

public class TestSleepWaiter {
	private final static int waitFor = 250;
	private final static int iterations = 5;
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Random rGen = new Random();
		int r = 0;
		long joinTime = 0, waitTime = 0;
		SleeperThread sleeper;
		long Start;
		System.out.println("#,\tsleep,\tjoin,\twait,\t(Time wasted with "+waitFor+"ms. sleep)");
		for (int i=1; i<=iterations; i++ ) {
			r = 200 + rGen.nextInt(1800);
			System.out.print(i+",\t"+r);
			Start = System.currentTimeMillis();
			sleeper = new SleeperThread(r);
			sleeper.start();
			sleeper.join();
			
			long Mid = System.currentTimeMillis();
			joinTime = Mid - Start;
			System.out.print(",\t" + joinTime);
			
			Start = System.currentTimeMillis();
			sleeper = new SleeperThread(r);
			sleeper.start();
			sleepWaiter(sleeper);
			
			long End = System.currentTimeMillis();
			waitTime = End - Mid;
			System.out.print(",\t" + waitTime);
			System.out.println(",\t(" + (waitTime - joinTime) + ")");
		}
	}
	public static void sleepWaiter(Thread obj) {
		while (obj.isAlive()) {
			try {
				Thread.sleep(waitFor);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
