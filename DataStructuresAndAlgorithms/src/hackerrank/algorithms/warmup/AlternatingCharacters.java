package hackerrank.algorithms.warmup;

import java.util.*;

/*
 * Problem Statement

 Shashank likes strings in which consecutive characters are different. 
 For example, he likes ABABA, while he doesn't like ABAA. Given a string 
 containing characters A and B only, he wants to change it into a string he 
 likes. To do this, he is allowed to delete the characters in the string.
 Your task is to find the minimum number of required deletions.

 Input Format 
 The first line contains an integer T i.e. the number of test cases. 
 Next T lines contain a string each.

 Output Format 
 Print minimum number of required steps for each test case.

 Constraints
 1≤T≤10 
 1≤lengthofString≤105 

 Sample Input
 5
 AAAA
 BBBBB
 ABABABAB
 BABABA
 AAABBB

 Sample Output
 3
 4
 0
 0
 4

 Explanation

 AAAA⟹A, 3 deletions
 BBBBB⟹B, 4 deletions
 ABABABAB⟹ABABABAB, 0 deletions
 BABABA⟹BABABA, 0 deletions
 AAABBB⟹AB, 4 deletions
 */

public class AlternatingCharacters {

	static int numOfDeletes(String input) {
		int counter = 0;

		if (input.length() < 2) {
			return counter;
		}

		int limit = input.length();
		int m = 0;
		int n = 1;

		while (m < limit) {
			while (n < limit) {
				if (input.charAt(m) == input.charAt(n)) {
					n++;
					counter++;
				} else {
					m = n;
					n++;
					break;
				}
			}
			if (n == limit)
				break;
		}
		return counter;
	}

	public static void main(String[] args) {
		int numOfInputs;
		Scanner in = new Scanner(System.in);

		// Get the number of input integers
		numOfInputs = in.nextInt();
		in.nextLine();

		// For each integer read, try it through the isFibo() function.
		for (int i = 0; i < numOfInputs; i++) {
			String input = in.nextLine();
			System.out.println(numOfDeletes(input));
		}

		in.close();
	}
}
