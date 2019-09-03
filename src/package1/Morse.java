/**
 * 
 */
package package1;

/**
 * @author Thomas LINTANF
 *
 */

import java.lang.StringBuilder;

public class Morse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		//Question 1 
		for(String arg:args) {
			System.out.print(arg + " Stop. ");
		}
		*/
		
		/*
		 * Question 2
		 * 
		 * The class String builder allow to edit a String from different parts
		 */
		
		
		
		//Question 3
		
		StringBuilder str = new StringBuilder();
		
		for(String arg:args) {
			str.append(arg);
			str.append(" Stop. ");
		}
		
		System.out.print(str.toString()); // only one call of print -> faster	
		
		/*
		 * We have to use StringBuilder.append() instead of operator + when the creation of the string takes multiple steps
		 */
	}
}
