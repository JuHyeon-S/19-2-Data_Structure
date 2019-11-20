package day6;
import java.util.EmptyStackException;
public class ArrayStack <E>{
	private E s[];
	private int top;
	public ArrayStack() {
		s = (E[]) new Object[1];
		top = -1;
	}
	public int size() { return top+1; }
	public boolean isEmpty() { return (top == -1); }
	
	public E peek() {
		if (isEmpty()) throw new EmptyStackException();
		return s[top];
	}
	
	public void resize(int newsize) {
		Object t[] = new Object[newsize];
		for (int i = 0; i < top+1; i++) {
			t[i] = s[i];
		}
		s = (E[]) t;
	}
	
	public void push(E newItem) {
		if (size() == s.length)
			resize(2*s.length);
		s[++top] = newItem;
	}
	
	public E pop() {
		if (isEmpty()) throw new EmptyStackException();
		E item = s[top];
		s[top--] = null;
		if (size() > 0 && size() == s.length/4)
			resize(s.length/2);
		return item;
	}
	
	public void print() {
		for (int i = 0; i < top+1; i++) {
			System.out.print(s[i] + "\t");
		}
		System.out.println();
	}
}
