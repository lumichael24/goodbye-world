//import javax.swing.tree.TreeNode;
//
//public class Successor {
//
//	public static void main(String[] args) {
//	}
//	
//	public TreeNode findSuccessor(TreeNode root) {
//		if (root == null) {
//			return null;
//		}
//		if (root.right != null) {
//			TreeNode next = root.right;
//			while (next.left != null) {
//				next = next.left;
//			}
//			return next;
//		}
//		else {
//			TreeNode q = root;
//			TreeNode parent = q.getParent();
//			while (parent != null && parent.left != q) {
//				q = parent;
//				parent = parent.getParent();
//			}
//			return parent;
//		}
//	}
//	
//
//}
