package Strings;

public class Basic_prb {

	public static void main(String[] args) {
		Basic_prb obj =new Basic_prb();
		Thread n = new Thread();	
		
		obj.Basic_prb_1();//aavvvbccdddddeeeeee
		//obj.Basic_prb_1i();
		//obj.Basic_prb_2();//Thegoodboyalwayswork
		//obj.Basic_prb_3();//1 p 3 a 1 y 1 i 1 l 1 g 1 m 
		
	}
//  static method can be overload.
//	public static void main( ) {
//		Basic_prb obj =new Basic_prb();
//		obj.Basic_prb_1();//aavvvbccdddddeeeeee
//		obj.Basic_prb_1i();
//		obj.Basic_prb_2();//Thegoodboyalwayswork
//		obj.Basic_prb_3();//1 p 3 a 1 y 1 i 1 l 1 g 1 m 
//		
//	}

	private static void Basic_prb_1i() {
		String s="a10v12b20c22d10u5w20";
		int sum=0;
		for(int i=0;i<s.length()-1;i++) {
			
		if((s.charAt(i)>=48 && s.charAt(i)<=49)&&((s.charAt(i+1)>=48 && s.charAt(i+1)<=57))) {
			sum=s.charAt(i)+s.charAt(i+1);
			//System.out.println(sum-78);
			if(s.charAt(i-1)>64) {
				for(int j=0;j<sum-87;j++) {
					System.out.print(s.charAt(i-1));
				}System.out.println();
				}
		}else if((s.charAt(i)>=50 && s.charAt(i)<=57)&&((s.charAt(i+1)>=48 && s.charAt(i+1)<=57))) {
			sum=s.charAt(i)+s.charAt(i+1);
			//System.out.println(sum-78);
			if(s.charAt(i-1)>64) {
				for(int j=0;j<sum-78;j++) {
					System.out.print(s.charAt(i-1));
				}System.out.println();
				}
		}else if((s.charAt(i)>=48 && s.charAt(i)<=57)&&((s.charAt(i+1)>=65 ))&&((s.charAt(i-1)>=65 )))
		{for(int j=0;j<(s.charAt(i)-48);j++) {
				System.out.print(s.charAt(i-1));
			}System.out.println();}
			
		}//System.out.println(sum-78);
	}

	private void Basic_prb_3() {
		String s="payilagam super classn";
		int ls[]=new int[s.length()];
		
		for(int i=0;i<s.length();i++) {
            int count=1;
            boolean flag=true;
           // if(0<i) {
            	for(int j=i-1;j>=0;j--) {
            		if(s.charAt(i)==s.charAt(j))
            			flag=false;
            	}
            //}
            
            
            if(flag==true) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
					//ls[i]=count;
				}		
			}//if(count==1)
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
		String s="R1A1M1A1N1U1J1A1M1";
		for(int i=0;i<s.length()-1;i++) {
			if(i%2==0) {
			for(int j=0;j<(s.charAt(i+1)-48);j++) {
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print(s.charAt(i));
			}
			}
		}
	}

}
