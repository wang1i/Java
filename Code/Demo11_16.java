package myjava;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��7��2������10:14:24
 * @type ��ϰ��
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
				System.out.println("�ش������ȷ��Ϊ" + (m1 + m2));
				for (int i = 0; i < list.size() - 1; i++)
					if (t == list.get(i).intValue())
						System.out.println("���㾯�棡���Ѿ�������ô�");
			}
		} while (t != m1 + m2);
		System.out.println("���ڻش���ȷ��!");
	}

}
