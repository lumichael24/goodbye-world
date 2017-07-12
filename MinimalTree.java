//
//public class MinimalTree {
//
//	public static void main(String[] args) {
//	}
//	public TreeNode constructMinTree(int[] sortedArray) {
//		TreeNode root = constructMinTree(int[] sortedArray, 0, sortedArray.length - 1);
//		return root;
//	}
//	
//	public TreeNode constructMinTree(int[] sortedArray, int start, int end)  {
//		if (end < start) {
//			return null;
//		}
//		int midpoint = (sortedArray.length - 1) / 2;
//		TreeNode root = new TreeNode(sortedArray[midpoint]);
//		root.left = constructMinTree(sortedArray, start, midpoint - 1);
//		root.right = constructMinTree(sortedArray, midpoint + 1, end);
//		return root;
//	}
//
//}
