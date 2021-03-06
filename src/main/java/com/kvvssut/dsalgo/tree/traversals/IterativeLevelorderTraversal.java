package com.kvvssut.dsalgo.tree.traversals;

import java.util.LinkedList;
import java.util.Queue;

import com.kvvssut.dsalgo.utils.BinaryTree;

public class IterativeLevelorderTraversal {

	public static void main(String[] args) {
		final BinaryTree root = new BinaryTree(1);
		final BinaryTree l1 = new BinaryTree(2);
		final BinaryTree r1 = new BinaryTree(3);
		final BinaryTree ll2 = new BinaryTree(4);
		final BinaryTree lr2 = new BinaryTree(5);
		final BinaryTree rl2 = new BinaryTree(6);
		final BinaryTree rr2 = new BinaryTree(7);

		root.setLeft(l1);
		root.setRight(r1);
		l1.setLeft(ll2);
		l1.setRight(lr2);
		r1.setLeft(rl2);
		r1.setRight(rr2);

		levelorderTraversal(root);
	}

	// https://www.geeksforgeeks.org/level-order-tree-traversal/
	private static void levelorderTraversal(BinaryTree root) {
		final Queue<BinaryTree> queue = new LinkedList<>();

		BinaryTree currentNode = root;
		if (currentNode != null) {
			queue.add(currentNode);
		}

		while (!queue.isEmpty()) {
			currentNode = queue.remove();
			System.out.println(currentNode.getData());

			if (currentNode.getLeft() != null) {
				queue.add(currentNode.getLeft());
			}
			if (currentNode.getRight() != null) {
				queue.add(currentNode.getRight());
			}
		}
	}

}
