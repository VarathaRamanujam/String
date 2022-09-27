package Strings;

public class String_Anagram {

	public static void main(String[] args) {
		String_Anagram obj = new String_Anagram();
//		obj.String_Anagram_without_number();
//		obj.String_Anagram_with_number();
		obj.String_palimrone();
	}

	private void String_palimrone() {
		String s1 ="eradare";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
			s2+=s1.charAt(i);
		
		if(s1.equals(s2))
			System.out.println("It is palimrone");
		else 
			System.out.println("Its not a palimrone");
	}

	private void String_Anagram_with_number() {
		String s1="e133le122pha8482nt34s1233";
		String s2="El8689982eph83939ants1578";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		s1=s1.replaceAll("[0-9]", "");
		s2=s2.replaceAll("[0-9]", "");
		//System.out.println(s1);
		//System.out.println(s2);
		int num1=0;
		int num2=0;
		
		if(s1.length()==s2.length()) {
			for(int i=0;i<s1.length();i++) {
				num1+=s1.charAt(i);
				num2+=s2.charAt(i);
			}
			if(num1==num2) {
				System.out.println("Anagaram");
			}else
				System.out.println("Not a anagaram");
			
			
		}else
			System.out.println("Not a anagaram");
	
	}

	private void String_Anagram_without_number() {
		String s1="elephants";
		String s2="Eltyhust";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		s1=s1.replaceAll("[0-9]", "");
		s2=s2.replaceAll("[0-9]", "");
		//System.out.println(s1);
		//System.out.println(s2);
		//s1=s1.trim();
		
//		int ls[]=new int [s1.length()];
//		
//		for(int i=0;i<s1.length();i++) {
//			int count=1;
//			for(int j=i;j<s2.length();j++) {
//				if(s1.charAt(i)==s1.charAt(j)  && i!=j) {
//					count++;
//					ls[i]=count;
//				}
//			}
//		}
//		
//		int check =0;
//		int ls1[]=new int [s1.length()];
//		for(int i=0;i<ls.length;i++) {
//			if(ls[i]>1) {
//				int count=1;
//				for(int j=0;j<s2.length();j++) {
//					if(s2.charAt(i)==s2.charAt(j)  && i!=j) {
//						count++;
//					}
//				}
//				if(count==ls[i]) {
//					check++;
//					ls1[i]=count;
//				}
//				//ls1[i]=i;
//			//System.out.println(ls[i]+" index : "+i);
//		}
//		}
//		
//		for(int i=0;i<ls.length;i++) {
//			System.out.println(ls[i]);
//			System.out.println(ls1[i]+"   eeeee");
//		}
//		for(int i=0;i<ls1.length;i++) { // suma
//			int count=1;
//			for(int j=i;j<s2.length();j++) {
//				if(s1.charAt(i)==s1.charAt(j)  && i!=j) {
//					count++;
//					ls[i]=count;
//				}
//			}
//		}
//		
		
		
		
//		
		int num1=0;
		int num2=0;
		
		if(s1.length()==s2.length()) {
			for(int i=0;i<s1.length();i++) {
				num1+=s1.charAt(i);
				num2+=s2.charAt(i);
			}
			if(num1==num2) {
				System.out.println("Anagaram");
			}else
				System.out.println("Not a anagaram");
			
			
		}else
			System.out.println("Not a anagaram");
	}

}
