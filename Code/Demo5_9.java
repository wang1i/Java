package myjava;

import java.util.Scanner;

public class Demo5_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������ѧ��������");
		int n = input.nextInt();
		String  discard , name  , firstName = " " , secondName = " ";
		double score = 0 , firstScore = 0 ,secondScore = 0;
		for(int i = 1 ; i <= n ; i ++) {
			discard = input.nextLine();         //���ջس�
			System.out.print("������ѧ����������");
			name = input.nextLine();
			System.out.print("������ѧ���ĳɼ���");
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
		System.out.println("��һ���ǣ�" + firstName + "    �ɼ��ǣ�" + firstScore);
		System.out.println("�ڶ����ǣ�" + secondName + "    �ɼ��ǣ�" + secondScore);

	}

}
