package myjava;

import java.util.Scanner;

public class Demo2_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入费用及酬金率（百分数不带%）：");
	    double subtotal = input.nextDouble();
	    double gratuityRate = input.nextDouble();
	    
	    double gratuity = subtotal  * gratuityRate / 100;
	    double total = subtotal * ( 1 + gratuityRate / 100 );
	    
	    System.out.println("酬金为" + gratuity + "    总费用为" + total);

	}

}
