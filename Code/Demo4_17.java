package myjava;

import java.util.Scanner;

public class Demo4_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("��������ݣ���2018����");
		String Year = input.nextLine();
		for(int i = Year.length() - 1; i >=0 ; i --) {
			if(!Character.isDigit(Year.charAt(i))) {
				System.out.println("�������ֵ�Ƿ�");
				System.exit(1);
			}
		}
		int year = Integer.parseInt(Year);
		System.out.print("�������·ݣ���Aug����");
		String month = input.nextLine();
		
		if(month.equals("Jan"))
			System.out.println(year + "  " + month + "��31��");
		else if(month.equals("Feb")) {
			if(year % 4 == 0 && year % 100 !=0 || year % 400 ==0)
				System.out.println(year + "  " + month + "��28��");
			else
				System.out.println(year + "  " + month + "��29��");
		}
		else if(month.equals("Mar"))
			System.out.println(year + "  " + month + "��31��");
		else if(month.equals("Apr"))
			System.out.println(year + "  " + month + "��30��");
		else if(month.equals("May"))
			System.out.println(year + "  " + month + "��31��");
		else if(month.equals("Jun"))
			System.out.println(year + "  " + month + "��30��");
		else if(month.equals("Jul"))
			System.out.println(year + "  " + month + "��31��");
		else if(month.equals("Aug"))
			System.out.println(year + "  " + month + "��31��");
		else if(month.equals("Sep"))
			System.out.println(year + "  " + month + "��30��");
		else if(month.equals("Oct"))
			System.out.println(year + "  " + month + "��31��");
		else if(month.equals("Nov"))
			System.out.println(year + "  " + month + "��30��");
		else if(month.equals("Dce"))
			System.out.println(year + "  " + month + "��31��");
		else
			System.out.println("�·�����ֵ�Ƿ�");
		

	}

}
