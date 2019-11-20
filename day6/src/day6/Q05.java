package day6;

public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EqStack<String> eq1 = new EqStack<String>();
		
		String s1 = "A*(B+C/D)";
		String rst = eq1.getPostEq(s1);
		System.out.println(s1 + " -> " + rst);
		
		EqStack<String> eq2 = new EqStack<String>();
		
		String s2 = "(A+B)*(C-D)";
		rst = eq1.getPostEq(s2);
		System.out.println(s2 + " -> " + rst);
		
		EqStack<String> eq3 = new EqStack<String>();
		
		String s3 = "A+B+C*(B+C*D)/D";
		rst = eq1.getPostEq(s3);
		System.out.println(s3 + " -> " + rst);
	}
}
