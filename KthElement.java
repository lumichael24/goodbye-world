public class KthElement {
	public static void main(String[] args) {
		
	}
	//O(n + (n - k)) = O(n - k);
	public Node KthToLast(Node head, int kToLast) {
		int length = 0;
		Node curr = head;
		while (curr != null) {
			length++;
		}
		curr = head;
		for (int i = 0; i < length - kToLast; i++) {
			curr = curr.next;
		}
		return curr;
	}
	public boolean deleteMiddleNode(Node middle) {
		if (middle == null || middle.next == null) {
			return false;
		}
		else {
			middle.data = middle.next.data;
			middle.next = middle.next.next;
			return true;
		}
	}
	public Node partition(Node node, int pivot) {
		Node tail = node;
		Node head = node;
		while (node != null) {
			if (node.data > pivot) {
				tail.next = node;
				tail = node;
			}
			else {
				node = head.next;
				head = node;
			}
			node = node.next;
		}
		tail.next = null;
		return head;
	}
}
