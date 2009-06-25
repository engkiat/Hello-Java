package com.engkiat.puzzle;

import java.util.Random;

public class MontyHall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rGen = new Random();
		int car, choice;
		int seasons = 10;
		int shows = 1000;
		for (int j=1; j<=seasons; j++) {
			int win = 0;
			for (int i=1; i<=shows; i++) {
				car = rGen.nextInt(3);
				choice = rGen.nextInt(3);
				if (car==choice) {
//					switch will lose
				} else {
//					switch will win
					win++;
				}
			}
		System.out.println(win+" out of "+shows+" times will win in season "+j);
		}
	}
}
