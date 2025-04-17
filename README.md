# Algorithm

## SelectionSort

L'obiettivo di questo esercizio è replicare l'algoritmo della funzione **sort**.

Creare la classe `SelectionSort` con relativo JUnit di test `SelectionSortTest`.

### Input

L'algoritmo riceve in input un array non ordinato di **n** elementi di tipo **int**.

```java
class SelectionSort {
    int[] arr = {7, 5, 4, 2};
}
```

### Algoritmo

- Iterativamente scansiona ogni elemeto dell'array in input.
- Inizia ad analizzare dall'elemento successivo.
- Se l'elemento in analisi è minore di quello corrente, sostituisci il valore di quello corrente con quello minore e viceversa.

### Output

Il metodo `sortArray(int[])` ritorna un array con gli elementi ordinati.
> **int[ ]** : Il metodo ritorna un array di interi ordinati in modo ascendente.
