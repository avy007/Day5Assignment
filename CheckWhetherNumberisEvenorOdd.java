package Day5Assingment;

import java.util.Scanner;

public class CheckWhetherNumberisEvenorOdd {

	public static void main(String[] args) {
		 Scanner obj=new Scanner(System.in);
		 
		 int x=obj.nextInt();
		 
		 if(x%2==0) {
			 
			 System.out.println("Number is Even");
			 
		 }else {
			 System.out.println("Number is odd");
		 }

	}

}
