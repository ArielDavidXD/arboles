import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GeneralTree<E> {
    private Node<E> raiz;

    public GeneralTree(E datoRaiz){
        raiz = new Node<>(datoRaiz);
    }
    public Node<E> getRaiz(){
        return raiz;
    }

    //INSERTAR
    public void insertar(E padre, E nuevoDato){
        Node<E> nodoPadre = buscar(raiz, padre);
        if(nodoPadre!=null){
            nodoPadre.agregarHijo(new Node<>(nuevoDato));
        }
        else {
            System.out.println("padre no encontrado");
        }
    }

    //busqueda recursiva
    private Node<E> buscar(Node<E> actual, E dato){
        if(actual == null){
            return null;
        }
        if(actual.getDato().equals(dato)){
            return actual;
        }

            for(Node<E> hijos: actual.getListaNodos()){
            Node<E> resultadp = buscar(hijos, dato);
            if(resultadp!=null){
                return resultadp;
            }
        }
        return null;
    }

    //recorrido dfs
    public void dfsRe(Node<E> actual){
        if(actual==null){
            return;
        }
        System.out.println(actual.getDato());
        for (Node<E> hijo : actual.getListaNodos()){
           dfsRe(hijo);
        }
    }

    //recorrido bfs
    public void bfsRe(Node<E> actual){
        Queue<Node<E>> cola = new LinkedList<>();
        cola.add(actual);

        while(!cola.isEmpty()){
           Node<E> sacaste= cola.poll();
            System.out.println(sacaste.getDato());
            for(Node<E> hijos : sacaste.getListaNodos()){
                cola.add(hijos);
            }
        }
    }

    //yo probando la forma iterativa, le cambio el sentido porq si no saldria al revez
    public void dfsW(Node<E> actual){
        Stack<Node<E>> pila = new Stack<>();
        pila.push(actual);

        while(!pila.isEmpty()){
            Node<E> sacado = pila.pop();
            System.out.println(sacado.getDato());

            Collections.reverse(sacado.getListaNodos());
            for(Node<E> hijos : sacado.getListaNodos()){
                pila.push(hijos);
            }
        }
    }

}
