package TheFinanceCalculato;

import java.util.Scanner;

public class TheFinanceCalculatorApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the p");
		double p=sc.nextDouble();
		System.out.println("Enter the r");
		double r=sc.nextDouble();
		System.out.println("Enter the t");
		double t=sc.nextDouble();
		TheFinanceCalculator calculator = new TheFinanceCalculator();
		System.out.println("The simple interest is");
		System.out.printf("%.2f",calculator.calculateSimpleInterest(p,r,t));
		sc.close();
	}

}
