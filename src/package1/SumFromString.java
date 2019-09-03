package package1;

/**
 * 
 * @author Thomas LINTANF
 *
 */
public class SumFromString {

	@Override
	public String toString() {
		return "SumFromString []";
	}


	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] numbers = parse(args); // Convert string array to integer array
		int sum = sum(numbers); // integers sum calculation

		//Display integer array method 1 :
		for(int number:numbers) {
			System.out.println(number);
		}
		
		//Display integer array method 2 :
		System.out.println(java.util.Arrays.toString(numbers));
		
		//Display sum result
		System.out.print("Total sum : " + sum);
	}
	
	
	/**
	 * Extract integers from a string array.
	 * throw an exception if the string does not contain an Integer
	 * @param numberStrings
	 * @return array of integers 
	 */
	public static int[] parse(String[] numberStrings){
		int length = numberStrings.length;
		int[] numberList = new int[length];
		
		for(int cpt = 0; cpt < numberStrings.length; cpt++) {
			numberList[cpt] = java.lang.Integer.parseInt(numberStrings[cpt]); 
		}
		
		
		return numberList;
	}
	
	/**
	 * Sum all the integers of an integer array
	 * @param numbers array of integers
	 * @return sum
	 */
	public static int sum(int[] numbers) {
		
		int sum = 0;
		for(int number:numbers) {
			sum+=number;
		}
		
		return sum;
	}

}
