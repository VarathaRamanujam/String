package Strings;

public class String_Constructors {

	String_Constructors(){
		System.out.println("Default Constructor");
	}
	
	public String_Constructors(char [] c) {
		System.out.println("Char Array Constructor");
	}

	public String_Constructors(char[] a, int i, int j) {
		System.out.println("Char with index and count");
	}

	public String_Constructors(String s, int offset, int count) {
		System.out.println("String with index and count");
	}

	public static void main(String[] args) {
		String_Constructors obj0 = new String_Constructors();
		char[] a = null;
		String_Constructors obj1 = new String_Constructors(a);
		String s="hgjhgjhg";
		String_Constructors obj2 = new String_Constructors(s,1,3);
		
		String_Constructors obj3 = new String_Constructors(a,6,8);
		
		String first_name=new String("abcd");
		System.out.print(first_name);
		String last_name="efgh";
		System.out.println(last_name);
		
	}

}
