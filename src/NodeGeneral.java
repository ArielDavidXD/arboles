import java.util.ArrayList;
import java.util.List;

public class NodeGeneral<E> {
   private E dato;
   private List<NodeGeneral<E>> listaNodos;


    public NodeGeneral(E dato){
        this.dato = dato;
        this.listaNodos = new ArrayList<>();
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public List<NodeGeneral<E>> getListaNodos() {
        return listaNodos;
    }

    public void setListaNodos(List<NodeGeneral<E>> listaNodos) {
        this.listaNodos = listaNodos;
    }
    public void agregarHijo(NodeGeneral<E> hijo) {
        listaNodos.add(hijo);
    }
}
