package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��4��25������9:57:26
 * @type ��ϰ��
 */
public class Demo6_37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("��������������ȣ�");
		int num = input.nextInt();
		int width = input.nextInt();
		System.out.println(format(num, width));

	}

	private static String format(int num, int width) {
		int i = 0;
		String s = num + "";
		while (num > 0) {
			num = num / 10;
			i++;
		}
		while (i < width) {
			s = '0' + s;
			i++;
		}
		return s;
	}

}
