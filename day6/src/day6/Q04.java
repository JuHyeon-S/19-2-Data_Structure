package day6;

public class Q04 {

	public static void main(String[] args) {
		PCheckArrayStack <String> cs1 = new PCheckArrayStack <String>();
		String str1 = "redivider";
		boolean rst = cs1.checkPalindrome(str1);
		System.out.println(str1 + " -> " + rst);
		
		PCheckArrayStack <String> cs2 = new PCheckArrayStack <String>();
		String str2 = "redder";
		rst = cs2.checkPalindrome(str2);
		System.out.println(str2 + " -> " + rst);
		
		PCheckArrayStack <String> cs3 = new PCheckArrayStack <String>();
		String str3 = "a";
		rst = cs3.checkPalindrome(str3);
		System.out.println(str3 + " -> " + rst);
		
		PCheckArrayStack <String> cs4 = new PCheckArrayStack <String>();
		String str4 = "abbd";
		rst = cs4.checkPalindrome(str4);
		System.out.println(str4 + " -> " + rst);
		
		PCheckArrayStack <String> cs5 = new PCheckArrayStack <String>();
		String str5 = "koxko";
		rst = cs5.checkPalindrome(str5);
		System.out.println(str5 + " -> " + rst);
	}

}
