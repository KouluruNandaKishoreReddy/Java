
public class nested_while_loop {

	public static void main(String[] args) {
		// nested means loop inside the loop
		int i=1;
		
			while(i<=5)
			{
				System.out.println("Hello " + i);
			
				int j = 1;
				while(j<2)
				{
					System.out.println("hai " + j);
					break;
				}
				i++;
			
		}

	}

}
