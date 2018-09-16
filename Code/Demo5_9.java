package myjava;

import java.util.Scanner;

public class Demo5_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入学生个数：");
		int n = input.nextInt();
		String  discard , name  , firstName = " " , secondName = " ";
		double score = 0 , firstScore = 0 ,secondScore = 0;
		for(int i = 1 ; i <= n ; i ++) {
			discard = input.nextLine();         //回收回车
			System.out.print("请输入学生的姓名：");
			name = input.nextLine();
			System.out.print("请输入学生的成绩：");
			score = input.nextDouble();
			if(score > firstScore) {             
				secondScore = firstScore;
				secondName = firstName;
				firstScore = score;
			    firstName = name;
			}
			else {                                       
				if(score > secondScore) {
					secondScore = score;
					secondName = name;
				}
		    }
		}
		System.out.println("第一名是：" + firstName + "    成绩是：" + firstScore);
		System.out.println("第二名是：" + secondName + "    成绩是：" + secondScore);

	}

}
