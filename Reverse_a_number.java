import java.util.Scanner;

public class Reverse_a_number {

	public static void main(String[] args) {
		
		int n,r,sum;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		n = sc.nextInt();
		
		sum=0;
		
		while (n != 0)
			{
			r=n%10;
			sum=sum*10+r;
			n=n/10;		
			
			}
		System.out.println(sum);
	}

}
