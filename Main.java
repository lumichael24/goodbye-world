import java.awt.List;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 3, 3};
		reverseArr(arr);
		//System.out.println("" + iterativeFactorial(6));
//		int[] arr1 = {1, 2, 3, 5};
//		int[] arr2 = {2, 3, 4, 1};
//		System.out.println(checkRotatedArray(arr1, arr2) + "");
		//int[] newArr = new int[10];
		//int[] bubble = {2, 4, 5, 3, 1};
		//bubbleSort(bubble);
		//selectionSort(bubble);
//		for (int i = 0; i < 10; i++) {
//			newArr[i] = i;
//		}
//		newArr[9] = 1;
//		System.out.println(mostFrequentInt(newArr) + "");
		//primeFactorization(100);
		//boolean result = checkSum(newArr, 21);
		//System.out.println(result + "");
	}
	//assuming that the set given is already sorted, otherwise merge sort (nlogn time) and add to array
	public static boolean checkSum(int[] arr, int num) {
		int i = 1;
		int j = arr.length - 1;
		while (i <= j) {
			if (arr[i] + arr[j] == num) {
				System.out.println(arr[i] + " " + arr[j] + " = " + num);
				return true;
			}
			else if (arr[i] + arr[j] > num) {
				j = j - 1;
			}
			else if (arr[i] + arr[j] < num) {
				i = i + 1;
			}
				
		}	
		return false;
	}
	public static int[] bubbleSort(int[] arr) {
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			int z = i;
			if (i + 1 < 5 && arr[i] > arr[i + 1]) {
				int holder = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = holder;
				while ((z - 1) >= 0 && arr[z] < arr[z - 1]) {
					int tracker = arr[z];
					arr[z] = arr[z - 1];
					arr[z - 1] = tracker;
					z = z - 1;
				}
			}
		}
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + "");
		}
		return arr;
	}
	public static int[] selectionSort(int[] arr) {
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			int min = arr[i];
			for (int j = i; j < length; j++) {
				if (arr[j] < min) {
					min = arr[j];
				}
			}
			arr[i] = min;
		}
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + "");
		}
		return arr;
	}
	
	public static int getNextPrime(int x) {
		LinkedList<Integer> listOfPrimes = new LinkedList<Integer>();
		listOfPrimes.add(2);
		for (int i = 3; i <= 23; i = i + 2) {
			if (i == 9 || i == 15 || i == 21) {
				continue;
			}
			else {
				listOfPrimes.add(i);
			}
		}
		for (int val : listOfPrimes) {
			if (val > x) {
				return val;
			}
		}
		return 0;
	}
	public static LinkedList<Integer> primeFactorization(int num) {
		LinkedList<Integer> primes = new LinkedList<Integer>();
		while (num % 2 == 0) {
			primes.add(2);
			num = num / 2;
		}
		int next = 2;
		while (num > 1) {
			next = getNextPrime(next);
			while (num % next == 0) {
				primes.add(next);
				num = num / next;
			}
		}
		
		for (int val : primes) {
			System.out.println(val + "");
		}
		return primes;
	}
	
	public static int mostFrequentInt(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > max) {
				max = count;
			}
		}
		return max;
	}
	public static boolean checkRotatedArray(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		}
		int i = 0;
		while (arr1[0] != arr2[i]) {
			if (i > arr2.length) {
				return false;
			}
			i++;
		}
		for (int j = 0; j < arr1.length; j++) {
			if (i >= arr2.length) {
				i = 0;
			}
			if (arr1[j] != arr2[i]) {
				return false;
			}
			else {
				i++;
			}
		}
		return true;
	}
	public static int recursiveFactorial(int num) {
		if (num == 0) {
			return 1;
		}
		if (num == 1) {
			return 1;
		}
		else {
			int result = num;
			return result * recursiveFactorial(num - 1);
		}
	}
	public static int iterativeFactorial(int num) {
		int result = num;
		int nextNum = num - 1;
		for (int i = 1; i < num; i++) {
			result = result * (nextNum);
			nextNum--;
		}
		return result;
	}
	
	public static int[] iterativeFibonacci(int num) {
		int[] newArr = new int[num];
		newArr[0] = 0;
		newArr[1] = 1;
		for (int i = 0; i < num - 2; i++) {
			newArr[i+2] = newArr[i] + newArr[i+1];
		}
		for (int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i]);
		}
		return newArr;
	}
	public static int recursiveFibonacci(int num) {
		if (num == 0) {
			return 0;
		}
		if (num == 1) { 
			return 1;
		}
		else {
			return recursiveFibonacci(num - 1) + recursiveFibonacci(num - 2);
		}
	}
	public static int findOnlyElementOccursOnce(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				System.out.println("Iteration " + arr[i] + ": with " + arr[j]);
				if (i == j) {
					continue;
				}
				if (arr[i] == arr[j]) {
					count++;
					System.out.println("Iteration " + arr[i] + ": with " + arr[j] + ":::: count is " + count);
					j = arr.length;
				}
			}
			if (count == 0) {
				return arr[i];
			}
		}
		return 0;
	}
	public static int findOnlyElementSorted(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				if (arr[i] == arr[i+1]) {
					continue;
				}
				else {
					return arr[i];
				}
			}
			else if (i == arr.length - 1) {
				if (arr[i] == arr[i-1]) {
					continue;
				}
				else {
					return arr[i];
				}
			}
			else {
				if (arr[i] == arr[i - 1] || arr[i] == arr[i+1]) {
					continue;
				}
				else {
					return arr[i];
				}
			}
		}
		return 0;
	}
	public static int[] reverseArr(int[] arr) {
		int[] newArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[arr.length - 1 - i];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(newArr[i]);
		}
		return newArr;
	}
	
}






