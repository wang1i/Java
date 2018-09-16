package myjava;

import java.util.Scanner;

/**
 * @author wl
 * @date 创建时间：2018年7月2日下午7:42:31
 * @type 练习题
 */
public class Demo11_10 {

	public static void main(String[] args) {
		MyStack arr = new MyStack();
		Scanner input = new Scanner(System.in);
		System.out.println("请输入五个字符串：");
		for (int i = 0; i < 5; i++)
			arr.push(input.nextLine());
		for (int i = 4; i >= 0; i--)
			System.out.println(arr.pop());

	}

}
