package Qustion3;

public class Month {
enum Months {
	JAN,FEB,MAR,APRIL,MAY,JUNE,JULY,AUG,SEP,OCT,NOV,DEC
}
 public static void main(String[] args) {
	
	 Months m = Months.JAN;
	 
	 switch(m){
	 case JAN:
	 System.out.println("This is the 1st Month of the Year January");
	 break;
	 case FEB:
	 System.out.println("This is the 2nd Month of the Year Febuary");
	 break;
	 case MAR:
		 System.out.println("This is the 3rd Month of the Year March");
		 break;
	 case APRIL:
		 System.out.println("This is the 4th Month of the Year April");
		 break;
	 case MAY :
		 System.out.println("This is the 5th Month of the Year May");
		 break;
	 case JUNE :
		 System.out.println("This is the 6th Month of the Year june");
		 break;
	 case JULY :
		 System.out.println("This is the 7th Month of the Year july");
		 break;
	 case AUG :
		 System.out.println("This is the 8th Month of the Year Augest");
		 break;
	 case SEP:
		 System.out.println("This is the 9th Month of the Year Spetumber");
		 break;
	 case OCT :
		 System.out.println("This is the 10th Month of the Year Octuber");
		 break;
	 case NOV:
		 System.out.println("This is the 11th Month of the Year November");
		 break;
     case DEC:
    	 System.out.println("This is the 12th Month of the Year December");
		 break;
			 
			 
	 default:
	 System.out.println("Month Invealide");
	 }
	 
}

}
