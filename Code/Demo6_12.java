package myjava;

public class Demo6_12 {

	public static void main(String[] args) {
		print('1', 'Z', 10);

	}

	public static void print(char c, char d, int i) {
		int count = 0;
		for (char ch = c; ch <= d; ch++) {
			System.out.print(ch + " ");
			count++;
			if (count % i == 0)
				System.out.println();
		}

	}

}
