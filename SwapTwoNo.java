package Day5Assingment;

import java.util.Scanner;

public class SwapTwoNo {

	public static void main(String[] args) {
		// swap to no
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter value of x");
		int x=obj.nextInt();
		System.out.println("enter value of y");
		int y=obj.nextInt();
		
		x=x+y; //3
		y=x-y; //3-2 =2
		x=y-x; //2-3=-1
		
		System.out.println("x= "+x);
		System.out.println("y= "+y);

	}

}
