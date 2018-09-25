/* This class is client code that uses the Calculate Library 
 * to perform various mathematical tasks 
 * @author Alexis Lin
 * @version September 6, 2018
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.cube(2));
		System.out.println(Calculate.average(4,6));
		System.out.println(Calculate.average(4,6,8));
		System.out.println(Calculate.toRadians(90));
		System.out.println(Calculate.discriminant(1, 2, 12));
		System.out.println(Calculate.toImproperFrac(3,1,2));
		System.out.println(Calculate.toMixNum(-7,2));
		System.out.println(Calculate.foil(2,3,6,-7, "n"));
		System.out.println(Calculate.isDivisibleBy(4,1));
		System.out.println(Calculate.absValue(-10));
		System.out.println(Calculate.max(17,15));
		System.out.println(Calculate.max(19,18,10));
		System.out.println(Calculate.min(17,15));
		System.out.println(Calculate.round2(3.3187));
		System.out.println(Calculate.exponent(5,1));
		System.out.println(Calculate.factorial(0));
		System.out.println(Calculate.isPrime(-2));
		System.out.println(Calculate.gcf(4, 2));
		System.out.println(Calculate.sqrt(0));
		
		
		
		

	}

}