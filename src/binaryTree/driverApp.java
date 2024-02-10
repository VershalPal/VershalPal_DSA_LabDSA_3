package binaryTree;

public class driverApp
{
	public static void main(String[] args)
	{
		handCodeBinarySearchTree tree = new handCodeBinarySearchTree();
		tree.insert(10);
		tree.insert(20);
		tree.insert(30);
		tree.insert(40);
		tree.insert(50);
		tree.insert(60);
		tree.insert(70);
		
		int target = 130;

		tree.printPairsWithGivenSum(target);
	}
}