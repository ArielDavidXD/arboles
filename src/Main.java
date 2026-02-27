public class Main {
        public static void main(String[] args) {
            GeneralTree ge = new GeneralTree<>("A");
            GeneralTree he = new GeneralTree<>("");

            BinaryTree bi =new BinaryTree<>("A");

            bi.insertar("A", "B");
            bi.insertar("A", "C");
            bi.insertar("A", "D");
            bi.insertar("B", "P");

            //no existe ese padre
            bi.insertar("J", "L");

            //updatear nodo
            bi.update("B", "F");
            //deletear nodo
            bi.delete("F");
            bi.preOrden();

            System.out.println("----------------------");
            ge.insertar("A", "B");
            ge.insertar("A", "C");
            ge.insertar("B", "D");
            ge.insertar("B", "E");
            ge.insertar("C", "F");

            ge.dfsRe(ge.getRaiz());
            System.out.println("----------------------------");
            ge.bfsRe(ge.getRaiz());
            System.out.println("-------------------");
            ge.dfsW(ge.getRaiz());


            he.dfsW(he.getRaiz());
        }

}