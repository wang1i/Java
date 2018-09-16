package myjava;

public class Demo5_24 {

	public static void main(String[] args) {
		final int n = 99;
		double sum = 0;
		for(int i = 3 ; i <= n ; i +=2)
			sum += 1.0 * (i - 2) / i;
		System.out.println("½á¹û£º" + sum);

	}

}
