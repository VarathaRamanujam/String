package Strings;

public class String_Constructors {
String s;
//	String_Constructors(){
//		System.out.println("Default Constructor");
//	}
	
//	public String_Constructors(char [] c) {
//		System.out.println("Char Array Constructor");
//	}
//
//	public String_Constructors(char[] a, int i, int j) {
//		System.out.println("Char with index and count");
//	}
//
//	public String_Constructors(String s, int offset, int count) {
//		System.out.println("String with index and count");
//	}
//
//	public String_Constructors(String string) {
//		this.s=string;  
//	}
	public static void main(String[] args) {
//		String_Constructors obj0 = new String_Constructors();
//		char[] a = null;
//		String_Constructors obj1 = new String_Constructors(a);
//		String s="hgjhgjhg";
//		String_Constructors obj2 = new String_Constructors("abc");	
//		String_Constructors obj3 = new String_Constructors("abc");
		char []arr= {'w','3','d'};
		String obj4 = new String(arr);
		
		//String_Constructors obj5 = obj4;
		//System.out.println(obj4.equals(obj5));
		String first_name=new String("abcd");
		//System.out.print(first_name);
		
		//String last_name=a;
		//System.out.println(last_name);
		System.out.println(obj4);
		
		
		String s1 =new String("abc");
		String s2 =new String("abc");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}

	@Override
	public String toString() {
		return s;
	}

}
