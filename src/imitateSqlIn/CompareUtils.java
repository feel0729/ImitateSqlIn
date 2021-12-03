package imitateSqlIn;

public class CompareUtils {

	private CompareUtils() {
		throw new IllegalStateException("Utility class");
	}

	/**
	 * 取值
	 * 
	 * @param <E> 泛型
	 * @param value 值
	 * @return Value value
	 */
	public static <E> Value<E> value(E value) {
		return new Value<E>(value);
	}
}
