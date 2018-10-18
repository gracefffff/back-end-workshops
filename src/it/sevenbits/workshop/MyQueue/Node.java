package it.sevenbits.workshop.MyQueue;

import it.sevenbits.workshop.matrix.Matrix;

public class Node {
    private Node next;
    private Node previos;
    private Matrix data;

    Node(Matrix data, Node next, Node previos) {
        this.data = data;
        this.next = next;
        this.previos = previos;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevios() {
        return previos;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrevios(Node previos) {
        this.previos = previos;
    }

    public void setData(Matrix data) {
        this.data = data;
    }

    public Matrix getData() {
        return data;
    }
}
