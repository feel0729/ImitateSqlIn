package imitateSqlIn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Value 通用值
 * 
 * @author feel0729
 * 
 * @param <E> 泛型
 */
public class Value<E> {

	// 值
	private E v;

	// 建構子
	public Value(E e) {
		v = e;
	}

	/**
	 * 模仿SQL語言的 in
	 * 
	 * @param elements 陣列元素
	 * @return 比較結果
	 */
	@SafeVarargs
	public final boolean in(E... elements) {
		// 先比較型態再比較v是否與任一陣列元素相符
		return v == null ? tempSet(elements).contains(null)
				: elements.getClass().getComponentType().equals(v.getClass()) && tempSet(elements).contains(v);
	}
	
	/**
	 * 模仿SQL語言的 not in
	 * 
	 * @param elements 陣列元素
	 * @return 比較結果
	 */
	@SafeVarargs
	public final boolean notIn(E... elements) {
		// 把in的比較結果反向
		return !in(elements);
	}

	/**
	 * 將陣列元素裝進Set
	 * 
	 * @param elements 陣列元素
	 * @return 資料集
	 */
	@SafeVarargs
	private final Set<E> tempSet(E... elements) {

		Set<E> set = new HashSet<>();

		Arrays.stream(elements).forEach(set::add); // method references

//		Arrays.stream(elements).forEach(e -> set.add(e)); // lambda

		return set;
	}
}