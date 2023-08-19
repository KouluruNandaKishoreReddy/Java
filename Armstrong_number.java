import java.util.*;
public class Armstrong_number {

	public static void main(String[] args) {
		
		int r;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the n value: ");
		int n =sc.nextInt();
		
		int sum=0;
		while (n!=0)
		{
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
			System.out.println(sum);	
		}	

	}

}
