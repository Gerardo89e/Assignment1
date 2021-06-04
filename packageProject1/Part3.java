package packageProject1;

import java.util.Scanner;

public class Part3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     double temp;
	     Scanner sc = new Scanner(System.in);
	      System.out.println("Enter first number: ");
	      double first = sc.nextDouble();
	      System.out.println("Enter second numbers: ");
	      double second=sc.nextDouble();

	      // Value of first is assigned to temp
	      temp = first;

	      // Value of second is assigned to first
	      first = second;

	      // Value of temp (initial value of first) is assigned to second
	      second = temp;

	      // %.2lf displays number up to 2 decimal points
	      System.out.println("\nAfter swapping, firstNumber = "+first);
	      System.out.println("After swapping, secondNumber = "+second);
	}

}
