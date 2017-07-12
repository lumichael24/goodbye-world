import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackOfPlates {
	
	ArrayList<Stack> stackOfPlates = new ArrayList<Stack>();
	private final int capacity = 10;
	
	public boolean isFull(Stack s) {
		return s.size() >= capacity;
	}
	
	public Stack getLastStack() {
		if (stackOfPlates == null || stackOfPlates.size() == 0) {
			return null;
		}
		return stackOfPlates.get(stackOfPlates.size() - 1);
	}
	public void push(int item) {
		Stack last = getLastStack();
		if (last.size() < capacity && stackOfPlates != null) {
			last.push(item);
		}
		else {
			Stack newStack = new Stack();
			newStack.push(item);
			stackOfPlates.add(newStack);
		}
	}
	
	public int pop() {
		Stack last = getLastStack();
		if (last == null) {
			throw new EmptyStackException();
		}
		if (last.size() == 1) {
			int data = last.pop();
			stackOfPlates.remove(stackOfPlates.size() - 1);
			return data;
		}
		else {
			return last.pop();
		}
	}
	
}
