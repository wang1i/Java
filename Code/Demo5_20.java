package myjava;

public class Demo5_20 {

	public static void main(String[] args) {
		int i , n , count = 0;
		for(n = 2 ; n <= 1000 ; n ++) {
			for(i = 2 ; i <= (int)(Math.sqrt(n)) ; i ++)
				if(n % i == 0) break;
			if(i > (int)(Math.sqrt(n))) {
				count ++;
				System.out.print(n + " ");
				if(count % 8 == 0)
					System.out.println();
			}
		}

	}

}
