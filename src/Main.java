public class Main {
    public static void main(String[] args) {
        Tree bst = new Tree();
        bst.root = new Node(60);
        bst.root.left = new Node(55);
        bst.root.right = new Node(100);
        bst.root.left.left = new Node(45);
        bst.root.left.right = new Node(57);
        bst.root.right.left = new Node(67);
        bst.root.right.right = new Node(107);
        bst.root.right.right.left = new Node(101);
        bst.root.right.right.right = new Node(109);

        System.out.println(search(101, bst.root));
    }

    public static boolean search(int element, Node root) {
        Node current = root;

        while (current != null) {
            if (element < current.element) {
                current = current.left;
            } else if (element > current.element) {
                current = current.right;
            } else return true;
        }
        return false;
    }
}
