import java.util.LinkedList;

public class SumLists {
	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>(); 
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l2.add(2);
		l2.add(3);
		l2.add(4);
		SumTwoLists(l1, l2);
	}
	public static LinkedList<Integer> SumTwoLists(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		StringBuilder l1String = new StringBuilder();
		StringBuilder l2String = new StringBuilder();
		for (int item : l1) {
			l1String.append(item);
		}
		for (int item : l2) {
			l2String.append(item);
		}
		String string1 = l1.toString();
		String string2 = l2.toString();
		int sL1 = Integer.parseInt(string1);
		int sL2 = Integer.parseInt(string2);
		int total = sL1 + sL2;
		LinkedList<Integer> sumList = new LinkedList<Integer>();
		while (total > 0) {
			sumList.push(total % 10);
			total = total / 10;
		}
		while (!sumList.isEmpty()) {
			System.out.println(sumList.pop());
		}
		return sumList;
	}
}
