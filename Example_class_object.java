
class calc{
	public int sub(int n,int n1) {
		int r= n - n1;
		return r;	
		
	}

}
public class Example_class_object {

	public static void main(String[] args) {
		
		int num1=5;
		int num2=4;
		
		calc c = new calc();
		int result=c.sub(num1,num2);
		System.out.println(result);	
			

	}

}
