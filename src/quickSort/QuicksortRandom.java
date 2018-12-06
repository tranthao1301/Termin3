package quickSort;

import java.util.Random;

/**
 * Die Klasse implementiert das Quicksort-Verfahren, wobei das Pivot-Element an einer zufälligen Position der Liste ist
 * @author	Thu Thao Tran
 * 			Paulina Pansow
 *
 */
public class QuicksortRandom implements PivotStrategie{
	private Random random = new Random();
	
	/**
	 * Sortiert von Anfang bis Ende des Arrays
	 * @param arr	Das zu sortierende Array
	 */
	public <T extends Comparable<T>> void sortieren(T[] arr) {
    	sortieren(arr, 0, arr.length - 1);
    }

    private <T extends Comparable<T>> void sortieren(
            T[] arr, int begin, int end) {
        if (begin < end) {
            int pivotIndex = randomPartition(arr, begin, end);
            sortieren(arr, begin, pivotIndex - 1);
            sortieren(arr, pivotIndex + 1, end);
        }
    }

    /**
     * Teilt die Liste in Teilliste, linke Seite kleiner als Pivot und rechte Seite größer als Pivot
     * @param arr	Das zu teilende Array
     * @param begin	Der Anfang des Arrays
     * @param end	Das Ende des Arrays
     * @return	Das Index, bei dem sich das Pivot-Element befindet
     */
    private <T extends Comparable<T>> int partition(
            T[] arr, int begin, int end) {
        T pivot = arr[end];
        int i = begin - 1;
        for (int j = begin; j < end; j++) {
            if (arr[j].compareTo(pivot) < 0) {
            	i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, end);
        return i+1;
    }
    
    /**
     * Setzt ein zufälliges Element als Pivot und tauscht das Element mit dem Element am Ende
     * @return	Das Index, bei dem sich das Pivot-Element befindet
     */
    private <T extends Comparable<T>> int randomPartition(
            T[] arr, int begin, int end) {
        int pivot = begin + random.nextInt(end - begin);
        swap(arr, pivot, end);
        return partition(arr, begin, end);
    }

    /**
     * Tauscht zwei Elemente innerhalb des Arrays
     * @param arr	Das zu sortierende Array
     * @param a		Das zu tauschende Element
     * @param b		Das zu tauschende Element
     */
    private <T extends Comparable<T>> void swap(
            T[] arr, int a, int b) {
        if (a != b) {
            T temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }
}
