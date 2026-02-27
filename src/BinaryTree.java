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

    public boolean update(E datoViejo, E datoNuevo) {
        NodeBinary<E> nodo = buscar(raiz, datoViejo);
        if (nodo != null) {
            nodo.setDato(datoNuevo);
            return true;
        }
        return false;
    }

    public boolean delete(E dato) {
        if (raiz == null)
            return false;

        // Caso especial: eliminar la raíz
        if (raiz.getDato().equals(dato)) {
            raiz = null;
            return true;
        }

        return eliminarRecursivo(raiz, dato);
    }

    private boolean eliminarRecursivo(NodeBinary<E> actual, E dato) {
        if (actual == null)
            return false;

        // Revisar hijo izquierdo
        if (actual.getNodoIzquierdo() != null && actual.getNodoIzquierdo().getDato().equals(dato)) {
            actual.setNodoIzquierdo(null);
            return true;
        }

        // Revisar hijo derecho
        if (actual.getNodoDerecho() != null && actual.getNodoDerecho().getDato().equals(dato)) {
            actual.setNodoDerecho(null);
            return true;
        }

        // Seguir buscando recursivamente
        return eliminarRecursivo(actual.getNodoIzquierdo(), dato) || eliminarRecursivo(actual.getNodoDerecho(), dato);
    }
    public NodeBinary<E> get(E dato) {
        return buscar(raiz, dato);
    }

    public void preOrden() {
        preOrdenRecursivo(raiz);
        System.out.println(); // salto de línea al final
    }

    private void preOrdenRecursivo(NodeBinary<E> nodo) {
        if (nodo == null)
            return;

        // 1. Visitar el nodo actual
        System.out.print(nodo.getDato() + " ");

        // 2. Recorrer hijo izquierdo
        preOrdenRecursivo(nodo.getNodoIzquierdo());

        // 3. Recorrer hijo derecho
        preOrdenRecursivo(nodo.getNodoDerecho());
    }



}