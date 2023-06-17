package heap;

public class HeapMain {

    public static void main(String[] args) throws Exception{
        PriorityQueueHeap<String> colaPrioridad = new PriorityQueueHeap<>();
        colaPrioridad.enqueue("Descripcion 4", 4);
        colaPrioridad.enqueue("Descripcion 1", 1);
        colaPrioridad.enqueue("Descripcion 3", 3);
        colaPrioridad.enqueue("Descripcion 12", 12);
        colaPrioridad.enqueue("Descripcion 5", 5);
        colaPrioridad.enqueue("Descripcion 2", 2);
        colaPrioridad.enqueue("Descripcion 7", 7);
        colaPrioridad.enqueue("Descripcion 9", 9);
        colaPrioridad.enqueue("Descripcion 10", 10);
        colaPrioridad.enqueue("Descripcion 6", 6);
        
        System.out.println(colaPrioridad.back());
        System.out.println(colaPrioridad);
        System.out.println(colaPrioridad.front()); 
        System.out.println(colaPrioridad.dequeue());
        System.out.println(colaPrioridad.front());
        System.out.println(colaPrioridad);
        System.out.println(colaPrioridad.back());
    }
}
