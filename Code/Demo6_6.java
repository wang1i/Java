package myjava;

import java.util.Scanner;

public class Demo6_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("ÇëÊäÈë²ãÊı£º");
		int n = input.nextInt();
		dipalyPattern(n);

	}

	public static void dipalyPattern(int n) {
		int i, j;
		for (i = 1; i <= n; i++) {
			for (j = n; j > i; j--)
				System.out.print("  ");
			for (j = i; j >= 1; j--)
				System.out.print(j + " ");
			System.out.println();
		}

	}

}
