package myjava;

import java.util.Scanner;

public class Demo5_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0 ;
		long startTime = System.currentTimeMillis();
		String output = " ";
		for(int i = 0 ; i < 10 ; i ++) {
			int num1 =  1 + (int)(Math.random() * 15);
			int num2 =  1 + (int)(Math.random() * 15);
			System.out.print(num1 + "+" + num2 + "=?：" );
			int answer = input.nextInt();
			if(answer == num1 + num2) {
				System.out.println("答案正确");
			    count ++;
			}
			else
				System.out.println("答案错误,正确答案为：" + (num1 + num2));
			output +="\n" + num1 + "+" + num2 + "=" + answer + (num1 + num2 == answer ? "   正确" : "   错误");
		}
		long endTime = System.currentTimeMillis();
		long spendTime = endTime - startTime;
		System.out.println("\n\n正确个数" + count + "\n花费时间：" + (spendTime / 1000) + "s" + output);
		

	}

}
