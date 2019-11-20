package day7;

import java.util.NoSuchElementException;

public class AnimalShelter<E> {
	private animalNode<E> front,rear;
	private int size;
	public AnimalShelter() {
		front = rear = null;
		size = 0;
	}
	public int size() { return size; }
	public boolean isEmpty() { return size() == 0; }
	
	public void add(E []newItem) {
		animalNode newNode = new animalNode(newItem, null);
		if (isEmpty()) front = newNode;
		else rear.setNext(newNode);
		rear = newNode;
		size++;
	}
	
	public E[] remove(E type) {
		if (isEmpty()) throw new NoSuchElementException();
		E[] frontItem = (E[]) new Object[2];
		animalNode<E> p = front.getNext();
		if (type == front.getType()) {
			frontItem[0] = front.getItem();
			frontItem[1] = front.getType();
			front = front.getNext();
		}
		else {
			while(type != p.getType()) {
				p = p.getNext();
			}
			frontItem[0] = p.getItem();
			frontItem[1] = p.getType();
			p = p.getNext();
			front.setNext(p);
		}
		
		if(isEmpty()) rear = null;
		size--;
		return (E[])frontItem;
	}
	public E[] remove() {
		if (isEmpty()) throw new NoSuchElementException();
		E[] frontItem = (E[]) new Object[2];
		frontItem[0] = front.getItem();
		frontItem[1] = front.getType();
		
		front = front.getNext();
		if(isEmpty()) rear = null;
		size--;
		return (E[])frontItem;
	}
	
	public void print() {
		animalNode p = front;
		E a[] = (E[]) new Object[2];
		for (int i = 0; i < size(); i++) {
			a[0] = (E)p.getItem();
			a[1] = (E)p.getType();
			System.out.print(a[0] + " (" + a[1] + ")\t");
			p = p.getNext();
		}
		System.out.println();
	}
	
	public void Enter(E []newItem) {
		add(newItem);
	}
	public E[] adoptAny() {
		return remove();
	}
	public E[] adoptDog() {
		return remove((E)"Dog");
	}
	public E[] adoptCat() {
		return remove((E)"Cat");
	}
}
