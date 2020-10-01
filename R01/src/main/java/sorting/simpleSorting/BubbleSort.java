package sorting.simpleSorting;

import sorting.AbstractSorting;
import util.Util;

/**
 * The bubble sort algorithm iterates over the array multiple times, pushing big
 * elements to the right by swapping adjacent elements, until the array is
 * sorted.
 * 
 * Stable: Preserve the order of the same elements.
 * 
 * In-Place: Doesn't use an auxiliary memory in proportion to n.
 * 
 * Bubble Sort id O(n^2).
 * 
 * It performs more exchanges and more comparisons. According to Knuth,
 * Bubble Sort turns out to be just an interesting algorithm from a theoretical
 * point of view, even though it is possible to optimize it.
 */
public class BubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		for (int i = leftIndex; i <= rightIndex; i++) {
			boolean changed = false;
			for (int j = leftIndex; j < rightIndex; j++) {
				if (array[j].compareTo(array[j+1]) > 0) {
					Util.swap(array, j, j+1);
					changed = true;
				}
			}
			if (!changed) {
				return;
			}
		}
	}
}
