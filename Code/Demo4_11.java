package myjava;

import java.util.Scanner;

public class Demo4_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������0~15֮���һ������");
		int num = input.nextInt();
		if(num < 0 || num > 15)
			System.out.println("����ֵ�Ƿ�");
		 if(num < 10) 
			 System.out.println(num + "��Ӧ��ʮ��������Ϊ��" + num);
		 else
			 System.out.println(num + "��Ӧ��ʮ��������Ϊ��" + (char)(num - 10 + 'A'));

	}

}
