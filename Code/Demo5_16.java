package myjava;

import java.util.Scanner;

public class Demo5_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一正整数：");
		int n = input.nextInt();
		int m = n , i;
		while(n != 0) {
			for(i = 2 ; i <= (int)Math.sqrt(n) ; i ++) 
				if(n % i == 0) break;
			if(i <= (int)Math.sqrt(n) ) {
				System.out.print(i + " , ");
				n /= i; 
			}
			else {
			    if(n == m) {
					System.out.println("1 , " + n);
					System.exit(1);
			    }
				System.out.println(n);
				System.exit(1);
			}


			}
		}
}

