package main;
public interface DoublyCircularListIterator<T> {
	public T next();
	public T prev();
	public T actual();
	public void remove();
	public int size();
}
