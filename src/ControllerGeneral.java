public class ControllerGeneral<E> {
    private GeneralTree<E> GeneralTree;

    public ControllerGeneral(E datoRaiz) {
        this.GeneralTree = new GeneralTree<>(datoRaiz);
    }

    public void insertarEnGeneral(E padre ,E valor) {
        GeneralTree.insertar(padre, valor);
    }

    public NodeGeneral<E> buscarEnGeneral(NodeGeneral<E> actual, E valor) {
        return GeneralTree.get(valor);
    }


}
