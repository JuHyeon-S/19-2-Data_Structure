package day11;

public class QuadProbing<K, V> {
	private int N = 0, M = 13;
	private K[] a = (K[]) new Object[M];
	private V[] d = (V[]) new Object[M];

	private int hash(K key) {
		return (key.hashCode() & 0x7fffffff) % M;
	}

	public void put(K key, V data) {
		int initialpos = hash(key);
		int i = initialpos, j = 1;
		do {
			if (a[i] == null) {
				a[i] = key;
				d[i] = data;
				N++;
				return;
			}
			if (a[i].equals(key)) {
				d[i] = data;
			}
			i = (initialpos + j * j++) % M;
		} while (N < M);
	}

	public V get(K key) {
		int initialpos = hash(key);
		int i = initialpos, j = 1;
		while(a[i] != null) {
			if(a[i].equals(key))
				return d[i];
			i = (initialpos + j * j++) % M;
		}
		return null;
	}
}
