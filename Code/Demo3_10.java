package myjava;

import java.util.Scanner;

public class Demo3_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a =(int) (Math.random() * 1000);
		int b =(int) (Math.random() * 1000);
		if(a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		System.out.print("请输入" + a + "-" + b +"=?：");
		int result = input.nextInt();
		if(result == a - b) {
			System.out.println("回答正确！");
		}
		else {
			System.out.println("回答错误！正确答案为：" + (a-b));
		}

	}

}