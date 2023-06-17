package heap;

public interface HeapInterface<T> {

    void insertar(T data);

    T eliminarMaximo() throws Exception;

    T obtenerMaximo() throws Exception;

    T obtenerMinimo() throws Exception;

    boolean isEmpty();
}
