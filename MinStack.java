public class MinStack extends Stack {
	
	private Stack minStack;
	
	public MinStack() {
		minStack = new Stack();
	}
	//push, pop, min
	public void push(int item) {
		if (item <= minStack.peek()) {
			minStack.push(item);
		}
		super.push(item);
	}
	public int pop() {
		int popped = super.pop();	
		if (popped == minStack.peek()) {
			minStack.pop();
		}
		return popped;
	} 
}
