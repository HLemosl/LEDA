package sorting.simpleSorting;

import sorting.AbstractSorting;
import util.Util;

/**
 * As the insertion sort algorithm iterates over the array, it makes the
 * assumption that the visited positions are already sorted in ascending order,
 * which means it only needs to find the right position for the current element
 * and insert it there.
 * 
 * Stable: Because it keeps the relative order of the values equal.
 * This is because exchanges are always made with neighbors.
 * 
 * In-Place: Because the sorting is done by rearranging the elements in the
 * array itself, instead of using arrays or other auxiliary structures.
 * 
 * Insertion Sort is O(n^2). In the best case, this algorithm is O(n).
 * This occurs when the array is already ordered. It is important to note that,
 * It is not considered an efficient algorithm for large inputs.
 * 
 * In theory, Insertion Sort, Selection Sort and Bubble Sort are in the same
 * complexity class, which is O(n^2). In practice, Insertion Sort has the best
 * performance among these 3 algorithms. 
 * 
 */
public class InsertionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		for (int i = leftIndex; i <= rightIndex; i++) {
			int index = i;
			while (index > leftIndex && array[index].compareTo(array[index-1]) < 0) {
				Util.swap(array, index, index-1);
				index--;
			}
		}
	}
}
