package myjava;

public class Demo5_25 {

	public static void main(String[] args) {
		int  i , j = 1 , sign = -1 ;
		double pi ;
		for(i = 10000 ; i <=100000 ; i += 10000) {
			pi = 0;
			for(j = 1 ; j <= 2 * i - 1 ; j += 2) {
			sign *= -1;
			pi += 1.0 * sign / j;
		    }
			pi *= 4;
			System.out.println("i=" + i +"     ¦Ð=" + pi);
		}

	}

}
