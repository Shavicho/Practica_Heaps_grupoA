## Estructura de Datos y Algoritmos
#### PRACTICA No. 3
# HEAPS

#### Integrantes:
- Coronado Peña, Javier
- Nina Suyo, Diego Claudio

---
---
#### EJERCICIO 5: Construya una cola de prioridad que utilice un heap como estructura de datos. Para esto realice lo siguiente:

- [x] Implemente el TAD Heap genérico que este almacenado sobre un ArrayList con las operaciones de inserción y eliminación. Este TAD debe de ser un heap maximo.

- [x] Implemente la clase PriorityQueueHeap generica que utilice como estructura de datos el heap desarrollado en el punto anterior. Esta clase debe tener las operaciones de una cola tales como:

    - [x] a. Enqueue (x, p) : inserta un elemento a la cola ‘x’ de prioridad ‘p’ a la cola. Como la cola esta sobre un heap, este deberá ser insertado en el heap-max y reubicado de acuerdo a su prioridad.
    - [x] b. Dequeue() : elimina el elemento de la mayor prioridad y lo devuelve. Nuevamente como la cola está sobre un heap-max, el elemento que debe ser eliminado es la raíz, por tanto, deberá sustituir este elemento por algún otro de modo que se cumpla las propiedades del heap-max.
    - [x] c. Front() : solo devuelve el elemento de mayor priorioridad.
    - [x] d. Back(): sólo devuelve el elemento de menor prioridad.
