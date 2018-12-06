package quickSort;

/**
 * Die Klasse implementiert das in-situ Quicksort-Verfahren mit einem Integer-Array
 * @author	Thu Thao Tran
 * 			Paulina Pansow
 *
 */
public class Quicksort {
	
	/**
	 * Sortiert von Anfang bis Ende des Arrays
	 * @param arr	Das zu sortierende Array
	 */
	public void sortieren(int[] arr) {
    	sortieren(arr, 0, arr.length - 1);
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
     * Teilt die Liste in Teilliste, linke Seite kleiner als Pivot und rechte Seite gr��er als Pivot
     * @param arr	Das zu teilende Array
     * @param begin	Der Anfang des Arrays
     * @param end	Das Ende des Arrays
     * @return	Das Index, bei dem sich das Pivot-Element befindet
     */
//    private int partition(int[] arr, int begin, int end) {
//        int pivot = arr[end];
//        int i = begin - 1;
//        for (int j = begin; j < end; j++) {
//            if (arr[j] <= pivot) {
//            	i++;
//                swap(arr, i, j);
//            }
//        }
//        swap(arr, i+1, end);
//        return i+1;
//    }
    
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
//	public void sortieren(int[] liste)
//	{
//	int untereGrenze = 0;
//
//	  int obereGrenze = liste.length-1;
//
//	  sortieren(liste, untereGrenze,obereGrenze);
//
//	}
//
//
//
//	private static void sortieren(int[] liste, 
//
//	                              int untereGrenze, 
//
//	                              int obereGrenze) {
//
//	  int links = untereGrenze;
//
//	  int rechts = obereGrenze;
//
//	  int pivot = liste[((untereGrenze + obereGrenze) / 2)];
//
//	  do {
//
//	    while (liste[links] < pivot) {
//
//	      links++;
//
//	    }
//
//	    while (pivot < liste[rechts]) {
//
//	      rechts--;
//
//	    }
//
//	    if (links <= rechts) {
//
//	      int tmp = liste[links];
//
//	      liste[links] = liste[rechts];
//
//	      liste[rechts] = tmp;
//
//	      links++;
//
//	      rechts--;
//
//	    }
//
//	  } while (links <= rechts);
//
//	  if (untereGrenze < rechts) {
//
//		  sortieren(liste, untereGrenze, rechts);
//
//	  }
//
//	  if (links < obereGrenze) {
//
//	     sortieren(liste, links, obereGrenze);
//
//	  }
//	  }
}
