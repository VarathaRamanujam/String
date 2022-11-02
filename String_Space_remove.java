package Strings;

public class String_Space_remove {

	public static void main(String[] args) 
	{
		String_Space_remove obj  = new String_Space_remove();
		obj.String_Space_remove();
	}
	

	private void String_Space_remove() 
	{
      String s="     Hello       Man     Whaptsup          How ";
      String ss="";
       for(int i=0;i<s.length();i++) 
       {
        if(s.charAt(i)!=' ') 
        {
    	 if(s.charAt(i)>65 && s.charAt(i)<96)
    			ss+=' ';
    		    ss+=s.charAt(i);
    	   }
       }
       System.out.println(ss);
	}

}
