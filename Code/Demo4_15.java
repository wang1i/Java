package myjava;

import java.util.Scanner;

public class Demo4_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一字母：");
		String s = input.nextLine();
		char ch = s.charAt(0);
		 
		if((ch >= 'A' && ch <= 'C') || (ch >='a' && ch <= 'c'))
			System.out.println("对应的通讯号码为2");
		else if((ch >= 'D' && ch <= 'F') || (ch >='d' && ch <= 'f'))
			System.out.println("对应的通讯号码为3");
		else if((ch >= 'G' && ch <= 'H') || (ch >='g' && ch <= 'h'))
			System.out.println("对应的通讯号码为4");
		else if((ch >= 'J' && ch <= 'L') || (ch >='j' && ch <= 'l'))
			System.out.println("对应的通讯号码为5");
		else if((ch >= 'M' && ch <= 'O') || (ch >='m' && ch <= 'o'))
			System.out.println("对应的通讯号码为6");
		else if((ch >= 'P' && ch <= 'S') || (ch >='p' && ch <= 's'))
			System.out.println("对应的通讯号码为7");
		else if((ch >= 'T' && ch <= 'V') || (ch >='t' && ch <= 'v'))
			System.out.println("对应的通讯号码为8");
		else if((ch >= 'W' && ch <= 'Z') || (ch >='w' && ch <= 'z'))
			System.out.println("对应的通讯号码为9");
		else
			System.out.println("输入值非法");
		

	}

}
