package myjava;

public class Demo5_15 {

	public static void main(String[] args) {
		int count = 0;
		for(int num = 33 ; num <= 126 ; num ++) {
			System.out.print((char)num + " ");
			count ++;
			if(count % 10 == 0)
				System.out.println();
		}

	}

}
