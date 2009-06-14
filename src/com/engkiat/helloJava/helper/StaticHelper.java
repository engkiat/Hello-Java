package com.engkiat.helloJava.helper;

public class StaticHelper {
	public static String helperName = "SH";
	public static void sayMyName(String name, String helper) {
		String newComer = name;
		helperName = helper;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println("Hi, " + newComer + "! I am " + helperName);
	}
}
