import java.util.LinkedList;
import java.util.Queue;

public class Search {
	public static void main(String[] args) {
		
	}
	//0 = false, 1 = true;
	public void DFS(Node root) {
		if (root == null) {
			return;
		}
		visit(root);
		root.data = 1;
		for (Node n : root.adjacencyList) {
			if (n.data == 0) {
				DFS(n);
			}
		}
	}
	
	public void BFS(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		root.data = 1;
		while (!queue.isEmpty()) {
			Node removed = queue.poll();
			visit(removed);
			for (Node neighbor : removed.adjacencyList) {
				if (neighbor.data == 0) {
					neighbor.data = 1;
					queue.add(neighbor);
				}
			}
		}
	}
	
	public void visit(Node root) {
		System.out.println(root.data + "");
	}
	
	
	public void DFS2(Node root) {
		if (root == null) {
			return;
		}
		root.data = 1;
		visit(root);
		for (Node child : root.adjacencyList) {
			if (child.data == 0) {
				DFS(child);
			}
		}
		
	}
	
	public void BFS2(Node root) {
		if (root == null) {
			return;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node removed = queue.poll();
			removed.data = 1;
			visit(removed);
			for (Node child : root.adjacencyList) {
				if (child.data == 0) {
					queue.add(child);
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
}
