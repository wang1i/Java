package myjava;

import java.util.Scanner;

public class Demo2_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("��������ü�����ʣ��ٷ�������%����");
	    double subtotal = input.nextDouble();
	    double gratuityRate = input.nextDouble();
	    
	    double gratuity = subtotal  * gratuityRate / 100;
	    double total = subtotal * ( 1 + gratuityRate / 100 );
	    
	    System.out.println("���Ϊ" + gratuity + "    �ܷ���Ϊ" + total);

	}

}
