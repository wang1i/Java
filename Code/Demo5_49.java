package myjava;

import java.util.Scanner;

public class Demo5_49 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一串字符串：");
		String s = input.nextLine();
		int count1 = 0, count2 = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
					|| s.charAt(i) == 'O' || s.charAt(i) == 'U')
				count1++;
			else if (s.charAt(i) != ' ')
				count2++;
		}
		System.out.println("元音个数：" + count1);
		System.out.println("辅音个数：" + count2);

	}

}
