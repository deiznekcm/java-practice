package basicdatastructures;

public class NodeDeque<E> implements Deque<E> {
	
	protected DLNode<E> header, trailer;
	protected int size;

	public NodeDeque() {
		header = new DLNode<E>();
		trailer = new DLNode<E>();
		header.setNext(trailer);
		trailer.setPrev(header);
		size = 0;
	}
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size==0;
	}

	@Override
	public E getFirst() throws Exception {
		return header.getNext().getElement();
	}

	@Override
	public E getLast() throws Exception {
		return trailer.getPrev().getElement();
	}

	@Override
	public void addFirst(E element) {
		DLNode<E> newNode = new DLNode<E>(element, header, null);
		newNode.setNext(header.getNext());
		header.setNext(newNode);
		newNode.getNext().setPrev(newNode);
		size++;
	}

	@Override
	public void addLast(E element) {
		DLNode<E> newNode = new DLNode<E>(element, null, trailer);
		newNode.setPrev(trailer.getPrev());
		trailer.setPrev(newNode);
		newNode.getPrev().setNext(newNode);
		size++;
	}

	@Override
	public E removeFirst() throws Exception {
		DLNode<E> n = header.getNext();
		n.getNext().setPrev(header);
		header.setNext(n.getNext());
		n.setPrev(null);
		n.setNext(null);
		size--;
		return n.getElement();
	}

	@Override
	public E removeLast() throws Exception {
		DLNode<E> n = trailer.getPrev();
		n.getPrev().setNext(trailer);;
		trailer.setPrev(n.getPrev());
		n.setPrev(null);
		n.setNext(null);
		size--;
		return n.getElement();
	}

}
