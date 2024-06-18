public class NodoDoble extends Nodo {
    //atributos
    private NodoDoble anterior;
    private NodoDoble siguiente;

    //constructor
    public NodoDoble(Object valor) {
        super(valor);
        this.anterior = null;
        this.siguiente = null;
    }

    //getters y setters
    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }
}
