import java.util.LinkedList;

public class PalindromeList {
	public static void main(String[] args) {
		LinkedList<Integer> stack = new LinkedList<Integer>();
		stack.add(0);
		stack.add(1);
		stack.add(2);
		stack.add(2);
		stack.add(1);
		stack.add(0);
		checkPalindrome(stack);
		
	}
	public static boolean checkPalindrome(LinkedList<Integer> list) {
		LinkedList<Integer> stack = new LinkedList<Integer>();
		LinkedList<Integer> reversed = new LinkedList<Integer>();
		for (int num : list) {
			stack.push(num);
		}
		while (!stack.isEmpty()) {
			reversed.add(stack.pop());
		}
		System.out.println(reversed.equals(list) + "");
		return reversed.equals(list);
	}
}
