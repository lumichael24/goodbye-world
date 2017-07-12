public class Intersection {
	public static void main(String[] args) {
		
	}
	public class Result {
		public Node tail;
		public int size;
		public Result(Node tail, int size) {
			this.tail = tail;
			this.size = size;
		}
	}
	public Result getSizeAndTail(Node list) {
		if (list == null) {
			return new Result(null, 0);
		}
		Node curr = list;
		int size = 1;
		while (curr.next != null) {
			size++;
			curr = curr.next;
		}
		return new Result(curr, size);
	}
	public Node moveToKth(Node list, int k) {
		Node curr = list;
		while (k > 0) {
			k--;
			curr = curr.next;
		}
		return curr;
	}
	public Node determineIntersection(Node l1, Node l2) {
		if (l1 == null || l2 == null) {
			return null;
		}
		Result ofList1 = getSizeAndTail(l1);
		Result ofList2 = getSizeAndTail(l2);
		if (ofList1.tail != ofList2.tail) {
			return null;
		}
		Node shortPointer = ofList1.size < ofList2.size ? l1 : l2;
		Node longPointer = ofList1.size > ofList2.size ? l2 : l1;
		int difference = Math.abs(ofList1.size - ofList2.size);
		Node startPointOfLongerList = moveToKth(longPointer, difference);
		while (shortPointer.data != startPointOfLongerList.data) {
			shortPointer = shortPointer.next;
			startPointOfLongerList = startPointOfLongerList.next;
		}
		return shortPointer;
	}
}
