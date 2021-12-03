package quadratic.java;

import java.util.Scanner;

public class QuadraticEq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of : a, b, c" );
		
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	double c = sc.nextDouble();
		
		
	double delta = b*b - 4.0 * a * c;
	if (delta > 0.0) {
		System.out.println(+ delta);
		
		double Root =-(b + Math.pow(delta ,0.5));
		double r1 = Root / 2.0 * a;
				
		double Root2 = (-b - Math.pow(delta, 0.5))/ 2 * a;
		
		System.out.println("first Root of value is : " + Root + r1);
		System.out.println("second root vlue is  : " + Root2);
	}

	else if (delta == 0.0)   
	{  
	double r1 = -b / (2.0 * a);  
	System.out.println("The root is " + r1);  
	}   
	else   
	{  
	System.out.println("Roots are not real.");  	
	}
	}
}