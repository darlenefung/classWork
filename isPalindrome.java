public class isPalindrome 
{
	public static void main(String[] args)
	{
		isPalindrome0("");
		isPalindrome0("a");
		isPalindrome0("aa");
		isPalindrome0("ab");
		isPalindrome0("aba");
		isPalindrome0("abba");
		isPalindrome0("abca");
		isPalindrome0("abbc");
		isPalindrome0("abcdba");
		System.out.println();


		System.out.println(isPalindrome1(""));
		System.out.println(isPalindrome1("a"));
		System.out.println(isPalindrome1("aa"));
		System.out.println(isPalindrome1("ab"));
		System.out.println(isPalindrome1("aba"));
		System.out.println(isPalindrome1("abba"));
		System.out.println(isPalindrome1("abca"));
		System.out.println(isPalindrome1("abbc"));
		System.out.println(isPalindrome1("abcdba"));


	}
	
	/**
	 * This method takes in a string and return true if the
	 * given string is a palindrome using chartAt and iteration
	 * @param s the String to check whether it is a palindrome 
	 * @return boolean true of palindrome, false if otherwise
	 */
	public static void isPalindrome0(String s)
	{
		while (s.length() > 1)
		{
			if (s.charAt(0) == s.charAt(s.length() - 1))
				s = s.substring(1, s.length() - 1);
			else
				break;
		
		}
		if (s.length() <= 1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	
	/**
	 * This method takes in a string and return true if the
	 * given string is a palindrome using chartAt and recursion
	 * @param s the String to check whether it is a palindrome 
	 * @return boolean true of palindrome, false if otherwise
	 */
	public static String isPalindrome1(String s)
	{
		//System.out.println(s)
		if (s.length() < 2)
			return "Yes";
		if (s.charAt(0) == s.charAt(s.length() - 1))				
			return isPalindrome1(s.substring(1, s.length() - 1));	
		return "No";
	}	

	
	/**
	 * This method takes in a string and return true if the
	 * given string is a palindrome using AP reference and iteration
	 * @param s the String to check whether it is a palindrome 
	 * @return boolean true of palindrome, false if otherwise
	 */
//	public static String isPalindrome2(String s)
//	{
//		
//		if (s.compareTo(s.substring(0, (s.length() - (s.length() - 2))) == 0))
//			isPalindrome2(s.substring(1, s.length() - 2));
//		return "yes";
//	}
	
	/**
	 * This method takes in a string and return true if the
	 * given string is a palindrome using AP reference and recursion
	 * @param s the String to check whether it is a palindrome 
	 * @return boolean true of palindrome, false if otherwise
	 */
//	public static void isPalindrome3(String s)
//	{
//	
//	}
}//