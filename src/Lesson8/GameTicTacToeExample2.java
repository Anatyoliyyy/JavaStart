package Lesson8;

//Реализовать консольную программу "Крестики-нолики 3x3".
////Играют 2 игрока, поочередно вводят свои хода в виде координат.
////Программа предоставляет отображение доски в консоли, возможность ввода и проверку победителя.

import java.util.Scanner;

public class GameTicTacToeExample2 {
    private static char[][] field;
    private static char emptyField = '_';
    private static Scanner scanner;
    private static String winner = "";
    private static String gamer1 = "Gamer #1";
    private static String gamer2 = "Gamer #2";

    public static void main(String[] args) {
        init();
        int count = 0;
        do {
            if (count % 2 == 0) {
                move('X');
            } else {
                move('O');
            }
            count++;

        } while (winner.equals(""));
        System.out.println();
        System.out.println(winner + " win!");
        printField();
        scanner.close();
    }

    private static void move(char symbol) {
        printField();
        readMove(symbol);
        checkStatus();
    }

    private static void checkStatus() {
        checkLines();
        checkRows();
        checkDiagonals();
    }

    private static void checkDiagonals() {
        boolean RightDown = field[0][2] == field[1][1] && field[1][1] == field[2][0];
        boolean LeftDown = field[0][0] == field[1][1] && field[1][1] == field[2][2];
        if (field[1][1]!=emptyField && (LeftDown || RightDown) ) whoIsWinner(field[1][1]);
    }

    private static void checkLines() {
        for (int line = 0; line < 3; line++) {
            if (field[0][line] == field[1][line] && field[0][line] == field[2][0] && field[0][line]!=emptyField) {
                whoIsWinner(field[0][line]);
            }
        }
    }

    private static void checkRows() {
        for (int row = 0; row < 3; row++) {
            if (field[row][0] == field[row][1] && field[row][0] == field[row][2] && field[row][0]!=emptyField) {
                whoIsWinner(field[row][0]);
            }
        }
    }

    private static void whoIsWinner(char cell) {
        if (cell == 'X') winner = gamer1;
        if (cell == 'O') winner = gamer2;
    }

    private static void printField() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void init() {
        scanner = new Scanner(System.in);
        field = new char[][]{
                {emptyField, emptyField, emptyField},
                {emptyField, emptyField, emptyField},
                {emptyField, emptyField, emptyField}
        };
    }

    private static void readMove(char ch) {
        String gamer = ch == 'X' ? gamer1 : gamer2;
        boolean flag;
        int x;
        int y;
        do {
            flag=true;
            System.out.println();
            System.out.print(gamer + " input coordinates (1..3 1..3): ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
            if ((x < 0 || x > 2) || (y < 0 || y > 2) || field[x][y] != '_') {
                System.out.println("wrong coordinates input, please input another coordinates (1..3 1..3): ");
                flag = false;
            }
        } while (!flag);
        field[x][y] = ch;
    }

}

//Result:
//_ _ _
//_ _ _
//_ _ _
//
//Gamer #1 input coordinates (1..3 1..3): 1 1
//X _ _
//_ _ _
//_ _ _
//
//Gamer #2 input coordinates (1..3 1..3): 1 2
//X O _
//_ _ _
//_ _ _
//
//Gamer #1 input coordinates (1..3 1..3): 2 2
//X O _
//_ X _
//_ _ _
//
//Gamer #2 input coordinates (1..3 1..3): 3 3
//X O _
//_ X _
//_ _ O
//
//Gamer #1 input coordinates (1..3 1..3): 3 1
//X O _
//_ X _
//X _ O
//
//Gamer #2 input coordinates (1..3 1..3): 2 3
//X O _
//_ X O
//X _ O
//
//Gamer #1 input coordinates (1..3 1..3): 2 1
//
//Gamer #1 win!
//X O _
//X X O
//X _ O
//
//Process finished with exit code 0


//_ _ _
//_ _ _
//_ _ _
//
//Gamer #1 input coordinates (1..3 1..3):  1 1
//X _ _
//_ _ _
//_ _ _
//
//Gamer #2 input coordinates (1..3 1..3): 2 2
//X _ _
//_ O _
//_ _ _
//
//Gamer #1 input coordinates (1..3 1..3): 3 3
//X _ _
//_ O _
//_ _ X
//
//Gamer #2 input coordinates (1..3 1..3): 3 1
//X _ _
//_ O _
//O _ X
//
//Gamer #1 input coordinates (1..3 1..3): 2 3
//X _ _
//_ O X
//O _ X
//
//Gamer #2 input coordinates (1..3 1..3): 2 1
//X _ _
//O O X
//O _ X
//
//Gamer #1 input coordinates (1..3 1..3): 3 1
//wrong coordinates input, please input another coordinates (1..3 1..3):
//
//Gamer #1 input coordinates (1..3 1..3): 3 1
//wrong coordinates input, please input another coordinates (1..3 1..3):
//
//Gamer #1 input coordinates (1..3 1..3): 1 3
//X _ X
//O O X
//O _ X
//
//Gamer #2 input coordinates (1..3 1..3): 3 2
//X _ X
//O O X
//O O X
//
//Gamer #1 input coordinates (1..3 1..3): 1 2
//
//Gamer #1 win!
//X X X
//O O X
//O O X
//
//Process finished with exit code 0