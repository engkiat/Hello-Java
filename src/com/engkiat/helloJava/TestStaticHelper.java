package com.engkiat.helloJava;

import com.engkiat.helloJava.thread.StaticHelperUser;

public class TestStaticHelper {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		System.out.println("Start: " + startTime);
		
		StaticHelperUser user1 = new StaticHelperUser("user1");
		Thread.sleep(500);
		StaticHelperUser user2 = new StaticHelperUser("user2");
		
		user1.start();
		user2.start();
		
		user1.join();
		user2.join();
		
		long endTime = System.currentTimeMillis();
		System.out.println("End: " + endTime 
				+ " (" + (endTime - startTime) + ")");
	}

}
