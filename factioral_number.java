import java.util.*;
public class factioral_number {

	public static void main(String[] args) {
		int i,fact;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		i=1;
		fact=1;
		
		while(i<=n) {
			
			fact=fact*i;
			i++;
						
		}	
		System.out.println("factorial of " + n + " is "+ fact);

	}

}
