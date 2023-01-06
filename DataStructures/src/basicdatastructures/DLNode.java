package basicdatastructures;

public class DLNode<E> {
	
	protected E element;
	protected DLNode<E> next, prev;
	
	public DLNode() {
		element = null;
		prev = null;
		next = null;
	}
	
	public DLNode(E e, DLNode<E> p, DLNode<E> n) {
		element = e;
		prev = p;
		next = n;
	}
	
	public E getElement() { return element; }
	public DLNode<E> getPrev() { return prev; }
	public DLNode<E> getNext() { return next; }
	public void setElement(E newElem) { element = newElem; }
	public void setPrev(DLNode<E> newPrev) { prev = newPrev; }
	public void setNext(DLNode<E> newNext) { next = newNext; }
	
}
