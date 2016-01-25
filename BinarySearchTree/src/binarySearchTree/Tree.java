package binarySearchTree;

/* Interface to Binary Search Tree classes */
/*  There will be one class for empty binary search trees, */
/*  and another for non-empty binary search tree */
/*  We want this to be a generic interface; but we need */
/*  to be able to do comparisons; so the type is inputType, */
/*  and the type extends Comparable */
public interface Tree<inputType extends Comparable<inputType>> {
	/* is the tree empty - true if empty, false if has data */
	public boolean isEmpty();
	/* How many members in the tree */
	public int cardinality();
	/* Is this element in the tree? */
	public boolean member (inputType element);
	/* Create a non-empty binary search tree */
	public NonEmptyBST<inputType> add(inputType element);
}
