package myjava;

import java.util.Scanner;

public class Demo2_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�����������¶ȣ��¶���-58��F��41��F֮��)��");
		double t_a = input.nextDouble();
		System.out.println();
		System.out.print("��������٣�������2mph����");
		double v = input.nextDouble();
		System.out.println();
		
		double t_wc = 35.74 + 0.6215 * t_a -35.75 * Math.pow(v, 0.16) + 0.4275 * t_a *Math.pow(v, 0.16);
		
		System.out.println("�纮�¶�Ϊ��" + t_wc);
		
	}

}
