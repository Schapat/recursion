package esa_rekursion;

import java.util.Arrays;

/**
 * @author Patrick Scharnow
*/
public class Testklasse
{
    public static void main(String args[]) {

        System.out.println("True: Es gibt einen Ausgang.");
        System.out.println("False: Kein Ausgang.");
        System.out.println();


        char [][] Lab = {  
        		{'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', ' ', 'X', ' ', 'X', 'X', ' ', 'X', 'X', 'X'},
                {'X', ' ', ' ', ' ', 'X', ' ', ' ', 'X', 'X', 'X'},
                {'X', ' ', ' ', 'X', ' ', ' ', 'X', 'X', ' ', 'X'},                                {'X', 'X', 'X', 'X', ' ', 'X', ' ', 'X', ' ', 'X'},
                {'X', ' ', ' ', 'X', ' ', 'X', ' ', ' ', ' ', 'X'},
                {'X', 'X', 'X', ' ', ' ', 'X', ' ', 'X', ' ', 'X'},
                {'X', ' ', ' ', ' ', 'X', 'X', ' ', 'X', ' ', 'X'},
                {' ', ' ', ' ', 'X', 'X', 'X', ' ', 'X', ' ', 'X'},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'}};

        char [][] Lab2 = {
        		 {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                 {'X', ' ', 'X', ' ', 'X', 'X', ' ', 'X', ' ', 'X'},
                 {'X', ' ', ' ', ' ', 'X', ' ', ' ', ' ', ' ', 'X'},
                 {'X', ' ', ' ', 'X', 'X', ' ', 'X', 'X', ' ', 'X'},
                 {'X', ' ', 'X', 'X', ' ', ' ', ' ', 'X', ' ', 'X'},
                 {'X', ' ', ' ', 'X', 'X', 'X', ' ', ' ', ' ', 'X'},
                 {'X', 'X', 'X', ' ', 'X', 'X', ' ', 'X', ' ', 'X'},
                 {'X', ' ', ' ', ' ', ' ', 'X', ' ', 'X', ' ', 'X'},
                 {'X', ' ', ' ', 'X', 'X', 'X', ' ', 'X', ' ', 'X'},
                 {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'}};


        Labyrinth runner = new Labyrinth(Lab);
        System.out.println(runner.existPath(4,4));
        printMatrix(Lab);

        Labyrinth runner2 = new Labyrinth(Lab2);
        System.out.println(runner2.existPath(4,4));
        printMatrix(Lab2);

    }
    public static void printMatrix (char [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
