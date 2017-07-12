import java.util.HashMap;

public class PathSum {
	public static void main(String[] args) {
		
	}
	
	public int totalSumPaths(TreeNode root, int target) {
		if (root == null) {
			return 0;
		}
		int fromPath = countPath(root, target, 0);
		int pathLeft = totalSumPaths(root.left, target);
		int pathRight = totalSumPaths(root.right, target);
		return fromPath + pathLeft + pathRight;
	}
	
	public int countPath(TreeNode root, int target, int nodeSum) {
		if (root == null) {
			return 0;
		}
		int pathCount = 0;
		nodeSum += root.data();
		if (nodeSum == target) {
			pathCount++;
		}
		pathCount += countPath(root.left, target, nodeSum);
		pathCount += countPath(root.right, target, nodeSum);
		return pathCount;
	}
	
	public int countPathOptimal(TreeNode root, int targetSum) {
		return countPaths(root, targetSum, 0, new HashMap<Integer, Integer>());
	}
	
	public int countPaths(TreeNode root, int targetSum, int runningSum, HashMap<Integer, Integer> map) {
		if (root == null) {
			return 0;
		}
		runningSum += root.data();
		int sum = runningSum - targetSum;
		int totalPaths = map.getOrDefault(sum, 0);
		if (runningSum == targetSum) {
			totalPaths++;
		}
		increment(map, sum , 1);
		countPaths(root.left, targetSum, runningSum, map);
		countPaths(root.right, targetSum, runningSum, map);
		increment(map, sum, -1);
		return totalPaths;
	}
	
	public void increment(HashMap<Integer, Integer> map, int key, int delta) {
		int newCount = map.getOrDefault(key, 0) + delta;
		if (newCount == 0) {
			map.remove(key);
		}
		else {
			map.put(key, newCount);
		}
	}
}
