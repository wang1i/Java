package myjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��7��2������9:56:11
 * @type ��ϰ��
 */
public class Demo11_4 {

	public static Integer max(ArrayList<Integer> list) {
		if (list.isEmpty() || list.size() == 0)
			return null;
		return Collections.max(list);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("��������0��β����ֵ���У�");
		ArrayList<Integer> list = new ArrayList();
		int t = 1;
		do {
			t = input.nextInt();
			list.add(new Integer(t));
		} while (t != 0);
		System.out.println("���ֵ��" + max(list));
	}

}
