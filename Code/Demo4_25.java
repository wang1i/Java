package myjava;

public class Demo4_25 {

	public static void main(String[] args) {
		int ch1 = 65 + (int)(Math.random() * 26);
		int ch2 = 65 + (int)(Math.random() * 26);
		int ch3 = 65 + (int)(Math.random() * 26);
		int ch4 = 65 + (int)(Math.random() * 26);
		int num = 1000 + (int)(Math.random() * 9000);
		System.out.println("³µÅÆºÅ£º" + (char)ch1 + (char)ch2 + (char)ch3 + (char)ch4 +num);
	}

}
