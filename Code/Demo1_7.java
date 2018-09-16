package myjava;

public class Demo1_7 {

	public static void main(String[] args) {
		double pi = 1,t;
		int sign = 1,deno = 1;
		while(deno < 11 ) {
			sign = -1 * sign;
			deno = deno + 2;
			t = 1.0 * sign / deno ;
			pi = pi + t;
		}
		pi = 4 * pi;
		System.out.print(pi);
	}

}
