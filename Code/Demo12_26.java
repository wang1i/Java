package myjava;

import java.io.File;
import java.util.Scanner;

public class Demo12_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������Ŀ¼���ƣ�");
		String dir = input.next();
		input.close();
		File f = new File(dir);
		if (f.exists())
			System.out.print("Ŀ¼�Ѿ�����");
		else {
			f.mkdirs();
			System.out.print("Ŀ¼�����ɹ�");
		}

	}

}
