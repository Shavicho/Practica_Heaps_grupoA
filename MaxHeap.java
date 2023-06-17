

/**

Estructura de datos y algoritmos
Integrantes:
Coronado Peña Javier
Nina Suyo Diego Claudio
https://github.com/Shavicho/Practica_Heaps_grupoA.git
 */

import java.util.ArrayList;

public class MaxHeap<T extends Comparable<T>> {
    private ArrayList<T> heap;

    public MaxHeap() {
        heap = new ArrayList<>();
    }

    public void insertar(T item) {
        heap.add(item);
        arriba(heap.size() - 1);
    }

    public T remover() {
        if (isEmpty()) {
            throw new IllegalStateException("El Heap está vacío");
        }

        T max = heap.get(0);
        T last = heap.remove(heap.size() - 1);

        if (!isEmpty()) {
            heap.set(0, last);
            abajo(0);
        }

        return max;
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    private void arriba(int a) {
        
    }

    private void abajo(int b) {
        
    }

    private void cambio(int i, int j) {
       
    }
}
