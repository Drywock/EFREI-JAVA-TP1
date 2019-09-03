package package1;

/**
 * @author Thomas LINTANF
 *
 */
import java.util.Scanner; // indicate where is the Scanner class for the compilation

public class Calc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		// Question 1
		Scanner scanner;
		scanner = new Scanner(System.in);

		int value;
		value = scanner.nextInt();		
		*/
		
		// Question 2 :
		Scanner scanner = new Scanner(System.in);
		//int value = scanner.nextInt();
		
		
		/*
		// Q1 & 2
		System.out.print(value);
		*/
		
		//Question 4 & 5:
		System.out.println("Enter 2 values separated by 1 space:");
		int valueA=scanner.nextInt();
		int valueB=scanner.nextInt();
		
		System.out.println(valueA + " + " + valueB + " = " + (valueA + valueB));
		System.out.println(valueA + " - " + valueB + " = " + (valueA - valueB));
		System.out.println(valueA + " * " + valueB + " = " + (valueA * valueB));
		System.out.println(valueA + " / " + valueB + " = " + (valueA / valueB));
		System.out.println(valueA + " % " + valueB + " = " + (valueA % valueB));
		
		scanner.close();
	}

	@Override
	public String toString() {
		return "Calc []";
	}
	
}
