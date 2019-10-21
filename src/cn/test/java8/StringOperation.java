package cn.test.java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StringOperation {

	public static void main(String[] args) {
		System.out.println("Using Java8");
		List<String> stringList = Arrays.asList("abc", "", "bc", "efg", "abcd",
				"", "jkl");

		// 空字符串数量
		System.out.println("空字符串数量:");
		long count = stringList.stream().filter(string -> string.isEmpty())
				.count();
		System.out.println(count);

		// 长度为3字符串数量
		System.out.println("长度为3字符串数量：");
		count = stringList.stream().filter(string -> string.length() == 3)
				.count();
		System.out.println(count);

		// 删除空字符后
		List<String> filteredList = stringList.stream()
				.filter(string -> !string.isEmpty())
				.collect(Collectors.toList());
		System.out.println(filteredList);

		// 取出长度为3的字符串
		filteredList = stringList.stream()
				.filter(string -> string.length() == 3)
				.collect(Collectors.toList());
		System.out.println(filteredList);

		// 合并字符串
		String mergedString = stringList.stream()
				.filter(string -> !string.isEmpty())
				.collect(Collectors.joining("、"));
		System.out.println("合并后的字符串：" + mergedString);

		List<Integer> numbersList = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		List<Integer> squaresList = numbersList.stream().map(i -> i * i)
				.distinct().collect(Collectors.toList());
		System.out.println("Squares List: " + squaresList);

		squaresList = numbersList.stream().map(i -> i * i).distinct()
				.collect(Collectors.toList());
		System.out.println("Squares List: " + squaresList);

		List<Integer> integersList = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);
		System.out.println("列表: " + integersList);
		
		IntSummaryStatistics iss = integersList.stream().mapToInt((x) -> x).summaryStatistics();
		// 遍历
//		integersList.stream().mapToInt((x) -> x).forEach(System.out::println);
		System.out.println(integersList.stream().mapToInt((x) -> x).max().getAsInt());
		
		System.out.println(iss.getCount());
		System.out.println(iss.getMax());
		System.out.println(iss.getMin());
		System.out.println(iss.getSum());
		System.out.println(iss.getAverage());
	}
}
