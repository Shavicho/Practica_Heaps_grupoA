package heap;

public interface PriQueHeaInt<T> {

    void enqueue(T elemento, int prioridad);

    T dequeue();

    T front();

    T back() throws Exception;
}
