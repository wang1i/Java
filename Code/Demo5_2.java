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
			System.out.print(num1 + "+" + num2 + "=?��" );
			int answer = input.nextInt();
			if(answer == num1 + num2) {
				System.out.println("����ȷ");
			    count ++;
			}
			else
				System.out.println("�𰸴���,��ȷ��Ϊ��" + (num1 + num2));
			output +="\n" + num1 + "+" + num2 + "=" + answer + (num1 + num2 == answer ? "   ��ȷ" : "   ����");
		}
		long endTime = System.currentTimeMillis();
		long spendTime = endTime - startTime;
		System.out.println("\n\n��ȷ����" + count + "\n����ʱ�䣺" + (spendTime / 1000) + "s" + output);
		

	}

}
