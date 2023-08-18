import java.util.*;
public class Swap_2_numbers {

	public static void main(String[] args) {
		
		int num1,num2,a;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number 1 : " );
		num1 = sc.nextInt();
		
		System.out.println("Enter number 2 : ");
		num2 = sc.nextInt();
		a = num1;
		num1=num2;
		num2=a;
		
		System.out.println("Swap number 1 is : " + num1);
		System.out.println("Swap number 2 is : " +num2);
		

	}

}
