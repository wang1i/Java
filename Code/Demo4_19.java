package myjava;

import java.util.Scanner;

public class Demo4_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("����ISBN-10��ǰ9λ���֣�");
		String s = input.nextLine();
		int []d =new int[10];
		d[9] = 0;
		for(int i = 0 ; i < 9 ; i ++) {
			d[i] = s.charAt(i) - '0';
			d[9] += (i + 1) * d[i];
		}
		d[9] %= 11;
		if(d[9] == 10) 
			System.out.println("ISBN-10��ʮλ����Ϊ��" + s + 'X');
		else 
			System.out.println("ISBN-10��ʮλ����Ϊ��" + s + d[9]);
		

	}

}
