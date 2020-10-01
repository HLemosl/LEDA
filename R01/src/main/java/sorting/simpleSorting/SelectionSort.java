package sorting.simpleSorting;

import sorting.AbstractSorting;
import util.Util;

/**
 * The selection sort algorithm chooses the smallest element from the array and
 * puts it in the first position. Then chooses the second smallest element and
 * stores it in the second position, and so on until the array is sorted.
 * 
 * Not Stable: Because depending on the exchanges, it doesn't keep the relative
 * order of the equal values.
 * 
 * In-Place: Because the sorting is done by rearranging the elements in the
 * array itself, instead of using array or other auxiliary structures.
 * 
 * Selection Sort is O(n^2).
 * 
 * Although they are of the same complexity class, Selection Sort, in practice,
 * is slower than Insertion Sort. Selection Sort is not considered an efficient
 * algorithm for large inputs.
 */
public class SelectionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		for (int i = leftIndex; i <= rightIndex; i++) {
			int lowestIndex = i;
			for (int j = i + 1; j <= rightIndex; j++) {
				if (array[j].compareTo(array[lowestIndex]) < 0) {
					lowestIndex = j;
				}
			}
			Util.swap(array, i, lowestIndex);
		}
	}
}
