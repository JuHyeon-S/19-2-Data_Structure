package day4;

import java.util.NoSuchElementException;

public class ArrListPoly {
	private int a[];
	private int size;
	private int highestDegree;
	public ArrListPoly() {
		a = new int[1];
		size = 0;
	}
	
	public int peek(int k) {
		if (size == 0 || k >= size) throw new NoSuchElementException();
		return a[k];
	}
	
	private void resize(int newSize) {
		int[] t = new int[newSize];
		for (int i = 0; i < size; i++) { t[i] = a[i]; }
		a = t;
	}
	
	public void insertLast(int newItem) {
		if(size == a.length) {
			resize(2*a.length);
		}
		a[size++] = newItem;
	}
	
	void setPoly(int hDegree, int poly[]){
		highestDegree = hDegree;
		for (int i = 0;i <= highestDegree;i++) { insertLast(poly[i]); }
	}
	
	int getHighestDegree() { return highestDegree; }
	
	ArrListPoly sumPoly(ArrListPoly b) {
		ArrListPoly sP = new ArrListPoly();
		int high;
		
		if (highestDegree >= b.getHighestDegree()) { high = highestDegree + 1; }
		else { high = b.getHighestDegree() + 1; }
		
		int sum[] = new int[high];
		
		for (int i = 0; i < high;i++) {
			if (i > highestDegree + 1) { sum[i] = b.a[i]; }
			else if (i > b.getHighestDegree() + 1) { sum[i] = a[i]; }
			else { sum[i] = a[i] + b.a[i]; }
		}
		
		sP.setPoly(high - 1,sum);
		
		return sP;
	}
}
