package myjava;

import java.util.Scanner;

public class Demo2_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������ˮ������(kg): " );
		double quality = input.nextDouble();
		System.out.print("������ˮ�ĳ�ʼ�¶�(��): ");
		double initialTemperature = input.nextDouble();
		System.out.print("������ˮ�������¶�(��): ");
		double finalTemperature = input.nextDouble();
		
		double energy = quality * ( finalTemperature - initialTemperature ) * 4184;
		
		System.out.println("��������Ϊ��" + energy );

	}

}
