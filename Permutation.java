import java.util.ArrayList;

public class Permutation {
	public static void main(String[] args) {
		
	}
	
	public static ArrayList<String> findPermutation(String str) {
		if (str == null) {
			return null;
		}
		ArrayList<String> permutations = new ArrayList<String>();
		if (str.length() == 0) {
			permutations.add("");
			return permutations;
		}
		char first = str.charAt(0);
		String remainder = str.substring(1);
		ArrayList<String> words = findPermutation(remainder);
		for (String word : words) {
			for (int j = 0; j < word.length(); j++) {
				String s = insertCharAt(word, first, j);
				permutations.add(s);
			}
		}
		return permutations;
 	}
	
	public static String insertCharAt(String word, char c, int index) {
		String start = word.substring(0, index);
		String end = word.substring(index);
		return start + c + end;
	}
}
