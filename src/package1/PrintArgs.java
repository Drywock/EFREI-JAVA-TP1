/**
 * 
 */
package package1;

/**
 * @author Thomas LINTANF
 *
 */
public class PrintArgs {

	@Override
	public String toString() {
		return "PrintArgs []";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		
		// Question 1
		
		//Display the first argument in the console
		if(args.length>0) // Check if there is arguments 
		{
			System.out.print(args[0]); //display 1st arg
		}
		else // if no arg
		{
			System.out.print("No argument"); // display no arg
		}
		
		// Question 2
		
		for(int cpt = 0; cpt < args.length; cpt++) // Cycle through args array until cpt is over args length
		{
			System.out.println(args[cpt]);
		}
		*/
		
		// Question 3
		for(String arg:args) // Do the loop for each elements of the array
		{
			System.out.println(arg);
		}
	}

}
