import java.util.*;

public class sum_of_n_numbers {

	public static void main(String[] args) {
		
		int n,sum;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the n value: ");
		n =sc.nextInt();
		sum=0;
			sum=(n*(n+1))/2;
	
		System.out.println("sum of n Natural numbers is : " +sum);
		
	}

}
