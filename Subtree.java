import javax.swing.tree.TreeNode;

public class Subtree {
	public boolean containsTree(TreeNode n1, TreeNode n2) {
		StringBuilder s1 = new StringBuilder();
		StringBuilder s2 = new StringBuilder();
		makeOrder(n1, s1);
		makeOrder(n2, s2);
		return s1.indexOf(s2.toString()) != -1;
	}
	public void makeOrder(TreeNode node, StringBuilder sb) {
		if (node == null) {
			sb.append("X");
		}
//		sb.append(node.data);
//		makeOrder(node.left, sb);
//		makeOrder(node.right, sb);
	}
	
	public boolean containsTreeOptimal(TreeNode n1, TreeNode n2) {
		//empty tree is a subtree of all trees
		if (n2 == null) {
			return true;
		}
		return subtree(n1, n2);
	}
	
	public boolean subtree(TreeNode n1, TreeNode n2) {
		if (n1 == null) {
			return false;
		}
//		if (n1.data == n2.data && matchCheck(n1, n2)) {
//			return true;
//		}
//		return subtree(n1.left, n2) || subtree(n1.right, n2);
		return false; //dummy
	}
	
	public boolean matchCheck(TreeNode n1, TreeNode n2) {
		if (n1 == null && n2 == null) {
			return true;
		}
		if (n1 == null || n2 == null) {
			return false;
		}
//		if (n1.data != n2.data) {
//			return false;
//		}
//		else {
//			return matchCheck(n1.left, n2.left) && matchCheck(n1.right, n2.right);
//		}
		//dummy statement
		return false;
	}
	
}
