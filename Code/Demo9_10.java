package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��8������8:42:28
 * @type ��ϰ��
 */
public class Demo9_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������a,b,c��ֵ��");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		QuadraticEquation equa = new QuadraticEquation(a, b, c);
		if (equa.getDiscriminant() < 0)
			System.out.println("�����޸�");
		else if (equa.getDiscriminant() == 0)
			System.out.println("�����е�����" + equa.getRoot1());
		else
			System.out.println("���������������ֱ��ǣ�" + equa.getRoot1() + " �� " + equa.getRoot2());

	}

}
