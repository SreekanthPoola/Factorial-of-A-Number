import java.io.*;
import java.util.Scanner;
public class Example {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = s.nextInt();
		int fact = 1;
		for(int i=2;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of the Number: "+fact);
	}
}
		
