package cn.test.java8;

import java.util.Random;

public class StringOperation {

	public static void main(String[] args) {
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);
	}

}
