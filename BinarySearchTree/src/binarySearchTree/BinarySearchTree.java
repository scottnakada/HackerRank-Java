package binarySearchTree;

public class BinarySearchTree {

	public static void main(String[] args) throws Exception {
		EmptyBST<Integer> emptyBST = new EmptyBST<Integer>();
		NonEmptyBST<Integer> nonEmptyBST = new NonEmptyBST<Integer>(5);

		Testers.checkIsEmpty(emptyBST);
		Testers.checkIsEmpty(nonEmptyBST);

		Testers.checkAddMemberCardinality(emptyBST, 5);
		Testers.checkAddMemberCardinality(nonEmptyBST, 5);
		Testers.checkAddMemberCardinality(nonEmptyBST, 6);

		int tests = 1000;
		for (int i = 0; i < tests; i++) {
			Tree t;
			if (i % 10 == 0) {
				t = Testers.rndTree(0);
			} else {
				t = Testers.rndTree(10);
			}
			Testers.checkAddMemberCardinality(t, i);
		}
	}

}
