package myjava;

import java.util.Scanner;

public class Demo5_28 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("请输入年份：");
		int year = input.nextInt();
		System.out.print("请输入" + year + "的第一天是星期几（如2表示星期二）：");
		int week = input.nextInt();
		for(int month = 1 ; month <= 12 ; month ++) {
			switch(month) {
			case 1  : break;
			case 2  : week = (week + 31) % 7;break;
			case 3  : week = (week + 28) % 7;break;
			case 4  : week = (week + 31) % 7;break;
			case 5  : week = (week + 30) % 7;break;
			case 6  : week = (week + 31) % 7;break;
			case 7  : week = (week + 30) % 7;break;
			case 8  : week = (week + 31) % 7;break;
			case 9  : week = (week + 31) % 7;break;
			case 10: week = (week + 30) % 7;break;
			case 11: week = (week + 31) % 7;break;
			case 12: week = (week + 30) % 7;break;
			}
			if((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && month > 2) {
				System.out.println(year + "年   " + month + "月的第一天是星期" + (week + 1));
			}
			else
				System.out.println(year + "年   " + month + "月的第一天是星期" + week);
		}

	}

}
