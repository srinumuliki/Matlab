package Programs;

/* 3. Write a Java Program that checks whether a given string is a palindrome or
   not. */

import java.util.Scanner;
class FindPalindromeStrings {
    public static boolean isPalindrome(String s) {
        int n = s.length();
        for( int i = 0;  i <= n/2; i++) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(n-i-1);
            if(ch1 != ch2)
                return false;
        }

        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        if(isPalindrome(word))
	    System.out.println(" It is a Palindrome");
	else
	    System.out.println(" It is Not a Palindrome");
        
	sc.close();
    }
}