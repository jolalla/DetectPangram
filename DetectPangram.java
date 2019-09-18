package Pruebas;

public class DetectPangram {

	public boolean check(String sentence) {
		// a for loop goes through all characters between a to z
		for (char c = 'a'; c <= 'z'; c++) {
			// sentence is converted to lowercase and checked if contains the character
			// (passed to string with ""). If it doesn't, return false.
			if (!sentence.toLowerCase().contains("" + c)) {
				return false;
			}
		}
		return true;

	}

}
