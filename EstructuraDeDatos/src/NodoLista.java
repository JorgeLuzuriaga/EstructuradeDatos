public class NodoLista extends Nodo {
    //atributos
    private NodoLista siguiente;

    //constructor
    public NodoLista(Object valor) {
        super(valor);
        this.siguiente = null;
    }

    //getters y setters
    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }
}
