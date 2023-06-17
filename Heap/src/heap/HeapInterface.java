package heap;

public interface HeapInterface<T> {
    void insertar(T data);
    T eliminarMaximo() throws Exception;
    T obtener();
    void flotar(int indice);
    void hundir(int indice);
    int getIndicePadre(int indice);
    int getHijoIzquierdo(int indice);
}
