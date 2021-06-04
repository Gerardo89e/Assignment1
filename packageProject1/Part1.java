package packageProject1;
import java.util.Scanner;
public class Part1 {

	public static void printResult(int ISBN,double price,int numCopies) {
		System.out.println(ISBN +" "+ price+" "+numCopies);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Please input Book ISBN,price, no of copies printed");
		int ISBN = sc.nextInt();
		double price=sc.nextDouble();
		int numCopies=sc.nextInt();
		sc.close();
		//System.out.println(ISBN +" "+ price+" "+numCopies);
		printResult(ISBN,price,numCopies);
	}

}
