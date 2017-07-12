import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.tree.TreeNode;


public class DepthList {
	public static void main(String[] args) {
		
	}
	
	public static ArrayList<LinkedList<TreeNode>> listOfDepths(TreeNode root) {
		ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
		return listOfDepths(root, lists, 0);
	}
	//DFS
	public static ArrayList<LinkedList<TreeNode>> listOfDepths(TreeNode root,
			ArrayList<LinkedList<TreeNode>> lists, int level) {
		if (root == null) {
			return null;
		}
		LinkedList<TreeNode> list = null;
		if (lists.size() == level) {
			list = new LinkedList<TreeNode>();
			lists.add(list);
		}
		else {
			list = lists.get(level);
		}
		list.add(root);
		//listOfDepths(root.left, lists, level + 1);
		//listOfDepths(root.right, lists, level + 1);
		return lists;
	}
	//BFS
	public static ArrayList<LinkedList<TreeNode>> BFSLL(TreeNode root) {
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
		LinkedList<TreeNode> current = new LinkedList<TreeNode>();
		if (root != null) {
			current.add(root);
		}
		while (current.size() > 0) {
			result.add(current);
			LinkedList<TreeNode> parents = current;
			current = new LinkedList<TreeNode>();
			for (TreeNode parent : parents) {
				//if (parent.left != null) {
//					current.add(parent.left);
//				}
//				if (parent.right != null) {
//					current.add(parent.right);
//				}
			}
		}
		return result;
	}
		
}
