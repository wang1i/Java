package myjava;

import java.util.Scanner;

public class Demo4_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入ASCII码（0~127）：");
		int num = input.nextInt();
		System.out.println("ASCII码为" + num + "的字符是：" + (char)num);

	}

}
