package myjava;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年7月2日下午10:14:24
 * @type 练习题
 */
public class Demo11_16 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int t, m1, m2;
		do {
			m1 = (int) (Math.random() * 10);
			m2 = (int) (Math.random() * 10);
			System.out.print(m1 + "+" + m2 + "?  ");
			t = input.nextInt();
			list.add(new Integer(t));
			System.out.println(t);
			if (t != m1 + m2) {
				System.out.println("回答错误！正确答案为" + (m1 + m2));
				for (int i = 0; i < list.size() - 1; i++)
					if (t == list.get(i).intValue())
						System.out.println("真香警告！你已经输入过该答案");
			}
		} while (t != m1 + m2);
		System.out.println("终于回答正确了!");
	}

}
