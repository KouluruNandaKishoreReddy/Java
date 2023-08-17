import java.util.*;
public class fibonacci_series {

	public static void main(String[] args) {
		
		int i,n,fib1,fib2,fib;
		
		i=0;
		fib1=0;
		fib2=1;
		fib=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value:");
		n=sc.nextInt();
		
		System.out.println(fib1);
		System.out.println(fib2);
		
		while(i<n-2) {
			
			fib=fib1+fib2;
			System.out.println(fib);
			fib1=fib2;
			fib2=fib;
			i++;		
			
		}	

	}

}
