package quickSort;

public class QuicksortBegin implements PivotStrategie{
	 public <T extends Comparable<T>> void sortieren(T[] arr) {
	    	sortieren(arr, 0, arr.length - 1);
	    }

	    private <T extends Comparable<T>> void sortieren(
	            T[] arr, int begin, int end) {
	        if (begin < end) {
	            int pivotIndex = partition(arr, begin, end);
	            sortieren(arr, begin, pivotIndex - 1);
	            sortieren(arr, pivotIndex + 1, end);
	        }
	    }

	    private <T extends Comparable<T>> int partition(
	            T[] arr, int begin, int end) {
	        T pivot = arr[begin];
	        int i = end + 1;
	        for (int j = end; j > begin; j--) {
	            if (arr[j].compareTo(pivot) >= 0) {
	            	i--;
	                swap(arr, i, j);
	            }
	        }
	        swap(arr, begin, i-1);
	        return i-1;
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
