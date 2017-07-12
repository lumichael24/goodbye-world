import java.util.Random;

public class TreeNode {
	private int data;
	public TreeNode left;
	public TreeNode right;
	private int size = 0;
	
	public TreeNode(int data) {
		this.data = data;
		size = 1;
	}
	
	public int data() {
		return this.data;
	}
	
	public int size() {
		return this.size;
	}
	
	public TreeNode getRandomNode() {
		int leftSize = left == null ? 0 : left.size;
		Random random = new Random();
		int index = random.nextInt(size);
		if (index < leftSize) {
			return left.getRandomNode();
		}
		else if (index == leftSize) {
			return this;
		}
		else {
			return right.getRandomNode();
		}
	}
	
	public void insertInOrder(int info) {
		if (info <= this.data) {
			if (left == null) {
				left = new TreeNode(info);
			}
			else {
				left.insertInOrder(info);
			}
		}
		else {
			if (right == null) {
				right = new TreeNode(info);
			}
			else {
				right.insertInOrder(info);
			}
		}
	}
	
	public TreeNode find(int info) {
		if (info <= this.data) {
			return left != null ? left.find(info) : null;
		}
		else if (info == this.data) {
			return this;
		}
		else {
			return right != null ? right.find(info) : right.find(info);
		}
	}
	
	public TreeNode getIthNode(int index) {
		int leftSize = left != null ? left.size() : 0;
		if (index < leftSize) {
			return left.getIthNode(index);
		}
		else if (index == leftSize) {
			return this;
		}
		else {
			return right.getIthNode(index - (left.size() + 1));
		}
	}
}
