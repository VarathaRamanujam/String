package Strings;

public class Basic_prb {

	public static void main(String[] args) {
		Basic_prb obj =new Basic_prb();
		obj.Basic_prb_1();//aavvvbccdddddeeeeee
		//obj.Basic_prb_2();//Thegoodboyalwayswork
		//obj.Basic_prb_3();//1 p 3 a 1 y 1 i 1 l 1 g 1 m 
		
	}

	private void Basic_prb_3() {
		String s="payilagam";
		int ls[]=new int[s.length()];
		
		for(int i=0;i<s.length();i++) {
            int count=1;
            boolean flag=true;
            if(0<i) {
            	for(int j=i-1;j>=0;j--) {
            		if(s.charAt(i)==s.charAt(j))
            			flag=false;
            	}
            }
            
            
            if(flag==true) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
					ls[i]=count;
				}		
			}if(count==1)
				ls[i]=count;
		}
		}
		
		for(int i=0;i<ls.length;i++)
			if(ls[i]>0)
			System.out.println(ls[i]+" "+s.charAt(i));
	}

	private void Basic_prb_2() {
		String s="The good boy always work";
		String s1=s.replaceAll(" ", "");
		System.out.println(s1);
	}
	

	private void Basic_prb_1() {
		String s="a2v3b1c2d5e6";
		for(int i=0;i<s.length()-1;i++) {
			if(i%2==0) {
			for(int j=0;j<(s.charAt(i+1)-48);j++) {
				System.out.print(s.charAt(i));
			}
			}
		}
	}

}
