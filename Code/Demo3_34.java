package myjava;

import java.util.Scanner;

public class Demo3_34 {

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
        if(x0 >= x1) {
        	double temp = x0;
        	x0 = x1;
        	x1 = temp;
        }
        if(judge == 0) 
        	if(x2 >=x0 && x2 <= x1) {
        		System.out.println("(" + x2 +"," + y2 + ")���ɣ�" + x0 +"," + y0 + ")����" + x1 + "," + y1 + ")�������߶���");
        		System.exit(1);
        	}
        System.out.println("(" + x2 +"," + y2 + ")�����ɣ�" + x0 +"," + y0 + ")����" + x1 + "," + y1 + ")�������߶���");
	}

}
