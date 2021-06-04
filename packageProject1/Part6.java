package packageProject1;

import java.util.Scanner;

public class Part6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please input a character: ");
		Scanner sc = new Scanner(System.in);
		char ch= sc.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
	}
	

}
