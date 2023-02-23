package Day5Assingment;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int y=0;
		//a. I/P -> Year, ensure it is a 4 digit number.
		//b. Logic -> Determine if it is a Leap Year.
		//c. O/P -> Print the year is a Leap Year or not.
          
		
		Scanner obj=new Scanner(System.in);
		
		y=obj.nextInt();
		while (y<999 || y>9999){
            System.out.print("year is not valid Enter 4 digit number for year : ");
            y = obj.nextInt();
        }
		 if ((y%2) == 0) {
	            System.out.println(y+" is leap year");
	        }else {
	            System.out.println(y+" is not leap year");
	        }
	}

}
