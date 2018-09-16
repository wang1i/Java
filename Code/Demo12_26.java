package myjava;

import java.io.File;
import java.util.Scanner;

public class Demo12_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入目录名称：");
		String dir = input.next();
		input.close();
		File f = new File(dir);
		if (f.exists())
			System.out.print("目录已经存在");
		else {
			f.mkdirs();
			System.out.print("目录创建成功");
		}

	}

}
