package myjava;

import java.util.Scanner;

public class Demo4_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个十六进制数：");
		String s = input.nextLine();
		char ch = s.charAt(0);
		
		if(ch >= '0' && ch <='9')
			System.out.println("十六进制数" + ch + "对应的十进制数是：" + (ch - '0'));
		else if(ch >= 'A' && ch <= 'F')
			System.out.println("十六进制数" + ch + "对应的十进制数是：" + (ch - 'A' + 10));
		else if(ch >= 'a' && ch <= 'f')
			System.out.println("十六进制数" + ch + "对应的十进制数是：" + (ch - 'a' + 10));
		else 
			System.out.println("输入值非法");
			

	}

}
