package heap;

public class Elemento<T extends Comparable<T>> implements Comparable<Elemento<T>> {

    private int prioridad;
    private T elemento;

    public Elemento(T elemento, int prioridad) {
        this.elemento = elemento;
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    @Override
    public int compareTo(Elemento<T> t) {
        return Integer.compare(this.prioridad, t.getPrioridad());
    }

    @Override
    public String toString() {
        //return "Elemento{" + "prioridad=" + prioridad + ", elemento=" + elemento + '}';
        return "prioridad=" + prioridad;
    }
}
