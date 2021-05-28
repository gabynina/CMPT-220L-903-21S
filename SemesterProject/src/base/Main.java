package base;

public class Main {

    public static void main(String[] args) {
	BST GN = new BST();
	Node tree = null;

	tree = GN.insert(tree,1);
	tree = GN.insert(tree,8);
	tree = GN.insert(tree, 5);
	tree = GN.insert(tree,2);
	tree = GN.insert(tree,6);
	tree = GN.insert(tree,4);
	tree = GN.insert(tree, 3);
	tree = GN.insert(tree, 9);
	tree = GN.insert(tree, 10);
	tree = GN. insert(tree, 7);
	tree = GN.insert(tree, 90);
	tree = GN.delete(tree,90);

	System.out.println("Order Traversal");
	GN.order(tree);
	System.out.println();
	System.out.println();

	System.out.println("Pre order Traversal");
	GN.preorder(tree);
	System.out.println();
	System.out.println();

	System.out.println("Post order Traversal");
	GN.postorder(tree);
	System.out.println();
	System.out.println();

	System.out.print("Breadth first search");
	System.out.println();
	GN.BFS(tree);
	System.out.println();



	System.out.println();
	System.out.println("does the value 3 exist? " + GN.finder(tree, 3));

	System.out.println();
	System.out.println("The height of the tree: " +GN.height(tree));
	System.out.println();

	System.out.println("Nth largest element: " + GN.nLargest(tree, 2));
	System.out.println();

	System.out.println("Smallest Element: " + GN.min(tree));
	System.out.println("Largest Element: " + GN.max(tree));
    }
}
