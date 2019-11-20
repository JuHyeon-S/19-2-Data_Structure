package work2;
import java.util.NoSuchElementException;
public class w05arr <E>{
	private E a[];
	private int size;
	public w05arr() {
		a = (E[]) new Object[1];
		size = 0;
	}
	private void resize(int newSize) {
		Object[] t = new Object[newSize];
		for (int i = 0; i < size; i++) {
			t[i] = a[i];
		}
		a = (E[]) t;
	}
	public void insertLast(E newItem) {
		if(size == a.length) {
			resize(2*a.length);
		}
		a[size++] = newItem;
	}

	public void insert(E newItem, int k) {
		if(size == a.length) {
			resize(2*a.length);
		}
		for (int i = size-1; i >= k; i--) {
			a[i+1] = a[i];
		}
		a[k] = newItem;
		size++;
	}
	
	public void print() {
		for (int i = 0; i < a.length ; i++ ) {
			if(i < size) System.out.print(a[i] + "\t");
			else System.out.print("null\t");
		}
		System.out.println();
	}
	
	public void varr(int arr[],int k) {
		for (int i = 0; i <arr.length;i++) {
			if(arr[i]>k) insertLast((E)(Object)arr[i]);
			else insert((E)(Object)arr[i],0);
		}
	}
}
