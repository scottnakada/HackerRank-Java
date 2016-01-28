package binarySearchTree;

public class Testers {

	public static void checkIsEmpty(Tree tree) throws Exception {
		/* If the tree tree is an instance of EmptyBST --> tree.isEmpty -> true */
		/* If the tree tree is an instance of NonEmptyBST --> tree.isEmpty -> false */
		System.out.println("Got here");
		if (tree instanceof EmptyBST) {
			System.out.println("Instance of Empty");
			if (!tree.isEmpty()) {
				throw new Exception("All is not good, the tree is an EmptyBST and it is non-empty");
			}
		} else if (tree instanceof NonEmptyBST) {
			System.out.println("Instance of NonEmpty");
			if (tree.isEmpty()) {
				throw new Exception("All is not good, the tree is an NonEmptyBST and it is empty");
			}
		}
	}
	
}
