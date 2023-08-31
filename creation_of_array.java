
public class creation_of_array {

	public static void main(String[] args) {
		
		int num[] = {1,6,5,9};
		
		System.out.println(num[0]);// to print array 1 number using index number
		
		// to create new type of array
		// int num[] = new int[4]
	
		
		// to update the array
		num[1]=8;
		
		System.out.println("the updated array " + num[1]);
		
		// to print all numbers in array
		
		for (int i=0;i<4;i++)
		{
			System.out.println(num[i]);
		}


	}

}
