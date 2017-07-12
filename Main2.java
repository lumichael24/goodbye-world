public class Main2 {
	public static void main(String[] args) {
//		int[] arr1 = {1, 2, 3, 4};
//		int[] arr2 = {2, 3, 4};
//		findCommon(arr1, arr2);
		//String str = "aabcccccaaa";
		//compress(str);
		String faggottoggaf = new String();
		System.out.println(checkPalindrome(faggottoggaf) + "");
	}
	public static String compress(String str) {
		StringBuilder compressed = new StringBuilder();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count++;
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
				compressed.append(str.charAt(i));
				compressed.append(count);
				count = 0;
			}
		}
		String newString = compressed.toString();
		if (newString.length() > str.length()) {
			return str;
		}
		else {
			for (int j = 0; j < newString.length(); j++) {
				System.out.print(newString.charAt(j));
			}
			return newString;
		}
	}
	
	public static int[] findCommon(int[] arr1, int[] arr2) {
		int minLength = Math.min(arr1.length, arr2.length);
		int[] commonArr = new int[minLength];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					int x = findNextIndex(commonArr);
					commonArr[x] = arr1[i];
				}
			}
		}
		for (int i = 0; i < commonArr.length; i++) {
			System.out.println(commonArr[i] + "");
		}
		return commonArr;
	}
	//assumes no zeroes
	public static int findNextIndex(int[] arr1) {
		int index = 0;
		while (arr1[index] != 0) {
			index++;
		}
		return index;
	}
	public static boolean checkPalindrome(String str) {
		Stack stack = new Stack();
		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}
		while (!stack.isEmpty()) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != stack.pop()) {
					return false;
				}
			}
		}
		return true;
	}
}
