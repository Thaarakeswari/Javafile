package assignment;

import java.util.Arrays;

public class anagram {
	

		public static void main(String[] args) 
		{
			String first="heaven";
			String second="eeavhn";
			
			if(first.length()!=second.length())
			{
				System.out.println("They are not anagram since "+first+"is not same as"+second);
			}
			else
			{
				System.out.println("Step 1: Passed your both stings legth are same");
				char a1[]=	first.toCharArray();
				//s,c,h,o,o,l
			System.out.println(	Arrays.toString(a1));
				Arrays.sort(a1);
				//c,h,l,o,o,s
				System.out.println(	Arrays.toString(a1));
				char a2[]=	second.toCharArray();
				//s,c,h,o,o,l
			System.out.println(	Arrays.toString(a2));
				Arrays.sort(a2);
				//c,h,l,o,o,s
				System.out.println(	Arrays.toString(a2));
				boolean answer=	Arrays.equals(a1,a2);
			System.out.println(answer);
//				if(answer==true)
//				{
//					System.out.println("The given 2 stings are anagram");
//				}
//				else
//				{
//					System.out.println("They are not anagram");
//					System.out.println("Since alphabets of the given 2 strings are not same");
//				}
//				
			}
			
			
		}

	}



