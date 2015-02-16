//Kyle Pittman 12/18/2014.
package com.pitstop.school.lab.eight.four;

public class FlipDemo {
    public static void main(String[] args) {
        TicTacToe board1 = new TicTacToe();
        board1.set(0,0,"x");
        board1.set(2,1,"o");
        board1.set(1,0,"o");
        board1.set(0,1,"x");
        board1.set(1,2,"x");
        board1.set(2,2,"o");
        System.out.println(board1.toString());
        board1.horizontalFlip();
        System.out.println(board1.toString());
        board1.horizontalFlip();
        board1.verticalFlip();
        System.out.println(board1.toString());
    }
}
