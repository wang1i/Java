package myjava;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年7月2日下午7:55:04
 * @type 练习题
 */
public class Demo11_11 {
	public static void sort(ArrayList<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1 - i; j++)
				if (list.get(j).intValue() > list.get(j + 1).intValue()) {
					Integer temp = list.get(j);
					list.set(j, list.get(j + 1).intValue());
					list.set(j + 1, temp);
				}
		}
	}

	public static int sum(ArrayList<Integer> list) {
		int sum = 0;
		for (int i = 0; i < list.size(); i++)
			sum += list.get(i).intValue();
		return sum;
	}

	public static void removeDuplicate(ArrayList<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			Integer t = list.get(i);
			for (int j = i + 1; j < list.size(); j++)
				if (list.get(j).intValue() == t.intValue())
					list.remove(j);
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("输入五个数字");
		for (int i = 0; i < 5; i++)
			list.add(new Integer(input.nextInt()));
		sort(list);
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.println("\n和：" + sum(list));
		removeDuplicate(list);
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
	}
}
