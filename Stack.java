import java.util.EmptyStackException;

public class Stack {
	private static class StackNode {
		private int data;
		private StackNode next;
		public StackNode(int data) {
			this.data = data;
		}
	}
	private StackNode top;
	
	public int pop() {
		if (top == null) {
			throw new EmptyStackException();
		}
		StackNode first = top;
		top = top.next;
		return first.data;
	}
	
	public void push(int item) {
		StackNode newTop = new StackNode(item);
		newTop.next = top;
		top = newTop;
	}
	
	public int peek() {
		if (top == null) {
			throw new EmptyStackException();
		}
		return top.data;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public int size() {
		int size = 0;
		while (top != null) {
			size++;
		}
		return size;
	}

}
