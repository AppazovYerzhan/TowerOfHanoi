package com.example.java;

public class Main {

    public static void main(String[] args) {
        towerOfHanoiMove(3, 'A', 'C', 'B');
    }
    public static void towerOfHanoiMove(int numberOfDisks, char from, char to, char temp) {
        if (numberOfDisks == 0) {
            return;
        }
            towerOfHanoiMove(numberOfDisks-1, from, temp, to);
            System.out.println("Moving disc " + numberOfDisks + " from " + from + " to " + to);
            towerOfHanoiMove(numberOfDisks-1, temp, to, from);
    }
}
