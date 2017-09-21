public class CircularArray<T> implements Iterable<T> {
	private T[] items;
	int head;
	public class CircularArrayIterator<T> implements Iterator<T> {
	private current;
	public CircularArrayIterator() {
          current = 0;
	}

	public boolean hasNext() {
		return current < items.length;
	}
	public T next() {
		return items.get(current++);

	}
}
	public CircularArray(int size) {
		items = (T[])new Object[size];
		head = 0;
	}

	public int convert(int index) {
		return (head + index) % items.length;
	}

	public void shiftRight(int index) {
		ihead = convert(index);
	}

	public T get(int index) {
		if (index < 0 || index >= items.length) {
			return Integer.MIN_VALUE;
		}
		int actualIndex = convert(index);
		return items[actualIndex];
	}

	public void set(int index, int val) {
		if (index < 0 || index >= items.length) {
			return Integer.MIN_VALUE;
		}
		int actualIndex = convert(index);
		items[actualIndex] = val;
	}

	public Iterator<T> Iterator() {
		return new CircularArrayIterator();
	}

}

