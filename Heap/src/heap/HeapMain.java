package heap;

public class HeapMain {

    public static void main(String[] args) throws Exception{
        PriorityQueueHeap<String> colaPrioridad = new PriorityQueueHeap<>();
        colaPrioridad.enqueue("Descripcion 5", 5);
        colaPrioridad.enqueue("Descripcion 2", 2);
        colaPrioridad.enqueue("Descripcion 4", 4);
        colaPrioridad.enqueue("Descripcion 12", 12);
        colaPrioridad.enqueue("Descripcion 6", 6);
        colaPrioridad.enqueue("Descripcion 3", 3);
        colaPrioridad.enqueue("Descripcion 8",8 );
        colaPrioridad.enqueue("Descripcion 9", 9);
        colaPrioridad.enqueue("Descripcion 10", 10);
        colaPrioridad.enqueue("Descripcion 7", 7);
        
        System.out.println("|--Imprimiendo el Heap--|");
        System.out.println(colaPrioridad);
        System.out.println("|--Elemento de mayor prioridad--|");
        System.out.println(colaPrioridad.front()); 
        System.out.println("|--Elemento de menor prioridad--|");
        System.out.println(colaPrioridad.back());
        System.out.println("|--Eliminando el elemento de mayor priridad--|");
        System.out.println(colaPrioridad.dequeue());
        System.out.println("|--Mostrando el nuevo elemento de mayor prioridad--|");
        System.out.println(colaPrioridad.front());
        System.out.println("|--Mostrando el nuevo Heap modificado--|");
        System.out.println(colaPrioridad);
        
        colaPrioridad.enqueue("Descripcion 1", 1);
        System.out.println("|--Agregando un nuevo elemento de menor prioridad y lo mostramos--|");
        System.out.println(colaPrioridad.back());
    }
}
