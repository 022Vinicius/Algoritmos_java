public class ArvoreBinariaBusca {
    Node root;

    // Inserção
    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value)
            root.left = insert(root.left, value);
        else if (value > root.value)
            root.right = insert(root.right, value);
        return root;
    }

    // Busca binária
    public Node search(int value) {
        return search(root, value);
    }

    private Node search(Node root, int value) {
        if (root == null || root.value == value)
            return root;
        if (value < root.value)
            return search(root.left, value);
        return search(root.right, value);
    }

    // Remoção
    public void remove(int value) {
        root = remove(root, value);
    }

    private Node remove(Node root, int value) {
        if (root == null)
            return null;
        if (value < root.value)
            root.left = remove(root.left, value);
        else if (value > root.value)
            root.right = remove(root.right, value);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.value = minValue(root.right);
            root.right = remove(root.right, root.value);
        }
        return root;
    }

    // Encontrar o menor valor
    private int minValue(Node root) {
        int minV = root.value;
        while (root.left != null) {
            minV = root.left.value;
            root = root.left;
        }
        return minV;
    }

    // Travessia em ordem
    public void inOrder() {
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.value + " ");
            inOrder(root.right);
        }
    }

    // Travessia em pós-ordem
    public void postOrder() {
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.value + " ");
        }
    }

    // Travessia em pré-ordem
    public void preOrder() {
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}
