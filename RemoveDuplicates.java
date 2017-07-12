import java.util.HashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
	}
	public static Node removeDups(Node head) {
		HashSet<String> setOfDups = new HashSet<String>();
		Node previous = null;
		Node curr = head;
		while (curr != null) {
			if (setOfDups.contains(curr.data)) {
				previous.next = curr.next;
			}
			else {
				//setOfDups.add(curr.data);
				previous = curr;
			}
			curr = curr.next;
		}
		return head;
	}
}
