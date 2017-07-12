public class Node {

	public int data;
	public Node next;
	public Node[] adjacencyList;
	public State state;
	
	public Node(int data, Node[] adjacencyList) {
		this.data = data;
		this.next = null;
		this.adjacencyList = adjacencyList;
	}
	
	public Node getNext() {
		return next;
	}
	
	public int getData() {
		return this.data;
	}
}
