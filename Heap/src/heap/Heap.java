package heap;

import java.util.*;

public class Heap<T extends Comparable<T>> implements HeapInterface<T> {

    private ArrayList<T> heap;

    public Heap() {
        heap = new ArrayList<T>();
    }

    @Override
    public void insertar(T elemento) {
        this.heap.add(elemento);
        flotar(this.heap.size() - 1); //Este metodo debe flotar el elemento
    }

    @Override
    public T eliminarMaximo() throws Exception {
        if (this.heap.isEmpty()) {
            throw new Exception("El heap esta vacio");
        }
        T maximo = this.heap.get(0);
        T ultimoElemento = this.heap.remove(this.heap.size() - 1);

        if (!this.heap.isEmpty()) {
            this.heap.set(0, ultimoElemento);
            hundir(0); // debe undir el elemento 
        }
        return maximo;
    }

    @Override
    public T obtenerMaximo() throws Exception {
        if (this.heap.isEmpty()) {
            throw new Exception("El heap esta vacio");
        }
        return this.heap.get(0);
    }
    
    @Override
    public T obtenerMinimo() throws Exception {
        if (this.heap.isEmpty()) {
            throw new Exception("El heap esta vacio");
        }
        return this.heap.get(this.heap.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return this.heap.isEmpty();
    }

    private void flotar(int indice) {
        T elemento = this.heap.get(indice);
        int indicePadre = getIndicePadre(indice);//devolver el indice padre

        while (indice > 0 && elemento.compareTo(this.heap.get(indicePadre)) > 0) {
            this.heap.set(indice, this.heap.get(indicePadre));
            indice = indicePadre;
            indicePadre = getIndicePadre(indice);//devolver el indice padre
        }
        this.heap.set(indice, elemento);
    }

    private void hundir(int indice) {
        T elemento = this.heap.get(indice);
        int indiceHijoIzquierdo = getIndiceHijoIzquierdo(indice);//devolver el indice de hijo izquierdp

        while (indiceHijoIzquierdo < this.heap.size()) {
            if (indiceHijoIzquierdo + 1 < this.heap.size() && this.heap.get(indiceHijoIzquierdo + 1).compareTo(this.heap.get(indiceHijoIzquierdo)) > 0) {
                indiceHijoIzquierdo++;
            }

            if (elemento.compareTo(this.heap.get(indiceHijoIzquierdo)) >= 0) {
                break;
            }

            this.heap.set(indice, this.heap.get(indiceHijoIzquierdo));
            indice = indiceHijoIzquierdo;
            indiceHijoIzquierdo = getIndiceHijoIzquierdo(indice);//devolver el indice de hijo izquierdp
        }

        this.heap.set(indice, elemento);
    }

    private int getIndicePadre(int indice) {
        return (indice - 1) / 2;
    }

    private int getIndiceHijoIzquierdo(int indice) {
        return 2 * indice + 1;
    }

}
