package myjava;

import java.util.Scanner;

public class Demo5_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������������������0��������");
		int countPositive = 0 , countNegative = 0 , digit;
		double sum = 0, average ;
		do {
			digit = input.nextInt();
			sum += digit;
			if(digit > 0)
				countPositive ++;
			if(digit < 0)
				countNegative ++;
		}while(digit !=0);
		average = sum / (countPositive + countNegative);
		System.out.println("����������" + countPositive);	
		System.out.println("����������" + countNegative);
		System.out.println("�ܺͣ�" + sum + "\nƽ��ֵ:" + average);

	}

}
