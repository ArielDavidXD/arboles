public class NodeBinary<E> {
    private E dato;
    private NodeBinary<E> nodoIzquierdo;
    private NodeBinary<E> nodoDerecho;

    public NodeBinary(E dato) {
        this.dato = dato;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public NodeBinary<E> getNodoIzquierdo() {
        return nodoIzquierdo;
    }

    public void setNodoIzquierdo(NodeBinary<E> nodoIzquierdo) {
        this.nodoIzquierdo = nodoIzquierdo;
    }

    public NodeBinary<E> getNodoDerecho() {
        return nodoDerecho;
    }

    public void setNodoDerecho(NodeBinary<E> nodoDerecho) {
        this.nodoDerecho = nodoDerecho;
    }
}
