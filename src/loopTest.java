
public class loopTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=10;
		do
		{
			
		b-=a;
		System.out.println("b=="+b);
		a++;
		System.out.println("a=="+a);
		
		} while (b--<0);
	}
}
//b=8  a=2 
//b=5  a=3
//b=1  a=4
//b=-4       
//
