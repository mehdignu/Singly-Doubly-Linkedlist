package lists;

public interface Listable<T> {
	public void add(T data);
	public void delete(int index);
	public void insertAt(int index,T data);
	public T get(int index);
	public boolean isEmpty();
	public void clear();
	public int getSize();
	public void printAll();

}
