package com.gglasgow.datastructures.binarytree;

public class Node<T extends Comparable<T>> {
    private Node<T> right;
    private Node<T> left;
    private Node<T> parent;
    private T data;

    public Node(Node<T> right, Node<T> left, Node<T> parent, T data) {
        this.left = left;
        this.right = right;
        this.parent = parent;
        this.data = data;
    }

    public Node(T data) {
        this.data = data;
        this.right = null;
        this.left = null;
        this.parent = null;
    }
    
    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
