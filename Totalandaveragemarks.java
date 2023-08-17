import java.util.*;
public class Totalandaveragemarks {

	public static void main(String[] args) {
		
		int s1,s2,s3,s4,s5,total,average;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the marks:");
		
		System.out.println("Enter the subject 1 marks: "); // type any number
		s1= sc.nextInt();
		
		System.out.println("enter the subject 2 marks: ");
		s2= sc.nextInt();
		
		System.out.println("enter the subject 3 marks: ");
		s3= sc.nextInt();
		
		System.out.println("enter the subject 4 marks: ");
		s4= sc.nextInt();
		
		System.out.println("enter the subject 5 marks: ");
		s5= sc.nextInt();
		
		
		total=s1+s2+s3+s4+s5;
		
		System.out.println("The total marks are : " + total );
		
		average =total/5;
		
		System.out.println("The total average is :  " + average);
		
		if (average>=90)
		{
			System.out.println("S grade");
			
		}
		
		else if (average>=80 & average<=89)
		{
			System.out.println("0 grade");
			
		}
		
		else if (average>=70 & average<=79)
		{
			System.out.println("A grade");
			
		}
		
		else if (average>=60 & average<=69)
		{
			System.out.println("B grade");
			
		}
		
		else
			System.out.println("Fail");
		
		
		
		
		
		

	}

}
