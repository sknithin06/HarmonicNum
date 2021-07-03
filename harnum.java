package Java;
import java.util.Scanner;
public class harnum {
	public static void main(String[] args) {
		System.out.println("Welcome to BasicCoreProgram");
		
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter a number:");  
		int n=sc.nextInt(); 
		

		double sum = 0.0;
		for (int i = 1; i <= n; i++) {
			sum = sum + (double) 1 / i;
			System.out.println("Harmonic value of given number is:"+sum);
		}
		System.out.println("Harmonic value of given number is:"+sum);
	}
}
