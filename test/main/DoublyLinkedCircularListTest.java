package main;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import main.DoublyCircularListIterator;
import main.DoublyLinkedCircularList;

public class DoublyLinkedCircularListTest {
	
	@Test
	public void testDoublyCircularListDeUnElementoConUnIteradorUsandoNext() {
		DoublyLinkedCircularList<Integer> list = new DoublyLinkedCircularList<Integer>();
		list.add(1);
		DoublyCircularListIterator<Integer> iterator = list.iterator();
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for(int i = 0;i<10;i++) {
			resultado.add(iterator.actual());
			iterator.next();
		}
		Assert.assertArrayEquals(new Object[]{1,1,1,1,1,1,1,1,1,1}, resultado.toArray());
	}
	
	@Test
	public void testDoublyCircularListDeUnElementoConUnIteradorUsandoPrev() {
		DoublyLinkedCircularList<Integer> list = new DoublyLinkedCircularList<Integer>();
		list.add(1);
		DoublyCircularListIterator<Integer> iterator = list.iterator();
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for(int i = 0;i<10;i++) {
			resultado.add(iterator.actual());
			iterator.prev();
		}
		Assert.assertArrayEquals(new Object[]{1,1,1,1,1,1,1,1,1,1}, resultado.toArray());
	}
	
	@Test
	public void testDoublyCircularListDeDosElementosConUnIteradorUsandoNext() {
		DoublyLinkedCircularList<Integer> list = new DoublyLinkedCircularList<Integer>();
		list.add(1);
		list.add(2);
		DoublyCircularListIterator<Integer> iterator = list.iterator();
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for(int i = 0;i<10;i++) {
			resultado.add(iterator.actual());
			iterator.next();
		}
		Assert.assertArrayEquals(new Object[]{1,2,1,2,1,2,1,2,1,2}, resultado.toArray());
	}
	
	@Test
	public void testDoublyCircularListDeDosElementosConUnIteradorUsandoPrev() {
		DoublyLinkedCircularList<Integer> list = new DoublyLinkedCircularList<Integer>();
		list.add(1);
		list.add(2);
		DoublyCircularListIterator<Integer> iterator = list.iterator();
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for(int i = 0;i<10;i++) {
			resultado.add(iterator.actual());
			iterator.prev();
		}
		Assert.assertArrayEquals(new Object[]{1,2,1,2,1,2,1,2,1,2}, resultado.toArray());
	}
	
	@Test
	public void testDoublyCircularListDeTresElementosConUnIteradorUsandoNext() {
		DoublyLinkedCircularList<Integer> list = new DoublyLinkedCircularList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		DoublyCircularListIterator<Integer> iterator = list.iterator();
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for(int i = 0;i<10;i++) {
			resultado.add(iterator.actual());
			iterator.next();
		}
		Assert.assertArrayEquals(new Object[]{1,2,3,1,2,3,1,2,3,1}, resultado.toArray());
	}
	
	@Test
	public void testDoublyCircularListDeTresElementosConUnIteradorUsandoPrev() {
		DoublyLinkedCircularList<Integer> list = new DoublyLinkedCircularList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		DoublyCircularListIterator<Integer> iterator = list.iterator();
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for(int i = 0;i<10;i++) {
			resultado.add(iterator.actual());
			iterator.prev();
		}
		Assert.assertArrayEquals(new Object[]{1,3,2,1,3,2,1,3,2,1}, resultado.toArray());
	}
	
	@Test
	public void testDoublyCircularListDeCutroElementoConDosIteradoresUsandoNext() {
		DoublyLinkedCircularList<Integer> list = new DoublyLinkedCircularList<Integer>();
		list.add(new Integer(1));
		list.add(2);
		list.add(3);
		list.add(4);
		DoublyCircularListIterator<Integer> iterator1 = list.iterator();
		DoublyCircularListIterator<Integer> iterator2 = list.iterator();
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for(int i = 0;i<5;i++) {
			resultado.add(iterator1.next());//24242
			resultado.add(iterator2.next());//23412
			resultado.add(iterator1.next());//31313
		}
		Assert.assertArrayEquals(new Object[]{2,2,3,4,3,1,2,4,3,4,1,1,2,2,3}, resultado.toArray());
	}
	
	@Test
	public void testDoublyCircularListDeCutroElementoConDosIteradoresUsandoPrev() {
		DoublyLinkedCircularList<Integer> list = new DoublyLinkedCircularList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		DoublyCircularListIterator<Integer> iterator1 = list.iterator();
		DoublyCircularListIterator<Integer> iterator2 = list.iterator();
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for(int i = 0;i<5;i++) {
			resultado.add(iterator1.prev());//42424
			resultado.add(iterator2.prev());//43214
			resultado.add(iterator1.prev());//31313
		}
		Assert.assertArrayEquals(new Object[]{4,4,3,2,3,1,4,2,3,2,1,1,4,4,3}, resultado.toArray());
	}

}
