import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GeneralTree<E> {
    private NodeGeneral<E> raiz;

    public GeneralTree(E datoRaiz){
        raiz = new NodeGeneral<>(datoRaiz);
    }
    public NodeGeneral<E> getRaiz(){
        return raiz;
    }

    //INSERTAR
    public void insertar(E padre, E nuevoDato){
        NodeGeneral<E> nodoPadre = buscar(raiz, padre);
        if(nodoPadre!=null){
            nodoPadre.agregarHijo(new NodeGeneral<>(nuevoDato));
        }
        else {
            System.out.println("padre no encontrado");
        }
    }

    //busqueda recursiva
    private NodeGeneral<E> buscar(NodeGeneral<E> actual, E dato){
        if(actual == null){
            return null;
        }
        if(actual.getDato().equals(dato)){
            return actual;
        }

            for(NodeGeneral<E> hijos: actual.getListaNodos()){
            NodeGeneral<E> resultadp = buscar(hijos, dato);
            if(resultadp!=null){
                return resultadp;
            }
        }
        return null;
    }

    //recorrido dfs
    public void dfsRe(NodeGeneral<E> actual){
        if(actual==null){
            return;
        }
        System.out.println(actual.getDato());
        for (NodeGeneral<E> hijo : actual.getListaNodos()){
           dfsRe(hijo);
        }
    }

    //recorrido bfs
    public void bfsRe(NodeGeneral<E> actual){
        if(actual == null) return;
        Queue<NodeGeneral<E>> cola = new LinkedList<>();
        cola.add(actual);

        while(!cola.isEmpty()){
           NodeGeneral<E> sacaste= cola.poll();
            System.out.println(sacaste.getDato());
            for(NodeGeneral<E> hijos : sacaste.getListaNodos()){
                cola.add(hijos);
            }
        }
    }

    //yo probando la forma iterativa, le cambio el sentido porq si no saldria al revez
    public void dfsW(NodeGeneral<E> actual){
        Stack<NodeGeneral<E>> pila = new Stack<>();
        pila.push(actual);

        while(!pila.isEmpty()){
            NodeGeneral<E> sacado = pila.pop();
            System.out.println(sacado.getDato());

            Collections.reverse(sacado.getListaNodos());
            for(NodeGeneral<E> hijos : sacado.getListaNodos()){
                pila.push(hijos);
            }
        }
    }

}
