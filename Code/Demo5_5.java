package myjava;

public class Demo5_5 {

	public static void main(String[] args) {
		System.out.println("Ç§¿Ë               °õ              °õ               Ç§¿Ë");
		for(int i = 1 , j = 20 ; i <= 199 ; i += 2 , j +=5) {
			double p = 2.2 * i;
			double k = j / 2.2;
			System.out.printf("%-5d%16.1f%15d%18.2f\n", i , p , j , k );
			
		}

	}

}
