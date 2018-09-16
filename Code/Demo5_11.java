package myjava;

public class Demo5_11 {

	public static void main(String[] args) {
		int count = 0;
		for(int n = 100 ; n <= 1000 ; n ++) {
			if(n % 5 == 0 || n % 6 == 0)
				if(!(n % 5 == 0 && n % 6 == 0)) {
					System.out.print(n + " ");
					count ++;
					if(count % 10 == 0)
						System.out.println();
				}
		}

	}

}
