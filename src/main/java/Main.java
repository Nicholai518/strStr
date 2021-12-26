public class Main {
	public static void main(String[] args){

	}

	public int strStr(String haystack, String needle) {
		// edge cases
		// edge case 1: both haystack and needle are "" return 0

		// find out how long the needle string is: dog = 3
		// store needle.charAt(0)

		// use for loop
		// need to iterate through haystack until index matches the first character of needle: 'd'

		// if index char of haystack is equal to first needle char
		// &&
		// if the current index + length of needle -1 does not cause an index out of bounds error for haystack.length-1

		// we can use the string.substring() method to return a string from begin index to end index,
		// String.subString(starting at the index with matching first character, index + length of needle -1)

		// if the substring DOES match, return index
		// else the substring does NOT match needle - continue search

		// if we iterate through the entire haystack with no match, return -1 at the very end

	}
}


