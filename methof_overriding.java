// this is called method overloading writing 2 methods calling which we need
class calculator{
	public int add (int n1,int n2) {
		return n1+n2;
	}
	public int add1 (int n1,int n2,int n3) {
		return n1+n2+n3;
	}
}
public class methof_overriding {

	public static void main(String[] args) {

		int r;
		calculator calc = new calculator();
		r=calc.add(5, 6);
		System.out.println(r);

	}

}
