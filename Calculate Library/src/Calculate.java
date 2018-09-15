/* This class contains methods that perform various math operations
 * @author Alexis Lin
 * @version September 6, 2018
 */
public class Calculate {
	//returns the square of the input
	public static int square(int number) {
		return number*number;
	}
	
	public static int cube(int number) {
		return number*number*number;
	}
	
	public static double average(double value1, double value2) {
		return (value1 + value2)/2;
		
	}
	
	public static double average(double value1, double value2, double value3) {
		return (value1 + value2 + value3)/3;
	}
	
	public static double toDegrees(double radians) {
		return radians*(180/3.14);
	}
	
	public static double toRadians(double degrees) {
		return degrees*(3.14/180);
	}
	
	public static double discriminant(double a, double b, double c) {
		return (b*b)- (4*a*c);
	}
	
	public static String toImproperFrac(int whole, int numerator, int denominator) {
		return (whole*denominator+numerator)+"/"+denominator;
	}
	
	public static String toMixNum(int numerator, int denominator) {
		return (numerator/denominator)+ " " + (numerator%denominator) + "/" + denominator; 
	}
	
	public static String foil(int a, int b, int c, int d, String x) {
		return (a*c) + x + "^2" + " + " + ((b*c)+(a*d)) + x + " + " +(b*d);
	}
	
	public static boolean isDivisibleBy(int dividend, int divisor) {
		if (dividend % divisor == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static double absValue(double num) {
		if (num > 0) {
			return num;
		}
		else {
			return num*(-1);
		}
					
	}
	public static double max(double num1, double num2) {
		if (num1 > num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
	
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
	
	public static int min(int num1, int num2) {
		if (num1<num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
//check this again
	 public static double round2(double num) {
		if ((num*100)-(int)(num*100) >= 0.5) {
			return (((int)(num*100))/100.0) + 0.01;
		}
		else {
			return ((int)(num*100))/100.0;
		}
	 }
	 public static double exponent(double base, int exponent) {
		 double newBase = base;
		 double answer = base;
		 for (int i = 2; i<=exponent; i++) {
			 newBase = base*newBase;
			 answer = newBase;
			
			 }
		 return answer;
		 }
	 //choose better variabl
	 public static int factorial(int num) {
		int product = 1;
		 for (int i = 1; i <= num; i++) {
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
		 return true;
	 }
	 public static int gcf(int num1, int num2) {
		 int gcf = 1;
		 for (int cf = 1; cf <= Calculate.min(num1, num2); cf++) {
			 if (Calculate.isDivisibleBy(num1, cf) && Calculate.isDivisibleBy(num2, cf)) {
				 gcf = cf;
			 }			 
		 }
		 return gcf;
	 }
	 /*
	  * divide radicand by guess, add guess, half the sum
	  * if radicand-0.005 <  answer * answer <  radicand + 0.005
	  * return the answer
	  * loop until you find the correct answer
	  */
	 public static double sqrt(double radicand) {
		 double answer = 0;
		 for (double guess = 0.0; guess <= radicand; guess += 0.001 ) {
			 answer = (radicand/guess + guess)/2;
			 if ((radicand - 0.005 <  answer*answer) && (answer*answer <  radicand + 0.005)) {
				 return answer;
			 }
		 }
		 Calculate.round2(answer);
		 return answer;
	 }
}
	 
	


