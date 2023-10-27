package lab5;

public class Matrix {
	public static int[][] add(int[][] a, int[][] b) throws Exception {
		if (a.length != b.length || a[0].length != b[0].length) {
			throw new Exception("Error matrix");
		}
		int[][] res = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				res[i][j] = a[i][j] + b[i][j];
			}
		}
		return res;
	}

	public static int[][] subtract(int[][] a, int[][] b) throws Exception {
		if (a.length != b.length || a[0].length != b[0].length) {
			throw new Exception("Error matrix");
		}
		int[][] res = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				res[i][j] = a[i][j] - b[i][j];
			}
		}
		return res;
	}

	public static int[][] multiply(int[][] a, int[][] b) {
		int[][] res = new int[a.length][b[0].length];
		if (a[0].length != b.length)
			return null;
		else {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b[0].length; j++) {
					int tich = 1;
					int sum = 0;
					for (int j2 = 0; j2 < a[0].length; j2++) {
						tich = a[i][j2] * b[j2][j];
						sum += tich;
					}
					res[i][j] = sum;
				}
			}
		}
		return res;
	}
	
	public static int[][] transpose(int[][] a) {
		 int[][] res = new int[a[0].length][a.length];
		 for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				res[j][i] = a[i][j];
			}
		}
		return res;
		}

	public static void print(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception {
		int[][] a = { { 7, 2 }, { 5, 3 } };
		int[][] b = { { 2, 1 }, { 3, 1 } };
		print(add(a, b));
		System.out.println();
		print(subtract(a, b));
		System.out.println();
		print(multiply(a, b));
		System.out.println();
		print(transpose(a));
	}

}
