package binarySearchTree;

public class NonEmptyBST<inputType extends Comparable<inputType>> implements Tree<inputType> {
	/* Create some instance variables */
	/* Data for the node */
	inputType data;
	/* Pointers to the left and right tree */
	Tree<inputType> left;
	Tree<inputType> right;

	/* Constructor for non-empty BST */
	public NonEmptyBST(inputType newData) {
		/* Initialize the node with the new Data */
		data = newData;
		/* Start with the left and right sub-trees as emptyBST */
		left = new EmptyBST<inputType>();
		right = new EmptyBST<inputType>();
	}
	
	/* Constructor for non-empty bst passing element, and left and right sub-trees */
	public NonEmptyBST(inputType nodeData, Tree<inputType> leftTree, Tree<inputType> rightTree) {
		/* Initialize the data to be the nodeData */
		data = nodeData;
		/* Initialize the left and right sub-trees */
		left = leftTree;
		right = rightTree;
	}

	@Override
	public boolean isEmpty() {
		/* The tree is not empty; so return false */
		return false;
	}

	@Override
	public int cardinality() {
		/* Add 1 (for this node) to the left cardinality and the right cardinality */
		return (1 + left.cardinality() + right.cardinality());
	}

	@Override
	public boolean member(inputType searchData) {
		/* Is the current node data what we are looking for? */
		if (data == searchData) {
			return true;
		} else {
			/* If the element is less than this nodes data, compare to left tree */
			if (searchData.compareTo(data) < 0) {
				/* Return the search results on the left tree */
				return left.member(searchData);
			} else {
				/* Return the search results on the right tree */
				return right.member(searchData);
			}
		}
		
	}

	@Override
	public NonEmptyBST<inputType> add(inputType newData) {
		/* Is the data already at this node? */
		if (data == newData) {
			/* Return a pointer to this node */
			return this;
		} else {
			/* If the new data is less than the data, insert it in the left sub-tree */
			if (newData.compareTo(data) < 0) {
				/* Return a non-empty BST with newData added to the left subtree */
				return new NonEmptyBST(data, left.add(newData), right);
			} else {
				/* Return a non-empty BST with newData added to the right subtree */
				return new NonEmptyBST(data, left, right.add(newData));
			}
		}
		return null;
	}

}
