package myjava;

public class Demo5_23 {

	public static void main(String[] args) {
		final int n = 5000;
		double sumLeft = 0 , sumRight = 0;
		int i;
		for( i = 1 ; i <= n ; i ++) 
			sumLeft += 1.0 / i;
		for(i = n ;i >= 1 ; i --)
			sumRight += 1.0 / i;
		System.out.println("从左至右为：" + sumLeft +"\n从右至左为：" + sumRight );

	}

}
