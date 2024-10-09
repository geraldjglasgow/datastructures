package com.gglasgow.datastructures.binarytree;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;

    public BinaryTree() {
        root = null;
    }
    
    public void insert(T data) {
        root = insert(root, data, null);
    }

    private Node<T> insert(Node<T> current, T data, Node<T> parent) {
        if (current == null) {
            Node<T> newNode = new Node<>(data);
            newNode.setParent(parent);
            return newNode;
        }

        if (data.compareTo(current.getData()) < 0) {
            current.setLeft(insert(current.getLeft(), data, current));
        } else if (data.compareTo(current.getData()) > 0) {
            current.setRight(insert(current.getRight(), data, current));
        }
        return current;
    }

    public void printInOrder() {
        inOrder(root);
    }

    private void inOrder(Node<T> node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.print(node.getData() + " ");
            inOrder(node.getRight());
        }
    }

    private void preOrder(Node<T> node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            inOrder(node.getLeft());
            inOrder(node.getRight());
        }
    }
    private void postOrder(Node<T> node) {
        if (node != null) {
            inOrder(node.getLeft());
            inOrder(node.getRight());
            System.out.print(node.getData() + " ");
        }
    }
}
