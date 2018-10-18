package it.sevenbits.workshop;

import it.sevenbits.workshop.MyQueue.DoubleEndedQueue;
import it.sevenbits.workshop.matrix.Matrix;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        Matrix matrix1 = new Matrix(Integer.parseInt(args[2]), Integer.parseInt(args[3]));
        Matrix matrix2 = new Matrix(Integer.parseInt(args[4]), Integer.parseInt(args[5]));
        System.out.println(matrix.toString());
        System.out.println(matrix1.toString());
        System.out.println(matrix2.toString());
        DoubleEndedQueue doubleEndedQueue = new DoubleEndedQueue();
        doubleEndedQueue.addFirst(matrix);
        doubleEndedQueue.addLast(matrix1);
        System.out.println("first:\n" + doubleEndedQueue.getFirst().toString());
        System.out.println("last:\n" + doubleEndedQueue.getLast().toString());
        System.out.println("queue from head to tail:\n" + doubleEndedQueue.toString());

    }
}
