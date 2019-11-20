package day7;

import java.util.NoSuchElementException;

public class LQAvg <E>{
	private Node<E> front,rear;
	private int size;
	public LQAvg() {
		front = rear = null;
		size = 0;
	}
	public int size() { return size; }
	public boolean isEmpty() { return size() == 0; }
	
	public void add(E newItem) {
		Node newNode = new Node(newItem, null);
		if (isEmpty()) front = newNode;
		else rear.setNext(newNode);
		rear = newNode;
		size++;
	}
	
	public E remove() {
		if (isEmpty()) throw new NoSuchElementException();
		E frontItem = front.getItem();
		front = front.getNext();
		if(isEmpty()) rear = null;
		size--;
		return frontItem;
	}
	
	public void print() {
		Node p = front;
		for (int i = 0; i < size(); i++) {
			System.out.print(p.getItem() + "\t");
			p = p.getNext();
		}
		System.out.println();
	}
	
	public double avg() {
		Node p = front;
		double sum = 0;
		double x;
		int size = size();
		for (int i = 0; i < size; i++) {
			x = Double.valueOf((int)remove());
			sum += x;
			add((E)(Object)(int)x);
		}
		return sum/size();
	}
}
