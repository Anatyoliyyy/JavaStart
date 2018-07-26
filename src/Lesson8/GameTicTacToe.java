package Lesson8;

//Реализовать консольную программу "Крестики-нолики 3x3".
//Играют 2 игрока, поочередно вводят свои хода в виде координат.
//Программа предоставляет отображение доски в консоли, возможность ввода и проверку победителя.

import java.util.Scanner;

public class GameTicTacToe {
    public static void main(String[] args) {
        boolean gameOver = false;
        String winner = "";
        Scanner scanner = new Scanner(System.in);
        char[][] gameField = new char[][]{{' ', ' ', ' ',},
                {' ', ' ', ' ',},
                {' ', ' ', ' '}};
        int pleyer = 0;
        while (!gameOver) {
            System.out.println("Enter coordinates x,y from 1 to 3");
            gameField = input(scanner, gameField, pleyer);
            printField(gameField);
            winner = winOrDraw(gameField);
            if (!winner.isEmpty()) {
                gameOver = true;
            }
            pleyer++;
        }
        if (gameOver) {
            System.out.println(winner);
        }
    }

    public static char[][] input(Scanner scanner, char[][] field, int player) {
        boolean incorectInput = true;
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        while (incorectInput) {
            if (x <= 0 || x > field.length || y <= 0 || y > field.length || field[y - 1][x - 1] != ' ') {
                System.out.println("Error. Enter correct values");
                x = scanner.nextInt();
                y = scanner.nextInt();
            } else {
                incorectInput = false;
            }
        }
        if (player % 2 == 0) {
            field[y - 1][x - 1] = 'x';
        } else {
            field[y - 1][x - 1] = 'o';
        }
        return field;
    }

    public static void printField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j] + " ");
                if (j != field.length - 1) {
                    System.out.print(" | ");
                }

            }
            System.out.println();
            if (i != field.length - 1) {
                System.out.println("--------");
            }

        }
    }

    public static String winOrDraw(char[][] field) {
        String winOrDraw = " ";
        int sameElem;
        for (int i = 0; i < field.length; i++) {
            sameElem = 0;
            for (int j = 0; j < field.length; j++) {
                if (field[i][0] != ' ' && field[i][0] == field[i][j]) {
                    sameElem++;
                }
                if (sameElem == 3) {
                    winOrDraw = "Winner " + "\"" + field[i][0] + "\"";
                }
            }

        }
        for (int i = 0; i < field.length; i++) {
            sameElem = 0;
            for (int j = 0; j < field.length; j++) {
                if (field[0][i] != ' ' && field[0][i] == field[j][i]) {
                    sameElem++;
                }
                if (sameElem == 3) {
                    winOrDraw = "Winner " + "\"" + field[0][i] + "\"";
                }
            }
        }
        if (field[0][0] != ' ' && field[0][0] == field[1][1] && field[0][0] == field[2][2]) {
            winOrDraw = "Winner " + "\"" + field[0][0] + "\"";
        }
        if (field[2][0] != ' ' && field[2][0] == field[1][1] && field[2][0] == field[0][2]) {
            winOrDraw = "Winner " + "\"" + field[2][0] + "\"";
        }
        if (fieldAll(field)) {
            winOrDraw = "Draw";
        }
        return winOrDraw;
    }

    public static boolean fieldAll(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == ' ') {
                    return false;
                }

            }

        }
        return true;
    }
}


//Enter coordinates x,y from 1 to 3
//3 3
//   |    |
//--------
//   |    |
//--------
//   |    | x
//
//
//Process finished with exit code 0
