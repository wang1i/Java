package myjava;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��7��2������9:24:50
 * @type ��ϰ��
 */
public class Demo11_15 {

	public static void main(String[] args) {
		ArrayList<MyPoint> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.print("���������α�����");
		int n = input.nextInt();
		System.out.println("������" + n + "���㣺");
		for (int i = 0; i < n; i++)
			list.add(new MyPoint(input.nextDouble(), input.nextDouble()));
		System.out.println("����������" + area(list));

	}

	private static double area(ArrayList<MyPoint> list) {
		if (list.size() == 3)
			return TriangleArea(list.get(0), list.get(1), list.get(2));
		list.remove(1);
		return area(list) + TriangleArea(list.get(0), list.get(1), list.get(2));
	}

	private static double TriangleArea(MyPoint point1, MyPoint point2, MyPoint point3) {
		double a = point1.distance(point2);
		double b = point1.distance(point3);
		double c = point2.distance(point3);
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}
