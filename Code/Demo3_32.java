package myjava;

import java.util.Scanner;

public class Demo3_32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�жϵ�p2�Ƿ��ڴӵ�p0����p1�������߶���");
		System.out.println("�����p0��p1��p2�����꣨x0��y0������x1��y1������x2��y2����");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
		
        double judge = (x1 - x0) * (y2 -y0) - (x2 - x0) * (y1 - y0);
        if(judge > 0)
        	System.out.println("\np2���߶ε����");
        else if(judge == 0)
        	System.out.println("\np2�ڸ��߶���");
        else
        	System.out.println("\np2���߶ε��Ҳ�");
	}

}
