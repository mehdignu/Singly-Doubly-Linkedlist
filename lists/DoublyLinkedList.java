package lists;

public class DoublyLinkedList<T> implements Listable<T> {

	private Node head;
	private Node tail;
	
	private class Node{
		T data;
		Node next;
		Node prev;
	}
	
	@Override
	public void add(T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertAt(int index, T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void printAll() {
		System.out.println(this.getClass().getSimpleName());
		// TODO Auto-generated method stub
		
	}
	
	

}
