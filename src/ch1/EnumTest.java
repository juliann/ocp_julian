package ch1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class EnumTest {
	interface Tree{
		
	}

	public static void main(String[] args) {
		System.out.println(Season.FALL.ordinal());
		Tree t = new Tree(){
			public void s() {
				System.out.println("hi");
			}
		};
		
		List ix= new List() {
			int x= 10;
			
			@Override
			public int size() {
				System.out.println("Hi");
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray(Object[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean add(Object e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(Collection c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(int index, Collection c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean removeAll(Collection c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Object get(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object set(int index, Object element) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void add(int index, Object element) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Object remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public ListIterator listIterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ListIterator listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public List subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
	
		for(Season s:Season.values()) {
			System.out.println(s.name() + " " + s.ordinal() );
			s.printV();
			s.print();
		}
		
		System.out.println(2==Season.FALL.ordinal());
		System.out.println(3==Season.FALL.ordinal());
		Season.WINTER.print();
	}
}
