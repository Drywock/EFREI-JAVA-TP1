package exercice5;

/**
 * @author Thomas LINTANF, Gabriel RIBIER
 *
 */

import java.lang.StringBuilder;

public class Morse {

	/**
	 * @param args
	 */
	private final String STOP = " Stop. ";
	
	public static void main(String[] args) {
		
		Morse m = new Morse();
		//Question 1 
		//m.displayMorse1(args);
		
		
		/*
		 * Question 2:
		 * 
		 * The class String builder allow to edit a String from different parts
		 */
		
		//Question 3:
		m.displayMorse2(args);
		
		/*
		* Question 4:
		* We have to use StringBuilder.append() instead of operator + when the creation of the string takes multiple steps
		*/
	}
	
	/**
	 * 
	 * @param words
	 */
	public void displayMorse1(String[] words) {
		for(String word:words) {
			System.out.print(word + STOP);
		}
	}
	
	/**
	 * 
	 * @param words
	 */
	public void displayMorse2(String[] words) {
		//Question 3
		
		StringBuilder str = new StringBuilder();
				
		for(String word:words) {
			str.append(words);
			str.append(STOP);
		}
				
		System.out.print(str.toString()); // only one call of print -> faster	
				
		
	}

	@Override
	public String toString() {
		return "Morse []";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((STOP == null) ? 0 : STOP.hashCode());
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
		Morse other = (Morse) obj;
		if (STOP == null) {
			if (other.STOP != null)
				return false;
		} else if (!STOP.equals(other.STOP))
			return false;
		return true;
	}
	
	
}
