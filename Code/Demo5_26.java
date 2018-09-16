package myjava;

public class Demo5_26 {

	public static void main(String[] args) {
		int i , j ;
		double e,term;
		for(i = 10000 ; i <= 100000 ; i += 10000) {
			e = 1;
			term = 1;
			for(j = 1 ; j <= i ; j ++) {
				term /= j;
				e  += term;
			}
			System.out.println("i=" + i + "          e=" + e);
		}

	}

}
