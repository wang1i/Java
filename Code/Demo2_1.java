package myjava;

import java.util.Scanner;

public class Demo2_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.println("请输入摄氏温度：");
		double celsius = input.nextDouble();
		double fashheit = ( 9.0 / 5 ) * celsius + 32 ;
		System.out.println(celsius + "摄氏度是" + fashheit + "华氏度"); 

	}

}
