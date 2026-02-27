public class ControllerBinary<E> {
        private BinaryTree<E> BinaryTree;

        public ControllerBinary(E datoBinario) {
            this.BinaryTree = new BinaryTree(datoBinario);
        }

        // Métodos para el Árbol Binario
        public void insertarEnBinario(E padre, E valor) {
            BinaryTree.insertar(padre,valor);
        }

        public NodeBinary<E> buscarEnBinario(NodeBinary<E> actual, E valor) {
            return BinaryTree.buscar(actual, valor);
        }

        public void mostrarBinarioPreOrden() {
            BinaryTree.preOrden();
        }
        public boolean updatearBinario(E datoViejo, E datoNuevo){
            return BinaryTree.update(datoViejo, datoNuevo);
        }
        public boolean delete(E dato){
            if(!BinaryTree.delete(dato)){
                System.out.println("no existe ese nodo");
            }
            return BinaryTree.delete(dato);

        }

//


}
