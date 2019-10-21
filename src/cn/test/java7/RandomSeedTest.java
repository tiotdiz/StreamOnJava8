package cn.test.java7;

import java.util.Random;

public class RandomSeedTest {

	public static void main(String[] args) {
		Random r1 = new Random(5);
		Random r2 = new Random(5);
		for (int i = 0; i <= 5; i++) {
			System.out.print(r1.nextInt(2));
		}
		System.out.println();
		for (int i = 0; i <= 5; i++) {
			System.out.print(r2.nextInt(2));
		}
	}
}
