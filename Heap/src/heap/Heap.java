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
    public T obtener() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void flotar(int indice) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void hundir(int indice) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getIndicePadre(int indice) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getHijoIzquierdo(int indice) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
