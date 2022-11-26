public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);

        // traverse the tree (in-order)
        System.out.println("In-order traversal");
        tree.traverseInOrder();

        System.out.print("\n");

        // Reversed in-order traversal
        System.out.println("Reversed in-order traversal");
        tree.traverseInOrderDescending();

        System.out.print("\n");

        // System.out.println(tree.getRoot());

        // Print out max and min value in tree
        System.out.print("Max value: ");
        System.out.println(tree.getMax(tree.getRoot()));
        System.out.print("Min value: ");
        System.out.println(tree.getMin(tree.getRoot()));

        // search a node by value
        // System.out.println(tree.get(1000));
    }
}