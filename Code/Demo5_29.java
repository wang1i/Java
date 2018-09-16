package myjava;

import java.util.Scanner;

public class Demo5_29 {

	public static void main(String[] args) {
		int i , base , days = 0 , Week;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入年份：");
		int year = input.nextInt();
		System.out.print("请输入" + year + "的第一天是星期几(如以3表示星期三)：");
		int week =input.nextInt();
		for(int month = 1 ; month <= 12 ; month ++) {
			switch(month) {
			case   1 : days = 31;break;
			case   2 : days = 29;week = (week + 31) % 7;break;
			case   3 : days = 31;week = (week + 28) % 7;break;
			case   4 : days = 30;week = (week + 31) % 7;break;
			case   5 : days = 31;week = (week + 30) % 7;break;
			case   6 : days = 30;week = (week + 31) % 7;break;
			case   7 : days = 31;week = (week + 30) % 7;break;
			case   8 : days = 31;week = (week + 31) % 7;break;
			case   9 : days = 30;week = (week + 31) % 7;break;
			case 10 : days = 31;week = (week + 30) % 7;break;
			case 11 : days = 30;week = (week + 31) % 7;break;
			case 12 : days = 31;week = (week + 30) % 7;break;
			}
			if(month == 2 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				days += 1;
			base = 1;
			System.out.println(year + " 年  "+ month + " 月");
			System.out.println("Sun  Mon  Tue  Wed  Thu   Fri    Sat");
			for(i = 0 ; base <= days ; i ++) {
				if(i % 7 == 0)
					System.out.println();
				Week = week;
				if(month > 2 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
					if(week > 0) Week = week -1;
					else Week = 6;
				}
				if(i < Week)
						System.out.print("         ");
				else {
					if(base < 10)
						System.out.print(base + "       ");
					else
						System.out.print(base + "     ");
						base ++;
					}
			}
			System.out.println();
		}

	}

}
