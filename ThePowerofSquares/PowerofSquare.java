package ThePowerofSquares;

import java.util.Scanner;

public class PowerofSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println(squareNumber(num));
		
	}
		
			public static int squareNumber(int num) {
				return num*num;
		}
		
		
		
		

	

}
