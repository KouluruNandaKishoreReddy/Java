
public class Logical_operators {

	public static void main(String[] args) {
		// In logical operators we have mainly three types they are 
		// And operator - symbol is "&" > if both are true then it will be true
		//Or operator   - symbol is "|" > if both are false it will be false
		// not operator - symbol is "!" > if true then output false ,if false then output true
		
		// example for And 
		int a =5;
		int b =6;
		int x=4;
		int y = 8;
		
		boolean result = a>b & x<y; // check for a<b & x<y, for | 
		System.out.println(result);
		System.out.println(!result);	
		
		
	}

}
