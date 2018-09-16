package myjava;

import java.util.Scanner;

public class Demo4_24 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("请输入城市1：");
		String s1 = input.nextLine();
		System.out.print("请输入城市2：");
		String s2 = input.nextLine();
		System.out.print("请输入城市3：");
		String s3 = input.nextLine();
		String temp;
		
		if(s1.compareTo(s2) > 0) {
			temp = s1;
			s1 = s2;
			s2 = temp;
		}
		if(s1.compareTo(s3) > 0) {
			temp = s1;
			s1 = s3;
			s3 = temp;
		}
		if(s2.compareTo(s3) > 0) {
			temp = s2;
			s2 = s3;
			s3 = temp;
		}
		
		System.out.println(s1 + " , " + s2 + " , " + s3);

	}

}
