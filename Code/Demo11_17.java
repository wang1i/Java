package myjava;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年7月2日下午10:33:55
 * @type 练习题
 */
public class Demo11_17 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一正整数：");
		int m = input.nextInt();
		while (true) {
			int i;
			for (i = 2; i < m; i++)
				if (m % i == 0)
					list.add(new Integer(i));
			if (i < m)
				m = m / i;
			else
				break;
		}
		int n = 1;
		int count = 1;
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).intValue() == list.get(i - 1).intValue())
				count++;
			else {
				if (count % 2 == 1)
					n *= list.get(i - 1).intValue();
				count = 1;
			}
		}
		System.out.println(n);
	}
}
