package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��15������5:53:35
 * @type ��ϰ��
 */
public class Demo8_37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] adds = { { "Alabama", "Montgomery" }, { "Alaska", "Juneau" }, { "Arizona", "Phoenix" } };
		int count = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print(adds[i][0] + "���׶��ǣ�");
			String answer = input.nextLine();
			if (answer.equals(adds[i][1])) {
				count++;
				System.out.println("����ȷ");
			} else
				System.out.println("��ȷ���ǣ�" + adds[i][1]);
		}
		System.out.println("��ȷ�𰸸�����" + count);
	}

}
