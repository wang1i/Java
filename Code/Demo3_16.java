package myjava;

public class Demo3_16 {

	public static void main(String[] args) {
		int x = (int)(Math.random() * 50);
		int y = (int)(Math.random() * 100);
		int sign = (int)(Math.random() * 10 ) / 5;
		if(sign == 0 )
			System.out.println("×ø±ê£º" + "(-" + x + "," + "-" + y +")" );
		else
			System.out.println("×ø±ê£º" + "(" + x + "," + y + ")");
		

	}

}
