package myjava;

import java.util.Scanner;

public class Demo4_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入字符串1：");
		String s1 = input.nextLine();
		System.out.print("请输入字符串2：");
		String s2 = input.nextLine();
		int sub = s1.indexOf(s2);
		if(sub == -1)
			System.out.println(s2 + "不是" + s1 + "的子串");
		else
			System.out.println(s2 + "是" + s1 + "的子串");

	}

}
