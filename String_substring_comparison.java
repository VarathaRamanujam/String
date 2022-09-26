package Strings;

import java.util.Arrays;

public class String_substring_comparison {

	public static void main(String[] args) {
		String_substring_comparison obj =new String_substring_comparison();
		obj.String_substring_comparison("welcometojava",3);
	}

	private void String_substring_comparison(String s, int k) {
		String ls[]=new String[s.length()-(k-1)];
		for(int i=0;i<s.length()-(k-1);i++) {	
			for(int j=i;j<i+k;j++) {
				ls[i]= s.substring(i, i+k);
							}
		}
		int index=0;
		String smallest = "";
        String largest = "";
//		for(int i=0;i<ls.length;i++) {	
//			System.out.println(ls[i]);				
//	}
		for(int i=0;i<ls.length;i++) {
			//Arrays.sort(ls);
			//System.out.println(ls[0].charAt(index));
			for(int j=0;j<ls.length-1;j++) {
			if(ls[i].charAt(index)  < ls[j].charAt(index)  && i!=j) {
				String temp=ls[i];
				ls[i]=ls[j];
				ls[j]=temp;
				
			}
			}
			
		}
	//	System.out.println(ls[0]+" jj");
		smallest=ls[0];
		largest=ls[ls.length-1];
		System.out.println(smallest +"\n"+largest);
			
		
//		for(int i=0;i<ls.length;i++) {	
//				System.out.println(ls[i]);				
//		}
		
		
	}

}
