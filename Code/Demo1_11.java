package myjava;

public class Demo1_11 {

	public static void main(String[] args) {
		double birth, die, migrate, population;
		birth = 365 * 24 * 3600 / 7.0;
        die = 365 * 24 * 3600 / 13.0;
        migrate = 365 *24 *3600 / 45.0;
        population = 5 * (birth - die + migrate) + 312032486;
        System.out.println(population);
	}

}
