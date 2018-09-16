package myjava;

public class Demo4_6 {

	public static void main(String[] args) {
		final double R = 40;
		double ra1 = 2 * Math.PI * Math.random();
		double ra2 = 2 * Math.PI * Math.random();
		double ra3 = 2 * Math.PI * Math.random();
		System.out.println("圆内随机三点为：" + "(" + R * Math.cos(ra1) + "," +R * Math.sin(ra1) + ")  、" + 
				"(" + R * Math.cos(ra2) + "," +R * Math.sin(ra2) + ")  、" + "(" + R * Math.cos(ra3) + "," +R * Math.sin(ra3) + ") " );
		

	}

}
