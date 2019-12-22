package com.test.UnitTests;

import java.awt.Robot;
import java.util.Random;

public class MyShutdownHook {

	public static void main(final String[] args) throws Exception {

		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				System.out.println("Shutdown Hook is running !");
			}
		});
		Robot hal = new Robot();
		Random random = new Random();
		while (true) {
			hal.delay(500 * 60);
			int x = random.nextInt() % 640;
			int y = random.nextInt() % 480;
			hal.mouseMove(x, y);
		}
	}

}