package Strings;

public class String_Home_Work {

	public static void main(String[] args) {
		String_Home_Work obj = new String_Home_Work();
		//obj.String_Home_Work_1();//Everything Is Your Second Chance
		//obj.String_Home_Work_2();//BaLa
		obj.String_Home_Work_3();
	}

	private void String_Home_Work_3() {
		String s="All is well and love";
		String [] s1=s.split(" "); 
		String [] s2 =new String [s1.length];
		
		for(int i=0;i<s1.length;i++) {
			int count =1;
			String c="";
			for(int j=0;j<s1[i].length();j++) {
				
				if(s1[i].charAt(j)=='l' && count==1) {
					char b=(char) (s1[i].charAt(j)-32);
					c+=b;
					count++;
				}else
					c+=s1[i].charAt(j);	
			}s2[i]=c;
		}
			String ans="";
		for(int i=0;i<s2.length;i++)
			ans+=" "+s2[i];
		
		System.out.println(ans.trim());
	}

	private void String_Home_Work_2() {
		String s="ramanujam";
		String s1="";
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				char c=(char) (s.charAt(i)-32);
				s1+=c;
			}else
				s1+=s.charAt(i);
		}
		System.out.println(s1);
	}

	private void String_Home_Work_1() {
		String s ="everything is your second chance";
		String s1="";
		
		String c []= s.split(" ");
		String c1[]= new String [c.length];
		
			for(int i=0;i<c.length;i++) {
				String ans="";
				for(int j=1;j<c[i].length();j++) {
					ans+=c[i].charAt(j);
				}char c12=(char) (c[i].charAt(0)-32);
				c1[i]=c12+ans;
		}
			String s12="";
			for(int i=0;i<c1.length;i++)
			s12+=" "+c1[i];
			
			System.out.println(s12.trim());
		
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)==' ') {
//				char c=(char) (s.charAt(i+1)-32);
//				s1=s1+c;
//				//s1=s1.toUpperCase();
//						}else
//							s1=s1+s.charAt(i);
//		}
		System.out.println(s1);
	}

}
