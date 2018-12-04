package quickSort;

import java.util.Random;

public class QuicksortRandom implements PivotStrategie{
	private Random random = new Random();
	
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
    
    private <T extends Comparable<T>> int randomPartition(
            T[] arr, int begin, int end) {
        int pivot = begin + random.nextInt(end - begin);
        swap(arr, pivot, end);
        return partition(arr, begin, end);
    }

    private <T extends Comparable<T>> void swap(
            T[] arr, int a, int b) {
        if (a != b) {
            T temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }
}
