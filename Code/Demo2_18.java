package myjava;

public class Demo2_18 {

	public static void main(String[] args) {
		System.out.println("a        b        pow(a,b)");
		for(int i = 1 ; i <= 5 ; i ++ ) {
			System.out.printf("%-9d%-9d%d",i , i+1 ,(int)Math.pow(i, i+1));
			System.out.println();
		}

	}

}
