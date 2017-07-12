
public class SortStack {
	
	public static void main(String[] args) {

	}
	
	public Stack sortStack(Stack unsorted) {
		Stack sortedStack = new Stack();
		if (sortedStack.isEmpty()) {
			sortedStack.push(unsorted.pop());
		}
		while (!unsorted.isEmpty()) {
			int temp = unsorted.pop();
			while (!sortedStack.isEmpty() && sortedStack.peek() > temp) {
				unsorted.push(sortedStack.pop());
			}
			sortedStack.push(temp);
		}
		while (!sortedStack.isEmpty()) {
			unsorted.push(sortedStack.pop());
		}
		return unsorted;
	}
}
