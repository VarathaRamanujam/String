package Strings;

public class String_encrypt {

	public static void main(String[] args) {
		String_encrypt obj = new String_encrypt();
		//obj.String_encrypt_1();
		//obj.String_encrypt_2();
		//obj.String_encrypt_3();
		//obj.String_encrypt_4();
		//obj.String_encrypt_5();
		//obj.String_encrypt_6();
		//obj.String_encrypt_7();

	}

	private void String_encrypt_7() {
		String s="bnwaz";
		char ls[] = s.toCharArray();
		for (int i=0;i<ls.length;i++) {
			if(ls[i]+5>=122) {
				ls[i]=(char) ((ls[i]-21));
			}else
			ls[i]=(char) ((ls[i]+5));
		}
		String sc = new String(ls);
		System.out.print(sc+" ");
	}

	private void String_encrypt_6() {
		String s="bnwaz";
		char ls[] = s.toCharArray();
		for (int i=0;i<ls.length;i++) {
//			if(ls[i]>=122) {
//				ls[i]=(char) ((ls[i]-25));
//			}else
			ls[i]=(char) ((ls[i]-33));
		}
		String sc = new String(ls);
		System.out.print(sc+" ");
	}

	private void String_encrypt_5() {
		String s="bnwaz";
		char ls[] = s.toCharArray();
		for (int i=0;i<ls.length;i++) {
//			if(ls[i]>=122) {
//				ls[i]=(char) ((ls[i]-25));
//			}else
			ls[i]=(char) ((ls[i]-32));
		}
		String sc = new String(ls);
		System.out.print(sc+" ");
	}

	private void String_encrypt_4() { // Traverse
		String s="AMVZY";
		char ls[] = s.toCharArray();
		for(int j=0;j<3;j++) {
		int temp =ls[0];
		
		for(int i=0;i<ls.length-1;i++) {
			ls[i]=ls[i+1];
		}ls[ls.length-1]=(char) temp;
		}
	        String sc = new String(ls);
			System.out.print(sc+" ");
		
	}

	private void String_encrypt_3() {
		  // AMVZY ----->DOYBB
		String s="AMVZY";
		char ls[] = s.toCharArray();
			for (int i=0;i<ls.length;i++) {
				if(i%2==0) {
					if((ls[i]+2)>=90) {
						ls[i]=(char) ((ls[i]-23));
					}else
					ls[i]=(char) (ls[i]+3);
				}else {
				
				if(ls[i]>=90) {
					ls[i]=(char) ((ls[i]-24));
				}else
				ls[i]=(char) ((ls[i])+2);
				}
			}
			String sc = new String(ls);
			System.out.print(sc+" ");
		}
	

	private void String_encrypt_2() {//AMVZY--->bnwaz
		String s="AMVZY";
		char ls[] = s.toCharArray();
		for (int i=0;i<ls.length;i++) {
			if(ls[i]>=90) {
				ls[i]=(char) ((ls[i]-25)+32);
			}else
			ls[i]=(char) ((ls[i]+32)+1);
		}
		String sc = new String(ls);
		System.out.print(sc+" ");
	}

	private void String_encrypt_1() { //AMVZY-->amvzy
		
		String s="AMVZY";
		char ls[] = s.toCharArray();
		for (int i=0;i<ls.length;i++) {
			if(ls[i]>90) {
				ls[i]=(char) ((ls[i]-26));
			}else
			ls[i]=(char) ((ls[i]+32));
		}
		String sc = new String(ls);
		System.out.print(sc+" ");
		
	}
	}


