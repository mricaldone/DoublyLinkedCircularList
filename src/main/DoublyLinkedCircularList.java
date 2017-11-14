package main;
public class DoublyLinkedCircularList<E> {
	
	private static class Node {
		
		private Node next;
		private Node prev;
		private Object data;
		
		public Node(Object element) {
			this.next = null;
			this.prev = null;
			this.data = element;
		}
		
	}
	
	public class DoublyLinkedCircularListIterator<T> implements DoublyCircularListIterator<T> {
		
		private Node actual;
		
		public DoublyLinkedCircularListIterator() {
			actual = primer_nodo;
		}
		
		@SuppressWarnings("unchecked")
		public T next() {
			actual = actual.next;
			return (T) actual.data;
		}
		
		@SuppressWarnings("unchecked")
		public T prev() {
			actual = actual.prev;
			return (T) actual.data;
		}
		
		@SuppressWarnings("unchecked")
		public T actual() {
			return (T) actual.data;
		}
		
		public void remove() {
			if(actual == null) return;
			size --;
			Node nodo_anterior = actual.prev;
			Node nodo_siguiente = actual.next;
			if(nodo_anterior == nodo_siguiente) {
				primer_nodo = actual = null;
				return;
			}
			nodo_anterior.next = nodo_siguiente;
			nodo_siguiente.prev = nodo_anterior;
			actual = nodo_siguiente;
		}

		public int size() {
			return size;
		}
		
	}

	private Node primer_nodo;
	private int size;
	
	public DoublyLinkedCircularList(){
		primer_nodo = null;
		size = 0;
	}
	
	public void add(E element) {
		Node nuevo_nodo = new Node(element);
		size ++;
		if(primer_nodo == null) {
			primer_nodo = nuevo_nodo;
			primer_nodo.next = primer_nodo;
			primer_nodo.prev = primer_nodo;
			return;
		}
		Node ultimo_nodo = primer_nodo.prev;
		ultimo_nodo.next = nuevo_nodo;
		primer_nodo.prev = nuevo_nodo;
		nuevo_nodo.prev = ultimo_nodo;
		nuevo_nodo.next = primer_nodo;
	}
	
	public DoublyCircularListIterator<E> iterator() {
		return new DoublyLinkedCircularListIterator<E>();
	}

}