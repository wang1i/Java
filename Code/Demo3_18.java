package myjava;

import java.util.Scanner;

public class Demo3_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("����������������������");
		double w = input.nextDouble();
		double price = 0 ,cost;
		
		if(w <= 0) {
			System.out.println("������������С��0��");
			System.exit(1);
		}
		else if(w > 0 && w <= 1) 
			price = 3.5;
		else if(w > 1 && w <=3)
			price = 5.5;
		else if(w > 3 && w <=10)
			price = 8.5;
		else if(w > 10 && w <=20)
			price = 10.5;
		else {
			System.out.println("�����������ô���20����");
			System.exit(1);
		}
        cost = price * w;
        System.out.println("����ɱ���" + cost);

	}

}
