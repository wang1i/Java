package myjava;

public class Demo1_4 {

	public static void main(String[] args) {
		System.out.println("a     a^2   a^3");
		for(int i = 1; i <= 4;i++ ){
		   int result = 1; 
		   for(int j = 1; j <= 3;j++ ) {
			  result = result * i;
			  System.out.printf("%-6d",result);
		   }
		System.out.println();   
		}
	}

}
