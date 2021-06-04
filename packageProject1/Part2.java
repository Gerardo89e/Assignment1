package packageProject1;
import java.util.Scanner;
public class Part2 {

	public static void main(String[] args) {
		    int quotient, remainder;
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter dividend: ");
		    int dividend=sc.nextInt();
		    System.out.println("Enter divisor: ");
		    int divisor=sc.nextInt();

		    // Computes quotient
		    quotient = dividend / divisor;

		    // Computes remainder
		    remainder = dividend % divisor;

		    System.out.println("Quotient = "+quotient);
		    System.out.println("Remainder = "+ remainder);
	}

}
