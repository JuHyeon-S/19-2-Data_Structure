package day6;

public class Q03 {
	public static void main(String [] args) {
		checkStack <String> cs1 = new checkStack <String>();
		checkStack <String> cs2 = new checkStack <String>();
		
		String str1 = "(ant+bee)*crab+{[ant*food]+(offset)}/gas";
		boolean rst = cs1.checkParentheses(str1);
		System.out.println(str1 + " -> " + rst);
		
		String str2 = "(ant+bee)*crab+[ant*food]+(offset)}/gas";
		rst = cs2.checkParentheses(str2);
		System.out.println(str2 + " -> " + rst);
	}
}
