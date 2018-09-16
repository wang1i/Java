package myjava;

import java.util.Scanner;

public class Demo4_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("输入信息（第一个字符表示专业，第二个字符表示年级）：");
		String info = input.nextLine();
		char ch1 = info.charAt(0);
		char ch2 = info.charAt(1);
		if(ch1 == 'M')
			System.out.print("数学");
		else if(ch1 == 'C')
			System.out.print("计算机科学");
		else if(ch1 == 'I')
			System.out.print("信息技术");
		else {
			System.out.println("输入非法");
		    System.exit(1);
		}
		if(ch2 =='1')
			System.out.println("  大一");
		else if(ch2 =='2')
			System.out.println("  大二");
		else if(ch2 == '3')
			System.out.println("  大三");
		else if(ch2 == '4')
			System.out.println("  大四");
		else
			System.out.println("输入非法");

	}

}
