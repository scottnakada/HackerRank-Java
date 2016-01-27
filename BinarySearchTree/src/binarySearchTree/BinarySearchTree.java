package binarySearchTree;

public class BinarySearchTree {

	public static void main(String[] args) throws Exception {
		EmptyBST<Integer> emptyBST = new EmptyBST<Integer>();
		NonEmptyBST<Integer> nonEmptyBST = new NonEmptyBST<Integer>(5);
		
		Testers.checkIsEmpty(emptyBST);
		Testers.checkIsEmpty(nonEmptyBST);
	}

}
