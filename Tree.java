import java.util.Random;

public class Tree {
	TreeNode root = null;
	public int size() {
		return root != null ? root.size() : 0;
	}
	
	public TreeNode getRandomNode() {
		if (root == null) {
			return null;
		}
		Random random = new Random();
		int index = random.nextInt(size());
		return root.getIthNode(index);
	}
}
