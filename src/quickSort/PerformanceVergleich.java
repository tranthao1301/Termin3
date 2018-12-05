package quickSort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PerformanceVergleich {
	int _key = 1;
	@Test
	void testSchnellSort() {
	long average = 0;
	SchnellesSortieren schnell = new SchnellesSortieren();
	int[] arr = erzeugeArray(_key);
	for(int k =0;k< 10;++k) {
		long time = System.nanoTime();
		schnell.sortieren(arr);
		average += (System.nanoTime() - time);
		boolean test = false;
		for(int i = 0; i < arr.length -1;++i) {
			if(arr[i]<=arr[i+1]) {
				test = true;
			}
			else {
				test = false;
				break;
			}
		}
		assertEquals(true,test);
	}
	System.out.println("Zeit SchnellSort: " + average/10);
	}
	
	@Test
	public void testeQuickSort() {
		long average = 0;
		Quicksort quick = new Quicksort();
		int[] arr = erzeugeArray(_key);
		for(int k =0;k< 10;++k) {
			long time = System.nanoTime();
			quick.sortieren(arr);
			average += (System.nanoTime() - time);
			boolean test = false;
			for(int i = 0; i < arr.length -1;++i) {
				if(arr[i]<=arr[i+1]) {
					test = true;
				}
				else {
					test = false;
					break;
				}
			}
			assertEquals(true,test);
		}
		System.out.println("Zeit QuickSort: " + average/10);
	}

	private int[] erzeugeArray(int k) {
		int[] arr = new int[(int) Math.pow(10, k)];
		int n = arr.length;
		for(int i = 0; i < n; ++i) {
			arr[i] = (int)((700 * n)+(Math.random() * ((800 * n) - (700 * n))));
		}
		return arr;
	}
}