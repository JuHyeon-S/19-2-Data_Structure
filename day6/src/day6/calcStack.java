package day6;

import java.util.EmptyStackException;

public class calcStack <E> {
	private E s[];
	private int top;
	public calcStack() {
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
	
	public double calc(String st) {
		String [] c = st.split(",");
		double num1, num2;
		for (int i = 0; i < c.length;i++) {
			if (c[i].equals("+") || c[i].equals("-") || c[i].equals("*") ||c[i].equals("/")) {
				if(top >= 2) {
					num2 = Double.valueOf((String) pop());
					num1 = Double.valueOf((String) pop());
					switch(c[i]) {
					case "+":
						push((E)(Object)(num1 + num2));
						break;
					case "-":
						push((E)(Object)(num1 - num2));
						break;
					case "*":
						push((E)(Object)(num1 * num2));
						break;
					case "/":
						push((E)(Object)(num1 / num2));
						break;
					}
				}
				else {
					System.out.println("수식이 이상합니다.");
					return 0;
				}
			}
			else {
				push((E)(Object)c[i]);
			}
		}
		return Double.valueOf((String) pop());
	}
}
