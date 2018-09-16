package myjava;

import java.util.Scanner;

public class Demo12_7 {

	public static void main(String[] args) {
		String bin;
		System.out.print("请输入二进制字符串：");

		try (Scanner input = new Scanner(System.in);) {
			bin = input.nextLine();
		}
		System.out.print(bin2Dec(bin));
	}

	private static int bin2Dec(String bin) {
		int sum = 0;
		for (int i = 0; i < bin.length(); i++)
			if (bin.charAt(i) >= '0' && bin.charAt(i) <= '1')
				sum = sum * 2 + bin.charAt(i) - '0';
		return sum;
	}

}
