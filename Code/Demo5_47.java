package myjava;

import java.util.Scanner;

public class Demo5_47 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("ÇëÊäÈëÒ»´®×Ö·û£º");
		String str = input.nextLine();
		if (str.length() != 12) {
			System.out.println("ISBN-13ÊäÈë´íÎó");
			System.exit(1);
		}
		int sum = 0, i;
		for (i = 0; i < str.length(); i++) {
			if (i % 2 == 0)
				sum += str.charAt(i) - '0';
			else
				sum += 3 * (str.charAt(i) - '0');
		}
		int test = 10 - sum % 10;
		if (test == 10) {
			for (i = 0; i < str.length() - 1; i++)
				System.out.print(str.charAt(i));
			System.out.println("0");
		} else {
			System.out.print(str);
			System.out.println(test);
		}
	}

}
