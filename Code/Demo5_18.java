package myjava;


public class Demo5_18 {

	public static void main(String[] args) {
		int i, j;
		System.out.println("图案1");
		for (i = 1; i <= 6; i++) {
			for (j = 1; j <= i; j++)
				System.out.print(j + "  ");
			System.out.println();
		}
		System.out.println("图案2");
		for (i = 1; i <= 6; i++) {
			for (j = 6; j >= i; j--)
				System.out.print(j + "  ");
			System.out.println();
		}
		System.out.println("图案3");
		for (i = 1; i <= 6; i++) {
			for (j = 1; j <= 6 - i; j++)
				System.out.print("   ");
			for (j = i; j >= 1; j--)
				System.out.print(j + "  ");
			System.out.println();
		}
		System.out.println("图案4");
		for (i = 1; i <= 6; i++) {
			for (j = 1; j < i; j++)
				System.out.print("   ");
			for (j = 1; j <= 7 - i; j++)
				System.out.print(j + "  ");
			System.out.println();
		}

	}

}
