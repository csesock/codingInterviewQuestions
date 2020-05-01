
public class InterviewQuestions {
	
	/*
	 * string questions
	 */
	
	//works, but replaces character with unicode
	public static String removeCharacterFromString(String s, char c) {
		char[] sc = s.toCharArray();
		int count = s.length();
		for (int i = 0; i < s.length(); i++) {
			if (sc[i] == c) {
				count--;
			}
		}
		char[] removed = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			if (sc[i] != c) {
				System.out.println(i + " " + sc[i]);
				removed[i] = sc[i];
			}
		}
		String r = new String(removed);
		return r;
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
	
	//working
	public static String reverseString(String s) {
		char[] sc = s.toCharArray();
		char[] reverse = new char[s.length()];
		int count = 0;
		for (int i = s.length()-1; i >= 0; i--) {
			reverse[i] = sc[count];
			count++;
		}
		String reversed = new String(reverse);
		return reversed;
	}
	
	public static boolean twoWordsAnagram(String s1, String s2) {
		boolean anagramFlag = false;
		if (s1.length() == 0 || s2.length() == 0)
			return anagramFlag;
		if (s1.length() != s2.length())
			return anagramFlag;
		char[] cs1 = s1.toCharArray();
		char[] cs2 = s2.toCharArray();
		int count = s1.length();
		for (int i = 0; i < s1.length(); i++) {
			if (cs1[i] != cs2[count])
				anagramFlag = false;
		}
		return true;
	}
	
	public static String toLowerCase(String s) {
		char[] c = s.toCharArray();
		char[] result = new char[s.length()];
		for (int i = 0; i < c.length; i++) {
			result[i] = Character.toLowerCase(c[i]);
		}
		return String.valueOf(result);
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
	
	public static int numbersEvenDigits(int[] nums) {
		int count = 0;
		for (int num : nums) {
			if (String.valueOf(num).length() % 2 == 0) 
				count++;
		}
		return count;
	}
	
	public static int[] howManyNumsSmaller(int[] nums) {
		int[] larger = new int[nums.length];
		for (int i = 0; i < larger.length; i++) {
			larger[i] = 0;
		}
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] > nums[i])
					larger[i]++;
			}
		}
		return larger;
	}
	
	/*
	 * miscellaneous problems
	 */
	
	public static void fizzBuzz() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) 
				System.out.println("Fizzbuzz");
			else if (i % 3 == 0) 
				System.out.println("Fizz");
			else if (i % 5 == 0) 
				System.out.println("Buzz");
			else
				System.out.println(i);
		}
	}
	
	public static int coinChange(int n) {
		int total = n;
		int count = 0;
		while (total != 0) {
			if (total >= 25) {
				total -= 25;
				count++;
			}
			if (total >= 10) {
				total -= 10;
				count++;
			}
			if (total >= 5) {
				total -= 5;
				count++;
			}
			else {
				total--;
			}
		}
		return count;
	}
	
	public static void fizzBuzzBetter() {
		for (int i = 1; i <= 100; i++) {
			String output = "";
			if (i % 3 == 0 && i % 5 == 0)
				output += "FizzBuzz";
			else if (i % 3 == 0)
				output += "Fizz";
			else if (i % 5 == 0)
				output += "Buzz";
			else
				output += i;
			System.out.println(output);
		}
	}
	
	public static void main(String[] args) {

	}
}
