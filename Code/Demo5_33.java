package myjava;

public class Demo5_33 {

	public static void main(String[] args) {
		final int  N= 10000;
		int i , n , sum;
		System.out.print("完全数有：");
		for(n = 1 ; n <= N ; n ++) {
			sum = 0;
			for(i = 1 ; i < n ; i ++)
				if(n % i == 0)
					sum += i;
			if(n == sum)
				System.out.print(n + "   ");
		}


	}

}
