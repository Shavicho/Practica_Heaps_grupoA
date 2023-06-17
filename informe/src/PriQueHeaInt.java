package heap;

public interface PriQueHeaInt<T> {

    void enqueue(T elemento, int prioridad);

    T dequeue() throws Exception;

    T front() throws Exception;

    T back() throws Exception;
}
