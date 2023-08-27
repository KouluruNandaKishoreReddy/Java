// Develop a java application to implement currency converter (Dollar to INR, EURO to INR, 
// Yen to INR and vice versa)using packages.
import java.util.Scanner;
class convetors{
	public double usa(double x) {
		double inr=x*82.55;
		return inr;
	}
	public double euro(double x) {
		double inr=x*89.11;
		return inr;
	}
	public double yen(double x) {
		double inr=x*1.7;
		return inr;
	}
	
}
public class converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		convetors con = new convetors();
		double r1=con.usa(10000);
		System.out.println("usa to inr : " +r1);
		
		double r2=con.euro(10000);
		System.out.println("euro to inr : " +r2);
		
		
		double r3=con.yen(10000);
		System.out.println("yen to inr : " +r3);
		
		
		
		
		

	}

}
