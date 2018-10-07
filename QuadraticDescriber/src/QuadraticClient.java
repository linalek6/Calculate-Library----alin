import java.util.Scanner;
/* This class contains a method that will handle interactions with the user
 * @author Alexis Lin
 * @version October 2, 2018
 */
public class QuadraticClient {

	public static void main(String[] args) {
		System.out.println("Welcome to the Quadratic Describer");
		System.out.println("Provide values for coefficients a, b, and c");
		System.out.println();
		System.out.print("a: ");
		Scanner console = new Scanner(System.in);
		do {
		double a = console.nextInt();
		System.out.print("b: ");
		double b = console.nextInt();
		System.out.print("c: ");
		double c = console.nextInt();
		System.out.println();
		System.out.println(Quadratic.quarDescriber(a, b, c));
		System.out.println();
		System.out.println("Do you want to keep going? (Type \"quit\" to end)");
		String nextStep = console.next();
		String quit = "quit";
		}
		while (nextStep != quit) {
		}
		
		

	}

}
