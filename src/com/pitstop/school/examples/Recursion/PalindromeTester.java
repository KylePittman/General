package com.pitstop.school.examples.Recursion;

public class PalindromeTester
{
   public static void main(String[] args)
   {
	   Sentence s1 = new Sentence("kayak");
	      System.out.println(s1.isPalindrome());
	      System.out.println("Expected: true");
	      Sentence s3 = new Sentence("xyzzyx");
	      System.out.println(s3.isPalindrome());
	      System.out.println("Expected: true");
      Sentence s2 = new Sentence("abcdba");
      System.out.println(s2.isPalindrome());
      System.out.println("Expected: false");
   }
}
