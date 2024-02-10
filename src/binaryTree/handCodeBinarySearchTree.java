package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class handCodeBinarySearchTree
{
	private node root;
	private List<pairing> pairs;
	private int size;

	public handCodeBinarySearchTree()
	{
		root = null;
		pairs = new ArrayList<>();
	}

	public void insert(int key)
	{
		root = insertRec(root, key);
	}

	public node getRoot()
	{
		return root;
	}

	public int getSize()
	{
		return size;
	}

	public void setRoot(node root)
	{
		this.root = root;
	}

	public node insertRec(node root, int data)
	{

		if (root == null)
		{
			root = new node(data);
			return root;
		}

		if (data < root.getData())
		{
			root.setLeft(insertRec(root.getLeft(), data));
		}
		else if (data > root.getData())
		{
			root.setRight(insertRec(root.getRight(), data));
		}
		this.size++;
		return root;
	}

	public void printPairsWithGivenSum(int target)
	{
		pairChecker(this.root, this.root, target);
		this.pairs = pairingUtil.removeDublicatePairs(this.pairs);
		pairingUtil.pairPrinter(this.pairs);
		if (pairs.size() == 0)
		{
			System.out.println("No such nodes are not found whose sum equals the target = " + target + " !");
			return;
		}
	}

	public boolean pairChecker(node root, node temp, int target)
	{
		if (temp == null)
		{
			return false;
		}
		return searchAll(root, temp, target - temp.getData()) || pairChecker(root, temp.getLeft(), target)
				|| pairChecker(root, temp.getRight(), target);
	}

	public boolean searchAll(node root, node temp, int target)
	{
		if (root == null)
		{
			return false;
		}

		node node = root;
		boolean flag = false;
		while (node != null)
		{
			if (node.getData() == target && temp != node)
			{
				pairs.add(pairing.of(node, temp));
				break;
			}
			else if (target < node.getData())
			{
				node = node.getLeft();
			}
			else
			{
				node = node.getRight();
			}
		}
		pairs.forEach(pairing::toString);
		return flag;
	}

	@Deprecated
	public boolean searchOne(node root, node temp, int k)
	{
		if (root == null)
		{
			return false;
		}

		node c = root;
		boolean flag = false;
		while (c != null && flag != true)
		{
			if (c.getData() == k && temp != c)
			{
				flag = true;
				System.out.println("Sum = " + (c.getData() + temp.getData()));
				System.out.println("Pair is (" + c.getData() + "," + temp.getData() + ") ");
				return true;
			}
			else if (k < c.getData())
			{
				c = c.getLeft();
			}
			else
			{
				c = c.getRight();
			}
		}
		return false;
	}
}