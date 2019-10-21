package cn.test.java8;

public class SubstringTest {

	public static void main(String[] args) {
		/**
		 * 测试substring的区间
		 */
		String string = new String("");
		String message = string.join("-", "Hello", "World");
		System.out.println(message);
		System.out.println(message.substring(0, message.length() - 1));
		System.out.println(message.length());
		System.out.println(message.substring(0, message.length() - 1).length());

		/**
		 * 测试结果：[)
		 * beginIndex the beginning index, inclusive
		 * endIndex the ending index, exclusive
		 */
	}

}
