import java.util.LinkedList;
import java.util.List;

public class ZeroedMatrix {
	public static void main(String[] args) {
		int[][] matrix = new int[][] {
			{2, 3, 4}, 
			{0, 1, 2},
			{0, 2, 3}
		};
		ZeroMatrix(matrix);
	}
	public static int[][] ZeroMatrix(int[][] mat) {
		int height = mat.length;
		int width = mat[0].length;
//		boolean[][] flag = new boolean[height][width];
		List<Integer> rows = new LinkedList<Integer>();
		List<Integer> columns = new LinkedList<Integer>();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (mat[i][j] == 0) {
					rows.add(i);
					columns.add(j);
					//flag[i][j] = true;
				}
			}
		}
		for (int rowNum : rows) {
			for (int y = 0; y < width; y++) {
				mat[rowNum][y] = 0;
			}
		}
		for (int columnNum : columns) {
			for (int x = 0; x < height; x++) {
				mat[x][columnNum] = 0;
			}
		}
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print(mat[i][j] + "");
			}
		}
		return mat;
	}
}
