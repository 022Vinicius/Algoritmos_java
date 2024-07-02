public class Main {
    public static void main(String[] args) {
        ArvoreBinariaBusca tree = new ArvoreBinariaBusca();

        // Inserir valores na árvore
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(99);
        tree.insert(35);
        tree.insert(45);

        // Mostrar a árvore em pré-ordem
        System.out.print("Pre-Order: ");
        tree.preOrder();

        // Mostrar a árvore em ordem
        System.out.print("In-Order: ");
        tree.inOrder();

        // Mostrar a árvore em pós-ordem
        System.out.print("Post-Order: ");
        tree.postOrder();
    }
}
