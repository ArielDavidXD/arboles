public class Main {
        public static void main(String[] args) {


            ControllerBinary cont = new ControllerBinary<>("A");

            cont.insertarEnBinario("A", "B");
            cont.insertarEnBinario("A", "C");
            cont.insertarEnBinario("A", "D");
            cont.insertarEnBinario("B", "P");

            //no existe ese padre
            cont.insertarEnBinario("J", "L");

            //updatear nodo
            cont.updatearBinario("B", "F");
            //deletear nodo
            cont.delete("H");
            cont.mostrarBinarioPreOrden();

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