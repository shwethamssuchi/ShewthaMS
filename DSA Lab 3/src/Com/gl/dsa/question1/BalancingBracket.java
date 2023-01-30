package Com.gl.dsa.question1;

import java.util.Stack;

public class BalancingBracket {

	static boolean isBalancedBrackets(String str) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == '{' || ch == '[' || ch == '(') {
				stack.push(ch);
			} else {
				if (stack.isEmpty())
					return false;

				switch (ch) {

				case '}':
					if (stack.pop() != '{') {
						return false;
					}
					break;
				case ']':
					if (stack.pop() != '[') {
						return false;
					}
					break;
				case ')':
					if (stack.pop() != '(') {
						return false;
					}
					break;
				}
			}
		}
		return (stack.isEmpty());
	}

	public static void main1(String[] args) {

		System.out.println("Balancing Brackets");

		String str1 = "([[{}]])";
		String str2 = "([[{}]]))";

		System.out.println("1. " + str1);
		if (isBalancedBrackets(str1)) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered String do not contain Balanced brackets");
		}

		System.out.println("2. " + str2);
		if (isBalancedBrackets(str2)) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered String do not contain Balanced brackets");
		}
	}

}

	