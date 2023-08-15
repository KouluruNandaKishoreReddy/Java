
public class switch_case {

	public static void main(String[] args) {
		// switch case is a method to simply the problem
		
		int n = 1;
		 switch(n)// switch will check the every statement even it finds the correct statement so we use the break
		 {
		 case 1:
		 	System.out.println("It is a good day");
		 	break;
		 case 2:
			 System.out.println("hope we will see next day");
			 break;
		default: // it will work if the input is wrong
			System.out.println("Your input is not valid");
		 
		 }

	}

}
