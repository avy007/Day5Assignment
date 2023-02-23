package Day5Assingment;

import java.util.Scanner;

public class FindMaxNo {

	public static void main(String[] args) {
	      int x,y,z;
	      int max;
		Scanner obj=new Scanner(System.in);
		
		x=obj.nextInt();
		System.out.println("value of x "+x);
		y=obj.nextInt();
		System.out.println("value of x "+y);
		z=obj.nextInt();
		System.out.println("value of x "+z);
		
		max=x;
		
		if(y>max) {
			max=y;
			
		}if(z>max) {
			max=z;
			
			
		}
		System.out.println("max no is "+max);
		
	

	}

}
