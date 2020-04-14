package bst;

public class BinarySearchTree {
	static Node insert(Node root, int data) {
		if (root == null) {
			root = new Node();
			root.data = data;
			root.left = root.right = null;
		} else if (data <= root.data)
			root.left = insert(root.left, data);
		else
			root.right = insert(root.right, data);
		return root;
	}

	private static void preOrder(Node root) {
		if (root == null)
			return;
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}

	private static void postOrder(Node root) {
		if (root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);

	}

	private static void inOrder(Node root) {
		if (root == null)
			return;
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}

	public static void main(String[] args) {
		Node root = null;
		root = insert(root, 'M');
		root = insert(root, 'B');
		root = insert(root, 'Q');
		root = insert(root, 'Z');
		root = insert(root, 'A');
		root = insert(root, 'C');

		System.out.println("preOrder: ");
		preOrder(root);
		System.out.println();

		System.out.println("inOrder: ");
		inOrder(root);
		System.out.println();

		System.out.println("postOrder: ");
		postOrder(root);
		System.out.println();

	}
}
