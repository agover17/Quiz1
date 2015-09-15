package quiz_1;

import java.util.Scanner;

public class qb_rater {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		//Variable declaration
		double tds;
		double yards;
		double inters;
		double comps;
		double attempts;
		
		//Gather input from user
		System.out.println("Enter number of touchdowns: ");
		tds = scan.nextDouble();
		System.out.println("Enter total yards: ");
		yards = scan.nextDouble();
		System.out.println("Enter number of interceptions: ");
		inters = scan.nextDouble();
		System.out.println("Enter number of completions: ");
		comps = scan.nextDouble();
		System.out.println("Enter number of attempted passes: ");
		attempts = scan.nextDouble();
		
		//More variables
		double a, b, c, d;
		
		a = ((comps/attempts) - 0.3) * 5;
		b = ((yards / attempts) - 3) * 0.25;
		c = ((tds / attempts)* 20);
		d = 2.375 - ((inters/attempts) * 25);
		
		double rating = ((a + b + c + d)/6) * 100;
		
		System.out.println("Passer rating: " + rating);
	}
}
