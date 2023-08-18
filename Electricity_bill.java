//1.Develop a Java application to generate Electricity bill. Create a class with the following 
//members: Consumer no., consumer name, previous month reading, current month reading, 
//type of EB connection (i.e domestic or commercial). Compute the bill amount using the 
//following tariff.
//If the type of the EB connection is domestic, calculate the amount to be paid as follows: 
//	First 100 units - Rs. 1 per unit
//	101-200 units - Rs. 2.50 per unit
//	201 -500 units - Rs. 4 per unit
//	501 units - Rs. 6 per unit 
//If the type of the EB connection is commercial, calculate the amount to be paid as follows:  
//•	First 100 units - Rs. 2 per unit
//•	101-200 units - Rs. 4.50 per unit
//•	201 -500 units - Rs. 6 per unit
//•	501 units - Rs. 7 per unit 

import java.util.Scanner;
public class Electricity_bill {

	public static void main(String[] args) {
		
		double Bill;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Consumer number : ");
		int c_number=sc.nextInt();
		
		System.out.println("Enter consumer name : ");
		String c_name =sc.next();
		
		System.out.println("Enter previous month reading : ");
		double previous_reading = sc.nextDouble();
		
		System.out.println("Enter current month reading : ");
		double current_reading = sc.nextDouble();
		
		System.out.println("Enter the type of connection 1.Domestic connection 2. Commercial connection ");
		int connection_type =sc.nextInt();
		
		double units=current_reading - previous_reading;
			
			
			switch(connection_type)
			{
			case 1:
				if(units<=100)
					Bill = units *1;
				else if(units > 100 && units <=200)
					Bill = 100* 1+ ((units-100) *2.50); 
				 else if (units > 200 && units <=500)
					 Bill= 100*1+200*2.50+(units-300)*4;
				 else
				 	Bill = 100*1+200*2.50+200*4+(units-500)*6;
				System.out.println("consumer number : " +c_number +" consumer name: "+ c_name +" reading : "+ units + " The current month bill is " + Bill);
				 break;
				 
			case 2:
				if(units<=100)
					Bill = units *2;
				else if(units > 100 && units <=200)
					Bill = 100* 2 + ((units-100) *4.50); 
				 else if (units > 200 && units <=500)
					 Bill= 100*2+200*4.50+(units-300)*6;
				 else
				 	Bill = 100*2+200*4.50+200*6+(units-500)*7;
				System.out.println("consumer number : " +c_number +" consumer name: "+ c_name +" reading : "+ units +" The current month bill is " + Bill);
				
				
			}				

	}

}
