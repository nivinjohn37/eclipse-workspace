package com.test.UnitTests;

import java.awt.*;
import java.util.*;

public class SystemAwake {
	public static void main(String[] args) throws Exception {
		Robot hal = new Robot();
		Random random = new Random();
		try {
			while (true) {
				hal.delay(500 * 60);
				int x = random.nextInt() % 640;
				int y = random.nextInt() % 480;
				hal.mouseMove(x, y);
			}
		}
		catch (InterruptedException e) {
           System.out.println("Stopped");
        }
		
	}
}