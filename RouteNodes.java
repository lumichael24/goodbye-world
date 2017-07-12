import java.util.LinkedList;
import java.util.Queue;

public class RouteNodes {
	class Graph {
		public Node[] nodes;
	}
	public boolean isRouteBFS(Graph g, Node start, Node end) {
		if (start == end) {
			return true;
		}
		Queue<Node> queue = new LinkedList<Node>();
		start.state = State.Visiting;
		queue.add(start);
		for (Node node : g.nodes) {
			node.state = State.Unvisited;
		}
		while (!queue.isEmpty()) {
			Node removed = queue.poll();
			if (removed != null) {
				for (Node neighbor : removed.adjacencyList) {
					if (neighbor.state == State.Unvisited) {
						if (neighbor == end) {
							return true;
						}
						else {
							neighbor.state = State.Visiting;
							queue.add(neighbor);
						}
					}
				}
				removed.state = State.Visited;
			}
		}
		return false;
	}
}
