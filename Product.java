
public class Product {

	public static void main(String[] args) {
		System.out.println(product(8, 7));
	}
	
	public static int product(int x, int y) {
		int smaller = x < y ? x : y;
		int bigger = x > y ? x : y;
		if (smaller == 0) {
			return 0;
		}
		if (smaller == 1) {
			return bigger;
		}
		int halfOfSmaller = smaller >> 1;
		int halfProd = product(halfOfSmaller, bigger);
		if (smaller % 2 == 0) {
			return halfProd + halfProd;
		}
		else {
			return halfProd + halfProd + bigger;
		}
	}

}
