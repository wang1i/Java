package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��30������10:30:27
 * @type ��ϰ��
 */
public class Demo10_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�����������ʽ��");
		String s = input.nextLine();
		System.out.println(s + "\t=\t" + compute(s));

	}

	private static int compute(String s) {
		char[] stack = new char[3];
		int top = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
				stack[top++] = s.charAt(i);
			else if (s.charAt(i) != ' ')
				stack[top++] = s.charAt(i);
		}
		if (stack[1] == '+')
			return stack[0] - '0' + stack[2] - '0';
		else if (stack[1] == '-')
			return stack[0] - stack[2];
		else if (stack[1] == '*')
			return (stack[0] - '0') * (stack[2] - '0');
		else
			return (stack[0] - '0') / (stack[2] - '0');
	}

}
