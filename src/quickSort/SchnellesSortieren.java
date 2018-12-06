package quickSort;

/**
 * Die Klasse modelliert ein Suchverfahren für eine spezielle Aufgabenstellung
 * @author 	Thu Thao Tran
 * 			Paulina Pansow
 *
 */
public class SchnellesSortieren {
	
	/**
	 * Sortiert von Anfang bis Ende des Arrays
	 * @param arr	Das zu sortierende Array
	 */
	public void sortieren(int[]arr)
	{
		sortieren(arr,0,arr.length-1);
	}
	
	private void sortieren(int[] arr, int links, int rechts) {
		 int i = links, j = rechts;
	        // Get the pivot element from the middle of the list
	        int pivot = arr[links + (rechts - links) / 2];

	        // Divide the given elements into two parts
	        while (i <= j) {
	            while (arr[i] < pivot) {
	                i++;
	            }
	            while (arr[j] > pivot) {
	                j--;
	            }

	            if (i <= j) {
	                swap(arr, i, j);
	                i++;
	                j--;
	            }
	        }
	        // Recursion
	        if (links < j)
	            sortieren(arr, links, j);
	        if (i < rechts)
	            sortieren(arr, i, rechts);
		}
	

	/**
     * Tauscht zwei Elemente innerhalb des Arrays
     * @param arr	Das zu sortierende Array
     * @param a		Das zu tauschende Element
     * @param b		Das zu tauschende Element
     */
	private void swap(int[] arr, int a, int b) {
		if (a != b) {
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
	}
}
