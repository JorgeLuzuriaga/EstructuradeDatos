public class NodoArbol extends Nodo {
    //atributos
    private NodoArbol izquierdo;
    private NodoArbol derecho;

    //constructor
    public NodoArbol(Object valor) {
        super(valor);
        this.izquierdo = null;
        this.derecho = null;
    }

    //getters y setters
    public NodoArbol getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoArbol izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoArbol getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoArbol derecho) {
        this.derecho = derecho;
    }
}
