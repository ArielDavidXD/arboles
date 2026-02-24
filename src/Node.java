import java.util.ArrayList;
import java.util.List;

public class Node<E> {
    E dato;
    List<Node<E>> listaNodos;

    public Node(E dato){
        this.dato = dato;
        this.listaNodos = new ArrayList<>();
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public List<Node<E>> getListaNodos() {
        return listaNodos;
    }

    public void setListaNodos(List<Node<E>> listaNodos) {
        this.listaNodos = listaNodos;
    }
    public void agregarHijo(Node<E> hijo) {
        listaNodos.add(hijo);
    }
}
