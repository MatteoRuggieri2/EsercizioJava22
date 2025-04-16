package esercizi;

/* Questo algoritmo deve riordinare gli elementi int di questo array. */

public class SelectionSort {
	
	private int[] numArr = {7, 5, 4, 2};

	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();
		ss.run();
	}
	
	private void run() {

		System.out.println("Array originale: ");
		for (int number : numArr) {
			System.out.println(number);
		}
		
		System.out.println("\nArray ordinato: ");
		for (int number : this.sortArray(numArr)) {
			System.out.println(number);
		}
	}
	
	/* Questa funzione ha il compito di mettere in ordine i numeri interi all'interno di un array.
	 * Ritorna come valore l'array sortato. */
	public int[] sortArray(int[] arrayToSort) {
		
		int minValue;
		int minValuePosition = 0;
		
		for (int i = 0; i < arrayToSort.length; i++) {
			
			int markedElement = arrayToSort[i];
			minValue = markedElement;
			minValuePosition = i;
			
			// Prendo il valore minore con cui scambiarlo, partendo dalla posizione del numero analizzato
			for (int j = i; j < arrayToSort.length; j++) {
				
				int currentElement = arrayToSort[j];
				if (currentElement < minValue) {
					minValue = currentElement;
					minValuePosition = j;
				}

			}
		
			// Effettuo lo scambio di posizione tra il valore analizzato e quello minore
			arrayToSort[minValuePosition] = markedElement;
			arrayToSort[i] = minValue;
		}
		
		return arrayToSort;
	}

}
