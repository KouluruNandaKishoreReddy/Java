import java.util.Scanner;

public class Palindrome_number {

	public static void main(String[] args) {
		
		int r;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the n value: ");
		int n =sc.nextInt();
		
		int sum=0;
		int a=0;
		sum = a;
		while (n!=0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;	
		}
		System.out.println(sum);
		
		if(n==a)
		{
			System.out.println("It is a palindrome number");
			
		}
		else
			System.out.println("It is not a palindrome number");

	}

}
