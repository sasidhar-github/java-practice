package com.practice.mg;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {

	public static void main(String[] args) {
		String str = "[()]";
		System.out.println(checkBalancedBrackets(str));

	}

	private static boolean checkBalancedBrackets(String str) {
		Deque<Character> stack = new ArrayDeque<>();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch == '(' || ch == '[' ||ch == '{') {
				stack.push(ch);
				continue;
			}			
			if(stack.isEmpty()) {
				return false;
			}
			
			char check;
			switch (ch) {
			case ')':
				check = stack.pop();
				if(check=='{' || check == '[') {
					return false;
				}
				break;
			case ']':
				check = stack.pop();
				if(check=='{' || check == '(') {
					return false;
				}
               break;
			case '}':
				check = stack.pop();
				if(check=='[' || check == '(') {
					return false;
				}
               break;
			}
		}		
		return stack.isEmpty();
	}

}
