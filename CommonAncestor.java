import javax.swing.tree.TreeNode;

public class CommonAncestor {

	public static void main(String[] args) {
		
	}
	public TreeNode findCommonAncestor(TreeNode x, TreeNode y) {
		TreeNode shallowNode = findDepth(x) > findDepth(y) ? y : x;
		TreeNode deepNode = findDepth(x) > findDepth(y) ? x : y;
		int depthDifference = Math.abs(findDepth(x) - findDepth(y));
		moveBy(deepNode, depthDifference);
		while (shallowNode != deepNode && shallowNode != null && deepNode != null) {
			shallowNode = shallowNode.getParent();
			deepNode = deepNode.getParent();
		}
		return shallowNode == null || deepNode == null ? null : shallowNode;
	}
	public int findDepth(TreeNode node) {
		int depth = 0;
		while (node != null) {
			depth++;
			node = node.getParent();
		}
		return depth;
	}
	
	public void moveBy(TreeNode node, int displacement) {
		while (displacement > 0) {
			node = node.getParent();
			displacement--;
		}
		return;
	}

}
