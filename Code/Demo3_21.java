package myjava;

import java.util.Scanner;

public class Demo3_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入年份，月份：");
		int year = input.nextInt();
		int month = input.nextInt();
		System.out.print("请输入" + month + "月的第？天：");
		int day = input.nextInt();
		
		int q = day;
		int m=0 , k , j ,h ;
		if(month == 1)   {m = 13 ; year -= 1;}
		if(month == 2)   {m = 14 ; year -= 1;}
		if(month >=3 && month <=12)  m = month;	
		j = Math.abs(year / 100);
		k = year % 100;		
		h = (q + 26  * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		switch(h) {
		case 0 : System.out.println(year + "年" + month + "月的第" + day +"天是星期六"); break;
		case 1 : System.out.println(year + "年" + month + "月的第" + day +"天是星期天"); break;
		case 2 : System.out.println(year + "年" + month + "月的第" + day +"天是星期一"); break;
		case 3 : System.out.println(year + "年" + month + "月的第" + day +"天是星期二"); break;
		case 4 : System.out.println(year + "年" + month + "月的第" + day +"天是星期三"); break;
		case 5 : System.out.println(year + "年" + month + "月的第" + day +"天是星期四"); break;
		case 6 : System.out.println(year + "年" + month + "月的第" + day +"天是星期五"); break;
		}
		

	}

}
