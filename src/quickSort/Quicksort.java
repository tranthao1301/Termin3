package quickSort;

public class Quicksort {
	public void sortieren(int[] arr) {
    	sortieren(arr, 0, arr.length - 1);
    }

    private void sortieren(int[] arr, int links, int rechts) {
        if (links < rechts) {
            int pivot = partition(arr, links, rechts);
            sortieren(arr, links, pivot - 1);
            sortieren(arr, pivot + 1, rechts);
        }
    }

    private int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = begin - 1;
        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
            	i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, end);
        return i+1;
    }

    private void swap(int[] arr, int a, int b) {
        if (a != b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }
}
