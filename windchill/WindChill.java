package windchill;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of temp int celecius ; "  );
		
	double c = sc.nextDouble();
	double v = sc.nextDouble(); // v is speed mile/hours and 1mile/hr= 1.60944KM/hr
	
	double t  = c * (9/5) + 32;

	if (t < 50 && v > 3 && v < 120) {
		
		double w = 35.74 + 0.6215 * t + (0.4275 * t -35.75) * Math.pow( v, 0.16 );

		System.out.println("wind chill is : " + w);
	}else {
		System.out.println("enter vlaue is out of range : ");
	}
	}

}
