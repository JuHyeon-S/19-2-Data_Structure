package day1;
import java.util.*;

public class FactorialRecursive {
	
	public static int fac1(int a) {
		if (a == 1) {
			return 1; 
		}
		else return a*fac1(a-1);
	}
}
