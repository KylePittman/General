package com.pitstop.school.examples.Recursion;

public class Sentence
{
   private String text; 
   /**
      Constructs a sentence. 
      @param aText a string containing all lower case characters  
   */
   public Sentence(String aText)
   {
      text = aText;
   }
   /**
      Tests whether this string is a palindrome. 
      testing only lower case values, all letters, no spaces
      @return true if this sentence is a palindrome, false otherwise 
   */
   public boolean isPalindrome()
   {
      int length = text.length();
    
      if (length <= 1) 				// Separate case for shortest strings. 
    	  return true;		
      else 
    	  if (text.charAt(0) == text.charAt(length - 1))   	
	         {							// Remove both first and last character. 
	            Sentence shorter = new Sentence(text.substring(1, length - 1));
	            return shorter.isPalindrome();
	         }
         else
            return false;
   }
}
