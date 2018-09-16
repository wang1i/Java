package myjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年7月2日上午9:56:11
 * @type 练习题
 */
public class Demo11_4 {

	public static Integer max(ArrayList<Integer> list) {
		if (list.isEmpty() || list.size() == 0)
			return null;
		return Collections.max(list);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入以0结尾的数值序列：");
		ArrayList<Integer> list = new ArrayList();
		int t = 1;
		do {
			t = input.nextInt();
			list.add(new Integer(t));
		} while (t != 0);
		System.out.println("最大值：" + max(list));
	}

}
