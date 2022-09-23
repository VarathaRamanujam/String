package Strings;

public class Strings_Methods {
// static char [] a;
	public static void main(String[] args) {
		Strings_Methods obj = new Strings_Methods();
		//obj.Seperate_By_Space();
//		obj.toUppercase("arun g");
//		obj.toLower("ARUN G");
//		obj.startWith("arun g");
//		obj.endWith("arun g");
//		obj.replaceAllWith('a','e');
//		obj.spilit(' ');
		obj.length();
		
	
	}

	private void length() {
		String name = "Varatha Ramanujam C";
		int index=0;
		char [] c =name.toCharArray();
		
//		while(name.charAt(index)==name.endsWith("C")) {
//			index++;
//			continue;
//		}System.out.println(index);
				
	
	}

	private void spilit(char s) {
	String name = "Varatha Ramanujam C";
	int index=0;
	
	String [] e= {"","",""};
	for(int i=0;i<name.length();i++) {
		if(name.charAt(i)==s) {
			index++;
		}else 
			e[index]=e[index]+name.charAt(i);
	}
	
	for(int i=0;i<e.length;i++) {
		System.out.println(e[i]);
	}
}

	private void replaceAllWith(char st, char string2) {
	String s="India ia My country";
	char c[] = s.toCharArray();
	for(int i=0;i<c.length;i++) {
		if(st==(c[i])) {
			c[i]=(char)string2;			
		}
	}
	String sc = new String(c);
	System.out.println(c);
}

	private void endWith(String s) {
		 char [] c=s.toCharArray();		    
		    System.out.println(c[c.length-1]);
}

	private void startWith(String s) {
		 char [] c=s.toCharArray();		    
		    System.out.println(c[0]);
}

	private void toLower(String s) {
		 char [] c=s.toCharArray();
		    for(int i=0;i<c.length;i++) {
		    	if(c[i]>64 && c[i]<91)
		    		c[i]=(char) (c[i]+32);
		    }
		    
		    System.out.println(c);
}

	private void toUppercase(String s) {
    char [] c=s.toCharArray();
    for(int i=0;i<c.length;i++) {
    	if(c[i]>96 && c[i]<123)
    		c[i]=(char) (c[i]-32);
    }
    
    System.out.println(c);
}

	private void Seperate_By_Space() {
		String s="the spilit is today";
		//s.toUpperCase();
		char[] a=s.toCharArray();
		String d = new String(a);
		System.out.println(d);
		String ls[] = new String[5];
		String[] b =s.split(" ");
		for(int i=0;i<a.length;i++) {
			
		//System.out.println(a[i]);
		}
	}

	@Override
	public String toString() {
	
		return " ";
	}

}
