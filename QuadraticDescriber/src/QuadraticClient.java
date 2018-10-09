import java.util.Scanner;
/* This class contains a method that will handle interactions with the user
 * @author Alexis Lin
 * @version October 2, 2018
 */
public class QuadraticClient {

	public static void main(String[] args) {
		System.out.println("Welcome to the Quadratic Describer");
		System.out.println("Provide values for coefficients a, b, and c");
		Scanner console = new Scanner(System.in);
		String nextStep;
		do {
			System.out.println();
			System.out.print("a: ");
			double a = console.nextDouble();
			System.out.print("b: ");
			double b = console.nextDouble();
			System.out.print("c: ");
			double c = console.nextDouble();
			System.out.println();
			System.out.println(Quadratic.quarDescriber(a, b, c));
			System.out.println();
			System.out.println("Do you want to keep going? (Type \"quit\" to end)");
			nextStep = console.next();
		} while(!(nextStep.equals("quit")));	
	}
}
