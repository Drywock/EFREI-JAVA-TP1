package exercice2;

/**
 * @author Thomas LINTANF, Gabriel RIBIER
 *
 */
import java.util.Scanner; // indicate where is the Scanner class for the compilation

public class Calc {

	/**
	 * @param args
	 */
	private int valueA,valueB; //Variables valueA and valueB are Integers
	private Scanner scanner; //Variable scanner is a Scanner.
	
	public Calc() {
		scanner = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		
		Calc calc = new Calc();
		
		/*
		// Question 1
		Scanner scanner;
		scanner = new Scanner(System.in);

		int value;
		value = scanner.nextInt();		
		*/
		
		// Question 2 :
		
		//int value = scanner.nextInt();
		
		
		/*
		// Q1 & 2
		System.out.print(value);
		*/
		
		//Question 4 & 5:
		calc.scan2();
	}
	
	public void scan2() {
		System.out.println("Enter 2 values separated by 1 space:");
		valueA=scanner.nextInt();
		valueB=scanner.nextInt();
		
		System.out.println(valueA + " + " + valueB + " = " + (valueA + valueB));
		System.out.println(valueA + " - " + valueB + " = " + (valueA - valueB));
		System.out.println(valueA + " * " + valueB + " = " + (valueA * valueB));
		System.out.println(valueA + " / " + valueB + " = " + (valueA / valueB));
		System.out.println(valueA + " % " + valueB + " = " + (valueA % valueB));
	
	}

	@Override
	public String toString() {
		return "Calc []";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + valueA;
		result = prime * result + valueB;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calc other = (Calc) obj;
		if (valueA != other.valueA)
			return false;
		if (valueB != other.valueB)
			return false;
		return true;
	}
	
	
}
