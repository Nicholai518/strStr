public class Main {
	public static void main(String[] args){
	String hayStack = "bbbdog";
	String needle = "dog";

	//String str = hayStack.substring(2,5);
	//System.out.println(hayStack.substring(2,4));



	System.out.println("Example one should return 3: " + strStr(hayStack, needle));

	}

	public static int strStr(String haystack, String needle) {
		// Variables
		String resultFromSubstring;
		char currentCharOfHayStack;


		// edge case 1:  needle is "" return 0
		if(needle.equalsIgnoreCase("")){
			return 0;
		}
		// find out how long the needle string is: dog = 3
		int lengthOfNeedle = needle.length();

		// store needle.charAt(0)
		char needleFirstChar = needle.charAt(0);

		// use for loop
		// need to iterate through haystack until index matches the first character of needle: 'd'
		for(int i=0; i<haystack.length();i++){
			currentCharOfHayStack = haystack.charAt(i);
			// if index char of haystack is equal to first needle char
			// &&
			// if the current index + length of needle -1 does not cause an index out of bounds error for haystack.length-1
			//   bbdog
			//   index = 2 + (3-1) = 4
			// haystack length = 5 -1 = 4
			if(currentCharOfHayStack == needleFirstChar && (i + lengthOfNeedle -1) <= haystack.length()-1){

				// we can use the string.substring() method to return a string from begin index to end index,
				// String.subString(starting at the index with matching first character, index + length of needle -1)
				resultFromSubstring = haystack.substring(i, i + (lengthOfNeedle));

				// if the substring DOES match, return index
				if(resultFromSubstring.equalsIgnoreCase(needle)){
					return i;
				}
				// else the substring does NOT match needle - continue search
			}
		}

		// if we iterate through the entire haystack with no match, return -1 at the very end
		return -1;
	}
}


