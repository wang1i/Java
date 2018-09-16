package myjava;

public class Demo5_35 {

	public static void main(String[] args) {
		final int N = 624;
		double sum = 0;
		for (int i = 0; i <= N; i++) {
			sum += 1.0 / (Math.sqrt(i) + Math.sqrt(i + 1));
		}
		System.out.println("½á¹û£º" + sum);
	}

}
