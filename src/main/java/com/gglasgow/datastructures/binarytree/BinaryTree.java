package com.gglasgow.datastructures.binarytree;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;

    public BinaryTree() {
        root = null;
    }
    
    public void insert(T data) {
        if (root == null) {
            root = new Node<>(data);
        } else {
            insert(root, data, null);
        }
    }
    
    private void insert(Node<T> current, T data, Node<T> parent) {
        if (current == null) {
            Node<T> newNode = new Node<>(data);
            newNode.setParent(parent);
            if (data.compareTo(parent.getData()) < 0) {
                parent.setLeft(newNode);
            } else {
                parent.setRight(newNode);
            }
            return;
        }
    
        int comparison = data.compareTo(current.getData());
        if (comparison < 0) {
            insert(current.getLeft(), data, current);
        } else if (comparison > 0) {
            insert(current.getRight(), data, current);
        } else {
            System.out.println("Duplicate value '" + data + "' not inserted.");
        }
    }
    

    public void printInOrder() {
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node<T> node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.print(node.getData() + " ");
            inOrder(node.getRight());
        }
    }

    public void printPreOrder() {
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node<T> node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    public void printPostOrder() {
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node<T> node) {
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.print(node.getData() + " ");
        }
    }

    public boolean search(T data) {
        return search(root, data);
    }

    private boolean search(Node<T> node, T data) {
        if (node == null) {
            return false;
        }

        int comparison = data.compareTo(node.getData());
        if (comparison == 0) {
            return true;
        } else if (comparison < 0) {
            return search(node.getLeft(), data);
        } else {
            return search(node.getRight(), data);
        }
    }
}
