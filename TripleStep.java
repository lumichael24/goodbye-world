public class TripleStep {
	public static void main(String[] args) {
		System.out.println(countPaths(5));
	}
	
	public static int countPaths(int n) {
		return countPaths2(n);
	}
	public static int countPaths2(int n) {
		if (n < 0) {
			return 0;
		}
		if (n == 0 || n == 1) {
			return 1;
		}	
		return countPaths(n - 1) + countPaths(n - 2) + countPaths(n - 3);
	}
}
