package TheHeightConverte;

import java.util.Scanner;

public class HeightConverterApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the inch for convert to feet");
		double inch=sc.nextDouble();
	
		HeightConverter converter = new HeightConverter();
	
		System.out.printf("%.2f\n",converter.convertInchesToFeet(72.0));
		sc.close();
	}

}
