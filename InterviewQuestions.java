
public class InterviewQuestions {
	
	/*
	 * string questions
	 */
	
	public static void removeCharacterFromString(String s, char c) {
		char[] cs = s.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			if (cs[i] == c) {
				
			}
		}
	}
	
	//working
	public static int countOccurencesOfCharacter(String s, char c) {
		char[] cs = s.toCharArray();
		int count = 0;
		for (int i = 0; i < cs.length; i++) {
			if (cs[i] == c) {
				count++;
			}
		}
		return count;
	}
	
	/*
	 * array questions
	 */
	
	public static int findMissingNumber(int[] arr) {
		boolean[] exists = new boolean[arr.length];
		for (int i = 0; i < exists.length; i++) {
			exists[i] = false;
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == i) {
				exists[i] = true;
			}
		}
		for (int i = 0; i < exists.length; i++) {
			if (exists[i] == false)
				return i;
		}
		return -1;
	}
	
	//working 
	public static int findSecondHighestNumber(int[] arr) {
		int highest = arr[0];
		int secondHighest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > highest)
				highest = arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < highest) {
				if (arr[i] > secondHighest) {
					secondHighest = arr[i];
				}
			}
		}
		return secondHighest;
	}
	
	//working
	public static int smallestInArray(int[] arr) {
		int smallest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) //> for largest in array
				smallest = arr[i];
		}
		return smallest;
	}
	
	public static void removeDuplicatesArray(int[] arr) {
		int[] removed = arr.clone();
		for (int i = 0; i < arr.length; i++) {
			
		}
	}
	
	/*
	 * number questions
	 */
	
	//working
	public static boolean powerOfTwo(int n) {
		if (n % 2 == 0)
			return true;
		else
			return false;
	}
	
	//right concept, number off
	public static int fibonacciIterative(int n) {
		int current = 1, previous = 0, total = 0;
		for (int i = 1; i <= n; i++) {
			previous = current;
			current = i;
			total = previous + current;
		}
		return total;
	}
	
	//working
	public static int fibonacciRecursive(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		else
			return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
	}
	
	public static int addNumbersRecursive(int a, int b) {
		if ()
	}
	
	public static void main(String[] args) {
		
		//System.out.println(countOccurencesOfCharacter("despacito", 'a'));
		int[] missingOne = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 18, 19, 20, 21}; //missing 15
		int[] test = {1, 2, 3, 4, 400, 500, 700};
		//System.out.println(findMissingNumber(missingOne));
		//System.out.println(smallestInArray(test));
		System.out.println(fibonacciRecursive(9));
	}
}
