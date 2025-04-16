package esercizi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SelectionSortTest {
	
	static SelectionSort ss;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ss = new SelectionSort();
	}

	@Test
	void testSortArrayFourValuesDESC() {
		int[] numArr = {7, 5, 4, 2};
		int[] numArr1 = {4, 3, 2, 1};
		assertArrayEquals(new int[] {2, 4, 5, 7}, ss.sortArray(numArr));
		assertArrayEquals(new int[] {1, 2, 3, 4}, ss.sortArray(numArr1));
	}
	
	@Test
	void testSortArrayFourValuesASC() {
		int[] numArr = {1, 2, 3, 4};
		int[] numArr1 = {10, 11, 12, 13};
		assertArrayEquals(new int[] {1, 2, 3, 4}, ss.sortArray(numArr));
		assertArrayEquals(new int[] {10, 11, 12, 13}, ss.sortArray(numArr1));
	}
	
	@Test
	void testSortArrayFourValuesRANDOM() {
		int[] numArr = {112, 4365, 23, 2134};
		int[] numArr1 = {567, 345, 643, 112};
		assertArrayEquals(new int[] {23, 112, 2134, 4365}, ss.sortArray(numArr));
		assertArrayEquals(new int[] {112, 345, 567, 643}, ss.sortArray(numArr1));
	}
	
	@Test
	void testSortArrayFourValuesWith2IdenticalNumbers() {
		int[] numArr = {1, 5, 0, 0};
		int[] numArr1 = {4, 7, 4, 23};
		assertArrayEquals(new int[] {0, 0, 1, 5}, ss.sortArray(numArr));
		assertArrayEquals(new int[] {4, 4, 7, 23}, ss.sortArray(numArr1));
	}
	
	@Test
	void testSortArrayFourValuesWith4IdenticalNumbers() {
		int[] numArr = {0, 0, 0, 0};
		int[] numArr1 = {12, 12, 12, 12};
		assertArrayEquals(new int[] {0, 0, 0, 0}, ss.sortArray(numArr));
		assertArrayEquals(new int[] {12, 12, 12, 12}, ss.sortArray(numArr1));
	}
	
	@Test
	void testSortArrayTenValuesRANDOM() {
		int[] numArr = {7, 5, 4, 2, 3, 0, 1, 6, 8, 9};
		int[] numArr2 = {100, 80, 20, 30, 10, 40, 70, 50, 60, 90};
		assertArrayEquals(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, ss.sortArray(numArr));
		assertArrayEquals(new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}, ss.sortArray(numArr2));
	}
	
	@Test
	void testSortArrayFiveValues() {
		int[] numArr = {5, 4, 3, 2, 1};
		int[] numArr1 = {1, 2, 3, 4, 5};
		assertArrayEquals(new int[] {1, 2, 3, 4, 5}, ss.sortArray(numArr));
		assertArrayEquals(new int[] {1, 2, 3, 4, 5}, ss.sortArray(numArr1));
	}

}
