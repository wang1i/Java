package myjava;

import java.util.Scanner;

public class Demo5_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入金字塔层数（数字）：");
		int high = input.nextInt();
		for(int i = 1 ; i <=high ; i ++) {
			for(int j = 1 ; j <= high - i ; j ++)
				System.out.print("   ");
			for(int k = i ; k >= 1 ; k --)
				System.out.print(k + "  ");
			for(int l = 2 ; l <= i ; l ++)
				System.out.print(l + "  ");
			System.out.println();
		}

	}

}
