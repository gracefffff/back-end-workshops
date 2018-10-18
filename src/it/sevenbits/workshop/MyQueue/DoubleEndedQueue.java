package it.sevenbits.workshop.MyQueue;

import it.sevenbits.workshop.matrix.Matrix;

public class DoubleEndedQueue {
    private Node head;
    private Node tail;

    public DoubleEndedQueue() {
        head = new Node(null, null, null);
        tail = new Node(null, head, null);
        head.setPrevios(tail);
    }

    public void addLast(Matrix matrix) {
        Node last = tail;
        last.setData(matrix);
        tail = new Node(null, last, null);
        last.setPrevios(tail);
        if (head.getPrevios() == tail) head.setPrevios(last);
    }

    public void addFirst(Matrix matrix) {
        Node first = head;
        first.setData(matrix);
        head = new Node(null, null, first);
        first.setNext(head);
        if (tail.getNext() == head) tail.setNext(first);
    }

    public Matrix getLast() {
        return tail.getNext().getData();
    }

    public Matrix getFirst() {
        return head.getPrevios().getData();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node node = head.getPrevios();
        while (node.getData() != null) {
            sb.append(node.getData().toString()).append("\n");
            node = node.getPrevios();
        }
        return sb.toString();
    }
}