package com.kvvssut.dsalgomonk.tree.basics;

import java.util.LinkedList;
import java.util.Queue;

import com.kvvssut.dsalgomonk.utils.BinaryTree;

public class InsertElementInBinaryTree {

	public static void main(String[] args) {
		final BinaryTree root = new BinaryTree(1);
		final BinaryTree l1 = new BinaryTree(2);
		final BinaryTree r1 = new BinaryTree(3);
		final BinaryTree ll2 = new BinaryTree(4);
		final BinaryTree rl2 = new BinaryTree(6);
		final BinaryTree rr2 = new BinaryTree(7);

		root.setLeft(l1);
		root.setRight(r1);
		l1.setLeft(ll2);
		r1.setLeft(rl2);
		r1.setRight(rr2);

		final BinaryTree lr2 = new BinaryTree(5);

		insertElement(root, lr2);

		printLevelorderTraversal(root);

	}

	private static void insertElement(BinaryTree root, BinaryTree node) {
		if (root != null) {
			final Queue<BinaryTree> queue = new LinkedList<>();

			BinaryTree currentNode = root;
			queue.add(currentNode);

			while (!queue.isEmpty()) {
				currentNode = queue.remove();

				if (currentNode.getLeft() == null) {
					currentNode.setLeft(node);
					break;
				} else {
					queue.add(currentNode.getLeft());
				}

				if (currentNode.getRight() == null) {
					currentNode.setRight(node);
					break;
				} else {
					queue.add(currentNode.getRight());
				}
			}
		}
	}

	private static void printLevelorderTraversal(BinaryTree root) {
		if (root != null) {
			final Queue<BinaryTree> queue = new LinkedList<>();

			BinaryTree currentNode = root;
			queue.add(currentNode);

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

}
