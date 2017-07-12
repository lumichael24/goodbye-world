public class MyQueue {
	private Stack oldStack;
	private Stack newStack;
	public MyQueue() {
		oldStack = new Stack();
		newStack = new Stack();
	}
	public void add(int item) {
		oldStack.push(item);
	}
	public int remove() {
		while (!oldStack.isEmpty()) {
			newStack.push(oldStack.pop());
		}
		return newStack.pop();
	}
	public int peek() {
		while (!oldStack.isEmpty()) {
			newStack.push(oldStack.pop());
		}
		return newStack.peek();
	}
}

