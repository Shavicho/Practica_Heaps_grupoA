package heap;
import java.util.*;

public class Heap<T extends Comparable<T>> implements HeapInterface<T>{
    private ArrayList<T> heap;
    
    public Heap() {
        heap = new ArrayList<T>();
    }

    @Override
    public void insertar(T elemento) {
        heap.add(elemento);
        flotar(heap.size() - 1); //Este metodo debe flotar el elemento
    }

    @Override
    public T eliminarMaximo() throws Exception {
        if (heap.isEmpty()) {
            throw new Exception("El heap esta vacio");
        }
        T maximo = heap.get(0);
        T ultimoElemento = heap.remove(heap.size() - 1);
        
        if (!heap.isEmpty()) {
            heap.set(0, ultimoElemento);
            hundir(0); // debe undir el elemento 
        }
        return maximo;
    }

    @Override
    public T obtenerMaximo()  throws Exception {
        if (heap.isEmpty()) {
            throw new Exception("El heap esta vacio");
        }
        return heap.get(0);
    }
    
    @Override
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    private void flotar(int indice) {
        T elemento = heap.get(indice);
        int indicePadre = getIndicePadre(indice);//devolver el indice padre

        while (indice > 0 && elemento.compareTo(heap.get(indicePadre)) > 0) {
            heap.set(indice, heap.get(indicePadre));
            indice = indicePadre;
            indicePadre = getIndicePadre(indice);//devolver el indice padre
        }
        heap.set(indice, elemento);
    }

    private void hundir(int indice) {
        T elemento = heap.get(indice);
        int indiceHijoIzquierdo = getIndiceHijoIzquierdo(indice);//devolver el indice de hijo izquierdp

        while (indiceHijoIzquierdo < heap.size()) {
            if (indiceHijoIzquierdo + 1 < heap.size() && heap.get(indiceHijoIzquierdo + 1).compareTo(heap.get(indiceHijoIzquierdo)) > 0) {
                indiceHijoIzquierdo++;
            }

            if (elemento.compareTo(heap.get(indiceHijoIzquierdo)) >= 0) {
                break;
            }

            heap.set(indice, heap.get(indiceHijoIzquierdo));
            indice = indiceHijoIzquierdo;
            indiceHijoIzquierdo = getIndiceHijoIzquierdo(indice);//devolver el indice de hijo izquierdp
        }

        heap.set(indice, elemento);
    }
    
    private int getIndicePadre(int indice) {
        return (indice - 1) / 2;
    }

    private int getIndiceHijoIzquierdo(int indice) {
        return 2 * indice + 1;
    }
    
    
}
