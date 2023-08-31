//kalamrutha method
import java.util.*;

public class To_calculate_ayam {

	public static void main(String[] args) {
		
		int length,breadth;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the house : ");
		length = sc.nextInt();
		
		System.out.println("Enter the Breadth of the house : ");
		breadth = sc.nextInt();
		
		int keshtrapadamu = (length*breadth);
		
		int ayam = ((keshtrapadamu/9)* 9)%8;
		
		System.out.println("The ayam for the house : " + ayam);
		
		switch(ayam) {
		case 1:
			System.out.println("Dhwaja Aaya");
			break;
		case 2:
			System.out.println("Dhumra Aaya");
			break;
		case 3:
			System.out.println("Simha Aaya ");
			break;
		case 4:
			System.out.println("Svana Aaya");
			break;
		case 5:
			System.out.println("Vrushabha Aaya ");
			break;
		case 6:
			System.out.println("khara Aaya ");
			break;
		case 7:
			System.out.println("Gaja Aaya ");
			break;
		case 8:
			System.out.println(" Kaka Aaya ");	
		}
		
		// To calculate danam
		
		int Dhanam = (keshtrapadamu *8)%12;
		
		if (Dhanam == 0)
				System.out.println("Dhanam :"+ 12);
		else
			System.out.println("Dhanam : " +Dhanam);
		// to calculate  runam
		int runam = (keshtrapadamu*3)% 8;
		System.out.println("Runam : " + runam);
		
		// to calculate no of years the house will be
		
		int house_age = ((keshtrapadamu)*8)%120;
		System.out.println("The age of the house : " + house_age);
		
		// to calculate weeks for the house
		 
		int vara = (keshtrapadamu*9)%7;
		
		switch (vara) {
		
		case 1:
			System.out.println("varam : "+"Sunday");
			break;
		case 2:
			System.out.println("varam : "+"Monday");
			break;
		case 3:
			System.out.println("varam : "+"Tuesday");
			break;
		case 4:
			System.out.println("varam : "+"Wednesday");
			break;
		case 5:
			System.out.println("varam : "+"Thursday");
			break;
		case 6:
			System.out.println("varam : "+"Friday");
			break;
		case 7:
			System.out.println("varam : "+"Saturday");
			break;
		default:
			System.out.println("varam : "+"Saturday");
		}
		
		// to calculate tithi  for house
		int tithi = (keshtrapadamu*6)% 30;
		
		switch(tithi) {
		
		case 1:
			System.out.println("Tithi : " +"Pratipada");
			break;
		case 2:
			System.out.println("Tithi : " +"Dwithiya");
			break;
		case 3:
			System.out.println("Tithi : " +"Trithiya");
			break;
		case 4:
			System.out.println("Tithi : " +"Chaturthi.");
			break;
		case 5:
			System.out.println("Tithi : " +"Panchami");
			break;
		case 6:
			System.out.println("Tithi : " +"Shasthi.");
			break;
		case 7:
			System.out.println("Tithi : " +"Saptami");
			break;
		case 8:
			System.out.println("Tithi : " +"Ashtami");
			break;
		case 9:
			System.out.println("Tithi : " +"Navami");
			break;
		case 10:
			System.out.println("Tithi : " +"Dashami");
			break;
		case 11:
			System.out.println("Tithi : " +"Ekadasi");
			break;
		case 12:
			System.out.println("Tithi : " +"Dwadashi");
			break;
		case 13:
			System.out.println("Tithi : " +"Thrayodashi");
			break;
		case 14:
			System.out.println("Tithi : " +"Chaturdashi");
			break;
		case 15:
			System.out.println("Tithi : " +"Poornima");
			break;
		case 16:
			System.out.println("Tithi : " +"Pratipada");
			break;
		case 17:
			System.out.println("Tithi : " +"Dwithiya");
			break;
		case 18:
			System.out.println("Tithi : " +"Trithiya");
			break;
		case 19:
			System.out.println("Tithi : " +"Chaturthi.");
			break;
		case 20:
			System.out.println("Tithi : " +"Panchami");
			break;
		case 21:
			System.out.println("Tithi : " +"Shasthi.");
			break;
		case 22:
			System.out.println("Tithi : " +"Saptami");
			break;
		case 23:
			System.out.println("Tithi : " +"Ashtami");
			break;
		case 24:
			System.out.println("Tithi : " +"Navami");
			break;
		case 25:
			System.out.println("Tithi : " +"Dashami");
			break;
		case 26:
			System.out.println("Tithi : " +"Ekadasi");
			break;
		case 27:
			System.out.println("Tithi : " +"Dwadashi");
			break;
		case 28:
			System.out.println("Tithi : " +"Thrayodashi");
			break;
		case 29:
			System.out.println("Tithi : " +"Chaturdashi");
			break;
		case 30:
			System.out.println("Tithi : " +"Amavasaya");
			break;	
		default:
			System.out.println("Tithi : " +"Amavasaya");
		
		}
		
		int nakshatra = (keshtrapadamu*8) % 27 ;
	
		switch (nakshatra) {
		
	case 1:
		System.out.println("Nakshatram : " +"Ashvini");
		break;
	case 2:
		System.out.println("Nakshatram : "+"Bharani ");
		break;
	case 3:
		System.out.println("Nakshatram : "+"Krittika ");
		break;
	case 4:
		System.out.println("Nakshatram : "+"Rohini");
		break;
	case 5:
		System.out.println("Nakshatram : "+"Mrigashīrsha ");
		break;
	case 6:
		System.out.println("Nakshatram : "+"Ardra ");
		break;
	case 7:
		System.out.println("Nakshatram : "+"Punarvasu ");
		break;
	case 8:
		System.out.println("Nakshatram : "+"Pushya ");
		break;
	case 9:
		System.out.println("Nakshatram : "+"Āshleshā ");
		break;
	case 10:
		System.out.println("Nakshatram : "+"Maghā");
		break;
	case 11:
		System.out.println("Nakshatram : "+"Pūrva Phalgunī ");
		break;
	case 12:
		System.out.println("Nakshatram : "+"Uttara Phalgunī ");
		break;
	case 13:
		System.out.println("Nakshatram : "+"Hasta");
		break;
	case 14:
		System.out.println("Nakshatram : "+"Chitra");
		break;
	case 15:
		System.out.println("Nakshatram : "+"Svati");
		break;
	case 16:
		System.out.println("Nakshatram : "+"Vishakha ");
		break;
	case 17:
		System.out.println("Nakshatram : "+"Anuradha");
		break;
	case 18:
		System.out.println("Nakshatram : "+"Jyeshtha ");
		break;
	case 19:
		System.out.println("Nakshatram : "+"Mula");
		break;
	case 20:
		System.out.println("Nakshatram : "+"Purva Ashadha");
		break;
	case 21:
		System.out.println("Nakshatram : "+"Uttara Ashadha");
		break;
	case 22:
		System.out.println("Nakshatram : "+"Shravana ");
		break;
	case 23:
		System.out.println("Nakshatram : "+"Dhanishta ");
		break;
	case 24:
		System.out.println("Nakshatram : "+"Shatabhisha ");
		break;
	case 25:
		System.out.println("Nakshatram : "+"Purva Bhadrapada ");
		break;
	case 26:
		System.out.println("Nakshatram : "+"Uttara Bhādrapadā ");
		break;
	case 27:
		System.out.println("Nakshatram : "+"Revati");
		break;
	default:
		System.out.println("Nakshatram : "+"Revati");
		}
		
		// to know drikruthi
		
		int drikruthi = (keshtrapadamu*9)%8;
		
		switch(drikruthi) {
		
		case 1:
			System.out.println("drikruthi : "+"indra " );
			break;
		case 2:
			System.out.println("drikruthi : "+"agni " );
			break;
		case 3:
			System.out.println("drikruthi : "+"yama" );
			break;
		case 4:
			System.out.println("drikruthi : "+"niruthi " );
			break;
		case 5:
			System.out.println("drikruthi : "+"varuna " );
			break;
		case 6:
			System.out.println("drikruthi : "+"vayu " );
			break;
		case 7:
			System.out.println("drikruthi : "+"kubera " );
			break;
		default:
			System.out.println("drikruthi : "+"eeswara" );
		}
		
		// to calculate amsa
		
		int amsa = (keshtrapadamu*6)%8;
		System.out.println(amsa);
			
		

	}

}
