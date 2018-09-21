/* This class contains methods that perform various math operations
 * @author Alexis Lin
 * @version September 18, 2018
 */
public class Calculate {
	//returns the square of the input
	public static int square(int number) {
		return number*number;
	}
	
	//returns the cube of the input
	public static int cube(int number) {
		return number*number*number;
	}
	
	//returns the average of two numbers
	public static double average(double value1, double value2) {
		return (value1 + value2)/2;	
	}
	
	//returns the average of three numbers
	public static double average(double value1, double value2, double value3) {
		return (value1 + value2 + value3)/3;
	}
	
	//returns the degrees from radians
	public static double toDegrees(double radians) {
		return radians*(180/3.14169);
	}
	
	//returns radians from degrees
	public static double toRadians(double degrees) {
		return degrees*(3.14159/180);
	}
	
	//returns the discriminant of the quadratic formula
	public static double discriminant(double a, double b, double c) {
		return (b*b)- (4*a*c);
	}
	
	//converts a mixed number to an improper fraction, returns
	public static String toImproperFrac(int whole, int numerator, int denominator) {
		return (whole*denominator+numerator)+"/"+denominator;
	}
	
	//converts an improper fraction to a mixed number, returns
	public static String toMixNum(int numerator, int denominator) {
		return (numerator/denominator)+ " " + (numerator%denominator) + "/" + denominator; 
	}
	
	//returns a foiled a quadratic
	public static String foil(int a, int b, int c, int d, String x) {
		return (a*c) + x + "^2" + " + " + ((b*c)+(a*d)) + x + " + " +(b*d);
	}
	
	//determines if a number is divisible by another number
	public static boolean isDivisibleBy(int dividend, int divisor) {
		if (dividend % divisor == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// returns the absolute value of anumber
	public static double absValue(double num) {
		if (num > 0) {
			return num;
		}
		else {
			return num*(-1);
		}				
	}
	
	//returns the maximum of two numbers
	public static double max(double num1, double num2) {
		if (num1 > num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
	
	//returns the maximum of three numbers
	public static double max(double num1, double num2, double num3) {
		if (num1>num2 && num1>num3) {
			return num1;
		}
		else if (num2>num1 && num2>num3) {
			return num2;
		}
		else {
			return num3;
		}
	}
	
	//returns the minimun of two numbers
	public static int min(int num1, int num2) {
		if (num1<num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
	
	//rounds a number to the nearest hundredth place
	 public static double round2(double num1) {
		double num2 = (num1+.005)*100;
		double num3 = ((int)num2)/100.0;
		return num3;
	 }

	 //returns a number powered by its exponent
	 public static double exponent(double base, int exponent) {
		 double newBase = base;
		 double answer = base;
		 for (int i = 2; i<=exponent; i++) {
			 newBase = base*newBase;
			 answer = newBase;
			
			 }
		 return answer;
		 }

	 //returns the factorial of a number
	 public static int factorial(int num) {
		int product = 1;
		 for (int i = num; i > 0; i--) {
			product = product*i;
			 
		 }
		 return product;
	 }
	 //checks if an integer is prime
	 public static boolean isPrime(int num) {
		 for (int i = 2; i < num; i++) {
				if (Calculate.isDivisibleBy(num,i)) {
					return false;			
				}
		 }
		 if (num == 1) {
			 return false;
		 }
		 else {
			 return true;
		 }
	 }
	 //returns the greatest common factor of two numbers
	 public static int gcf(int num1, int num2) {
		 int gcf = 1;
		 for (int cf = 1; cf <= Calculate.min(num1, num2); cf++) {
			 if (Calculate.isDivisibleBy(num1, cf) && Calculate.isDivisibleBy(num2, cf)) {
				 gcf = cf;
			 }			 
		 }
		 return gcf;
	 }
	 //returns the square root of a number
	 public static double sqrt(double radicand) {
		 double answer = 0;
		 for (double guess = 0.001; guess <= radicand; guess += 0.001 ) {
			 answer = (radicand/guess + guess)/2;
			 if ((radicand - 0.005 <  answer*answer) && (answer*answer <  radicand + 0.005)) {
				 answer = Calculate.round2(answer); 
				 return answer;	 
			 }
		 }
		 return answer;
	 }
}
		


	 
	


