public class BinaryTree<E> {

    private NodeBinary<E> raiz;

    public BinaryTree(E datoRaiz){
        raiz = new NodeBinary<>(datoRaiz);
    }

    public void insertar(E padre, E nuevoDato){
        NodeBinary<E> nodoPadre = buscar(raiz, padre);

        if(nodoPadre != null){

            if(nodoPadre.getNodoIzquierdo() == null){
                nodoPadre.setNodoIzquierdo(new NodeBinary<>(nuevoDato));
            }
            else if(nodoPadre.getNodoDerecho() == null){
                nodoPadre.setNodoDerecho(new NodeBinary<>(nuevoDato));
            }
            else{
                System.out.println("El nodo: "+nodoPadre.getDato() +" Ya tiene 2 hijos");
            }

        } else {
            System.out.println("Padre no encontrado");
        }
    }

    private NodeBinary<E> buscar(NodeBinary<E> actual, E dato){
        if(actual == null) return null;

        if(actual.getDato().equals(dato)) return actual;

        NodeBinary<E> izq = buscar(actual.getNodoIzquierdo(), dato);
        if(izq != null) return izq;

        return buscar(actual.getNodoDerecho(), dato);
    }
}