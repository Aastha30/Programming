
public class DayOfWeekMain {

	public static void main(String[] args) {
		int d=Integer.parseInt(args[0]);
		int m=Integer.parseInt(args[1]);
		int y=Integer.parseInt(args[2]);
		
		switch(Util.dayOfWeek(d,m,y))
		{
		case 0:System.out.println("Sunday");
				break;
		case 1:System.out.println("Monday");
		      	break;
		case 2:System.out.println("Tuesday");
				break;
		case 3:System.out.println("Wednesday");
				break;
		case 4:System.out.println("Thursday");
				break;
		case 5:System.out.println("Friday");
				break;
		case 6:System.out.println("Saturday");
				break;
		default:System.out.println("Invalid Day");
		}
	

	}

}
