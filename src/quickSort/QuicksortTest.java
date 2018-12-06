package quickSort;

import org.junit.Test;
import static org.junit.Assert.*;

public class QuicksortTest {

	/**
	 * Teste das Quicksort-Verfahren mit dem Pivot am Anfang der Liste mit einer randomisierten Liste
	 */
	@Test
	public void testequickSortBeginRandom() {
		QuicksortBegin qs = new QuicksortBegin();
		Integer[] array = { 0, 9, 4, 6, 2, 8, 5, 1, 7, 3 };
		Integer[] erg = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		qs.sortieren(array);
		assertArrayEquals(erg, array);
	}
	
	/**
	 * Teste das Quicksort-Verfahren mit dem Pivot am Anfang der Liste mit einer sortierten Liste (kleinster Schl�ssel zuerst)
	 */
	@Test
	public void testequickSortBeginIncrease() {
		QuicksortBegin qs = new QuicksortBegin();
		Integer[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Integer[] erg = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		qs.sortieren(array);
		assertArrayEquals(erg, array);
	}

	/**
	 * Teste das Quicksort-Verfahren mit dem Pivot am Anfang der Liste mit einer sortierten Liste (gr��ter Schl�ssel zuerst)
	 */
	@Test
	public void testequickSortBeginDecrease() {
		QuicksortBegin qs = new QuicksortBegin();
		Integer[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		Integer[] erg = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		qs.sortieren(array);
		assertArrayEquals(erg, array);
	}

	/**
	 * Teste das Quicksort-Verfahren mit dem Pivot am Ende der Liste mit einer randomisierten Liste 
	 */
	@Test
	public void testequickSortEndRandom() {
		QuicksortEnd qs = new QuicksortEnd();
		Integer[] array = { 0, 9, 4, 6, 2, 8, 5, 1, 7, 3 };
		Integer[] erg = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		qs.sortieren(array);
		assertArrayEquals(erg, array);
	}

	/**
	 * Teste das Quicksort-Verfahren mit dem Pivot am Ende der Liste mit einer sortierten Liste (kleinster Schl�ssel zuerst)
	 */
	@Test
	public void testequickSortEndIncrease() {
		QuicksortEnd qs = new QuicksortEnd();
		Integer[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Integer[] erg = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		qs.sortieren(array);
		assertArrayEquals(erg, array);
	}
	
	/**
	 * Teste das Quicksort-Verfahren mit dem Pivot am Ende der Liste mit einer sortierten Liste (gr��ter Schl�ssel zuerst)
	 */
	@Test
	public void testequickSortEndDecrease() {
		QuicksortEnd qs = new QuicksortEnd();
		Integer[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		Integer[] erg = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		qs.sortieren(array);
		assertArrayEquals(erg, array);
	}
	/**
	 * Teste das Quicksort-Verfahren mit dem Pivot an einer zuf�lligen Position der Liste mit einer randomisierten Liste 
	 */
	@Test
	public void testequickSortRandomRandom() {
		QuicksortRandom qs = new QuicksortRandom();
		Integer[] array = { 0, 9, 4, 6, 2, 8, 5, 1, 7, 3 };
		Integer[] erg = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		qs.sortieren(array);
		assertArrayEquals(erg, array);
	}
	
	/**
	 * Teste das Quicksort-Verfahren mit dem Pivot an einer zuf�lligen Position der Liste mit einer sortierten Liste (kleinster Schl�ssel zuerst) 
	 */
	@Test
	public void testequickSortRandomIncrease() {
		QuicksortEnd qs = new QuicksortEnd();
		Integer[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Integer[] erg = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		qs.sortieren(array);
		assertArrayEquals(erg, array);
	}

	/**
	 * Teste das Quicksort-Verfahren mit dem Pivot an einer zuf�lligen Position der Liste mit einer sortierten Liste (kleinster Schl�ssel zuerst) 
	 */
	@Test
	public void testequickSortRandomDecrease() {
		QuicksortEnd qs = new QuicksortEnd();
		Integer[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		Integer[] erg = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		qs.sortieren(array);
		assertArrayEquals(erg, array);
	}
	
}