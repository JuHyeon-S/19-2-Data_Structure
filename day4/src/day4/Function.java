package day4;

public class Function {

	public static int fConstant(int[]arr) {
		return arr.length*2;
	}
	public static int fLinear(int[]arr) {
		int totalSum = 0;
		for (int n : arr) {
			totalSum += n;
		}
		return totalSum;
	}
	public static boolean fQuadratic(int[]arr) {
		int target = 30;
		for(int first : arr) {
			for(int second : arr) {
				if(first + second == target) return true;
			}
		}
		return false;
	}
	public static boolean fCubic(int[] arr) {
		int target = 30;
		for(int first : arr) {
			for(int second : arr) {
				for(int third : arr) {
					if(first + second + third == target) return true;
				}
			}
		}
		return false;
	}
	public static boolean fFourth(int[] arr) {
		int target = 30;
		for(int first : arr) {
			for(int second : arr) {
				for(int third : arr) {
					for(int fourth : arr) {
						if(first + second + third + fourth == target) return true;	
					}
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[300];
		for (int i = 0;i<arr.length;i++) arr[i] = 0;
		
		long beforeTime = System.currentTimeMillis();
		fConstant(arr);
		long afterTime = System.currentTimeMillis();
		long diffTimeMillSecond = afterTime - beforeTime;
		System.out.println("Time diff (ms): "+diffTimeMillSecond);
		
		beforeTime = System.currentTimeMillis();
		fLinear(arr);
		afterTime = System.currentTimeMillis();
		diffTimeMillSecond = afterTime - beforeTime;
		System.out.println("Time diff (ms): "+diffTimeMillSecond);
		
		beforeTime = System.currentTimeMillis();
		fQuadratic(arr);
		afterTime = System.currentTimeMillis();
		diffTimeMillSecond = afterTime - beforeTime;
		System.out.println("Time diff (ms): "+diffTimeMillSecond);
		
		beforeTime = System.currentTimeMillis();
		fCubic(arr);
		afterTime = System.currentTimeMillis();
		diffTimeMillSecond = afterTime - beforeTime;
		System.out.println("Time diff (ms): "+diffTimeMillSecond);
		
		beforeTime = System.currentTimeMillis();
		fFourth(arr);
		afterTime = System.currentTimeMillis();
		diffTimeMillSecond = afterTime - beforeTime;
		System.out.println("Time diff (ms): "+diffTimeMillSecond);
	}
}
