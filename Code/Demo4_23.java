package myjava;

import java.util.Scanner;

public class Demo4_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������Ա������");
		String name = input.nextLine();
		System.out.print("������ÿ�ܹ�����Сʱ����");
		double time = input.nextDouble();
		System.out.print("������ÿСʱ���$��");
		double payRate = input.nextDouble();
		System.out.print("��������������˰˰�ʣ�");
		double federalRate = input.nextDouble();
		System.out.print("������������˰˰�ʣ�");
		double stateRate = input.nextDouble();
		
		double grossPay = payRate * time ;
		double federalDeduction = federalRate * grossPay;
		double stateDeduction = stateRate * grossPay;
		double totalDeduction = federalDeduction + stateDeduction;
		double netPay = grossPay - totalDeduction;
		
		System.out.println("��Ա������" + name + "\n" + "ÿ�ܹ���Сʱ����" + time );
		System.out.println("ÿСʱ���" + "$" + payRate + "\n" + "�ܱ��꣺" + grossPay );
		System.out.println("�ۺģ�" + "\n" + "  ����˰��20%����$" + federalDeduction + "\n" +  "  ��˰��9.0%����$" + stateDeduction);
		System.out.println( "  ��˰��$" + totalDeduction + "\n" + "�����$" + netPay);

	}

}
