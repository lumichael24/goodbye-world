public class StringRotation {
	public static void main(String[] args) {
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		System.out.println(isSubstring(s1, s2) + "");
		
	}
	public static boolean isSubstring(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		String combined = s2 + s2;
		if (combined.contains(s1)) {
			return true;
		}
		return false;
	}
}
