package string ;
public class MyClass {

	public static void main(String[] args) {
		 
		StringBuffer sb1=new StringBuffer("Anurag");
		StringBuffer sb2=new StringBuffer("Anurag");
		String ss1="Anurag";
		String ss3 = sb2.toString();
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.equals(ss1));
		System.out.println("Poddar".substring(3));
		System.out.println(ss1.equals(ss3));

		
		/* String sb1=new String("Anurag");
		String sb2=new String("Anurag");
		String ss1="Anurag";
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.equals(ss1));
		System.out.println("Poddar".substring(3)); */

	}

}
