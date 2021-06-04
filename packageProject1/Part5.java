package packageProject1;
import java.util.Scanner;
public class Part5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char ch = 'z';
		System.out.println("Please input a character: ");
		Scanner sc = new Scanner(System.in);
		char ch= sc.next().charAt(0);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
	}

}
