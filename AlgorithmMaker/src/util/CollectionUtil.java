package util;

import java.util.*;

public class CollectionUtil {
	public static <K, V> Hashtable<K, V> deepClone(Hashtable<K, V> object) {
		Hashtable<K, V> clone = new Hashtable<K, V>();
		for (K key : object.keySet())
			clone.put(deepClone(key), deepClone(object.get(key)));

		return clone;
	}

	public static <T> HashSet<T> deepClone(HashSet<T> object) {
		HashSet<T> clone = new HashSet<T>();
		for (T subObject : object)
			clone.add(deepClone(subObject));

		return clone;
	}

	public static <T> ArrayList<T> deepClone(ArrayList<T> object) {
		ArrayList<T> clone = new ArrayList<T>();
		for (T subObject : object)
			clone.add(deepClone(subObject));

		return clone;
	}

	@SuppressWarnings("unchecked")
	public static <T> T deepClone(T object) {
		if (object instanceof Hashtable)
			return (T) deepClone((Hashtable<?, ?>) object);
		if (object instanceof HashSet)
			return (T) deepClone((HashSet<?>) object);

		return object;
	}
}
