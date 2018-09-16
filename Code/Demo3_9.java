package myjava;

import java.util.Scanner;

public class Demo3_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入ISBN的前9位整数：");
        int [] d = new int[10];
        for(int i = 0 ; i < 9 ; i ++) {
        	d[i] = input.nextInt();
        }
        
        d[9] = 0;
        System.out.print("ISBN-10为：");
        for(int i = 0 ; i < 9 ; i ++) {
        	d[9] += (i+1) * d[i];
    		System.out.print(d[i]);
        }
		d[9] = d[9] % 11;
		if(d[9] != 10) {
			System.out.println(d[9]);
		}
		else {
			System.out.println("X");
		}

	}

}
