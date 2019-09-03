package package1;

import java.util.Arrays;

/**
 * 
 * @author Thomas LINTANF
 *
 */
public class SumFromString {

	private int[] numbers;
	private int sum;
	
	@Override
	public String toString() {
		return "SumFromString []";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(numbers);
		result = prime * result + sum;
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
		SumFromString other = (SumFromString) obj;
		if (!Arrays.equals(numbers, other.numbers))
			return false;
		if (sum != other.sum)
			return false;
		return true;
	}


	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SumFromString sfm = new SumFromString();
		
		sfm.parse(args); // Convert string array to integer array
		 

		//Display integer array method 1 :
		sfm.display1();
		//Display integer array method 2 :
		sfm.display2();
		
		//Display sum result
		System.out.print("Total sum : " + sfm.sum());
	}
	
	
	/**
	 * Extract integers from a string array.
	 * throw an exception if the string does not contain an Integer
	 * @param numberStrings
	 * @return array of integers 
	 */
	public int[] parse(String[] numberStrings){
		int length = numberStrings.length;
		numbers = new int[length];
		
		for(int cpt = 0; cpt < numberStrings.length; cpt++) {
			numbers[cpt] = java.lang.Integer.parseInt(numberStrings[cpt]); 
		}
		
		
		return numbers;
	}
	
	/**
	 * Sum all the integers of an integer array
	 * @param numbers array of integers
	 * @return sum
	 */
	public int sum() {	
		sum = 0;
		for(int number:numbers) {
			sum+=number;
		}
		
		return sum;
	}

	public void display1() {
		for(int number:numbers) {
			System.out.println(number);
		}
		
	}
	
	public void display2() {
		System.out.println(java.util.Arrays.toString(numbers));
	}
}
