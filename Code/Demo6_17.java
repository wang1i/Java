package myjava;

import java.util.Scanner;

public class Demo6_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("ÇëÊäÈë¾ØÕó²ãÊı£º");
		int n = input.nextInt();
		printMatrix(n);

	}

	public static void printMatrix(int n) {
		int i, j;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++)
				System.out.print((int) (Math.random() * 2) + "  ");
			System.out.println();
		}

	}

}
