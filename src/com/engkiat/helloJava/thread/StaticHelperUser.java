package com.engkiat.helloJava.thread;

import com.engkiat.helloJava.helper.StaticHelper;

public class StaticHelperUser extends Thread {
	public String name;
	public StaticHelperUser(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		say("I'm born!");
		
	}
	public void run() {
		say("I start running on " + System.currentTimeMillis());
		StaticHelper.sayMyName(name, name + "Helper");
		say("I'm done. " + System.currentTimeMillis());
	}
	private void say(String line) {
		System.out.println("StaticHelperUser [" + name + "]: " + line);
	}

}
