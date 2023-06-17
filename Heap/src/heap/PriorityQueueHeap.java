package heap;

public class PriorityQueueHeap<T extends Comparable<T>> implements PriQueHeaInt<T> {

    private Heap<Elemento<T>> heap;

    public PriorityQueueHeap() {
        this.heap = new Heap<Elemento<T>>();
    }

    @Override
    public void enqueue(T elemento, int prioridad) {
        this.heap.insertar(new Elemento<>(elemento, prioridad));
    }

    @Override
    public T dequeue() throws Exception {
        return this.heap.eliminarMaximo().getElemento();
    }

    @Override
    public T front() throws Exception {
        return this.heap.obtenerMaximo().getElemento();
    }

    @Override
    public T back() throws Exception {
        return this.heap.obtenerMinimo().getElemento();
    }

}
