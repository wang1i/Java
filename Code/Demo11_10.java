package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date ����ʱ�䣺2018��7��2������7:42:31
 * @type ��ϰ��
 */
public class Demo11_10 {

	public static void main(String[] args) {
		MyStack arr = new MyStack();
		Scanner input = new Scanner(System.in);
		System.out.println("����������ַ�����");
		for (int i = 0; i < 5; i++)
			arr.push(input.nextLine());
		for (int i = 4; i >= 0; i--)
			System.out.println(arr.pop());

	}

}
