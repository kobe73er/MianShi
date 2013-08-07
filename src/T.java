public class T {
	public static void main(String args[]){
	String s="   Example String  ";
	System.out.println(s.length());
	//s[3]="x";
	String short_s=s.trim();
	System.out.println(short_s);
	String t="root"+s;
	System.out.println("t==>"+t);
}
}

// A.int i=s.length();
// B.s[3]=”x”;
// C.String short_s=s.trim();
// D.String t=”root”+s;