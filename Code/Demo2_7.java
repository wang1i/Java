package myjava;

import java.util.Scanner;

public class Demo2_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�����������: ");
		int minutes = input.nextInt();
		
		int days = minutes / ( 24 * 60 );
		int year = days / 365;
		int day = days % 365;
		
		System.out.println(minutes + "������" + year + "��" + day +"��");
	}

}
