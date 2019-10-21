package cn.test.java7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StringOperation {
	public static void main(String[] args) {
		System.out.println("Using Java7:");

		// 计算字符串
		// 计算空字符串数量
		List<String> stringList = Arrays.asList("abc", "", "bc", "efg", "abcd",
				"", "jkl");
		System.out.println("List is " + stringList);
		long count = getEmptyStringUsingJava7(stringList);
		System.out.println("Empty String's number is " + count);

		// 计算空字符串长度为3的字符串的数量
		count = getCountLength3UsingJava7(stringList);
		System.out
				.println("The number of String whose length is 3 is " + count);

		// 删除字符串
		List<String> filteredList = deleteEmptyStringUsingJava7(stringList);
		System.out.println("Filetered String is" + filteredList);

		// 删除空字符串，并使用逗号连接
		String mergedString = getMergedStringUsingJava7(stringList, ",");
		System.out.println(mergedString);

		// 整型列表操作
		List<Integer> numbersList = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		// 获取列表元素平方数
		List<Integer> squaresList = getSquares(numbersList);
		System.out.println("平方数列表: " + squaresList);

		List<Integer> integers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);

		System.out.println("列表: " + integers);
		System.out.println("列表中最大的数 : " + getMax(integers));
		System.out.println("列表中最小的数 : " + getMin(integers));
		System.out.println("所有数之和 : " + getSum(integers));
		System.out.println("平均数 : " + getAverage(integers));

		System.out.println("随机数: ");
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.print(random.nextInt());
		}
	}

	private static int getEmptyStringUsingJava7(List<String> stringList) {
		int count = 0;
		for (String string : stringList) {
			if (string.isEmpty()) {
				count++;
			}
		}
		return count;
	}

	private static int getCountLength3UsingJava7(List<String> stringList) {
		int count = 0;
		for (String string : stringList) {
			if (string.length() == 3) {
				count++;
			}
		}
		return count;
	}

	private static List<String> deleteEmptyStringUsingJava7(
			List<String> stringList) {
		List<String> newList = new ArrayList<String>();
		for (String string : stringList) {
			if (!string.isEmpty()) {
				newList.add(string);
			}
		}
		return newList;
	}

	private static String getMergedStringUsingJava7(List<String> stringList,
			String separator) {
		StringBuffer mergedString = new StringBuffer();
		for (String string : stringList) {
			if (!string.isEmpty()) {
				mergedString.append(string);
				mergedString.append(separator);
			}
		}
		// return mergedString.toString().substring(0, mergedString.length() -
		// 1);
		String string = mergedString.toString();
		return string.substring(0, string.length() - 1);
	}

	private static List<Integer> getSquares(List<Integer> numbersList) {
		List<Integer> squaresList = new ArrayList<Integer>();
		for (Integer numbers : numbersList) {
			Integer squares = new Integer(numbers.intValue()
					* numbers.intValue());
			if (!squaresList.contains(squares)) {
				squaresList.add(squares);
			}
		}
		return squaresList;
	}

	private static int getMax(List<Integer> numbers) {
		int max = numbers.get(0);

		for (int i = 1; i < numbers.size(); i++) {

			Integer number = numbers.get(i);

			if (number.intValue() > max) {
				max = number.intValue();
			}
		}
		return max;
	}

	private static int getMin(List<Integer> numbers) {
		int min = numbers.get(0);

		for (int i = 1; i < numbers.size(); i++) {
			Integer number = numbers.get(i);

			if (number.intValue() < min) {
				min = number.intValue();
			}
		}
		return min;
	}

	private static int getSum(List numbers) {
		int sum = (int) (numbers.get(0));

		for (int i = 1; i < numbers.size(); i++) {
			sum += (int) numbers.get(i);
		}
		return sum;
	}

	private static int getAverage(List<Integer> numbers) {
		return getSum(numbers) / numbers.size();
	}
}
