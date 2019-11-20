package day7;

public class animalNode<E> {
	@SuppressWarnings("unchecked")
	private E []item = (E[]) new Object[2];
	private animalNode<E> next;
	public animalNode(E []newItem, animalNode<E> node) {
		item[0] = newItem[0];
		item[1] = newItem[1];
		next = node;
	}
	public E getType() { return item[1]; }
	public E getItem() { return item[0]; }
	public animalNode<E> getNext() { return next; }
	public void setItem(E []newItem) {
		item[0] = newItem[0];
		item[1] = newItem[1];
	}
	public void setNext(animalNode<E> newNext) { next = newNext;} 
}
