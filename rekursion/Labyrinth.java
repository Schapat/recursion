package esa_rekursion;

/**
 * @author Patrick Scharnow
 * @version 1.00
 */


public class Labyrinth
{
    private char[][] lab;
    private boolean[][] visitedPositions;
    private int borderValue;


    public Labyrinth(char[][] inputLab) {
        this.lab = inputLab;
        this.borderValue = inputLab[0].length;
        this.visitedPositions = new boolean[borderValue][borderValue];
    }

    private boolean isBorder(int x, int y) {
        return x == 0 || y == 0 || x == borderValue - 1 || y == borderValue - 1;
    }

    private boolean isOutsideBorder(int x, int y) {
        return x < 0 || y < 0 || x >= borderValue || y >= borderValue;
    }

    private boolean cellIsEmpty(int x, int y) {
        return lab[x][y] == ' ';
    }

    private boolean cellIsFull(int x, int y) {
        return lab[x][y] == 'X';
    }

    private void markAsVisited(int x, int y) {
        if (lab[x][y] == ' ') lab[x][y] = '*';
    }

    private boolean isVisited(int x, int y) {
        return lab[x][y] == '*';
    }

    private void setVisited(int x, int y) {
        visitedPositions[x][y] = true;
    }

    private boolean alreadyBeenHere(int x, int y) {
        return visitedPositions[x][y] == true;
    }

    public boolean existPath(int x, int y) {


        if (isOutsideBorder(x, y)) return false;

        if (cellIsFull(x, y)) return false;

        if (isBorder(x, y) && cellIsEmpty(x, y) && !alreadyBeenHere(x, y)) {
            setVisited(x, y);
            markAsVisited(x, y);
            return true;
        } else {
            setVisited(x, y);
            markAsVisited(x, y);
            if (!alreadyBeenHere(x,y-1) && existPath(x,y-1)) {
                return true;
            } else if (!alreadyBeenHere(x,y+1) && existPath(x,y+1)) {
                return true;
            } else if (!alreadyBeenHere(x-1,y) && existPath(x-1,y)) {
                return true;
            } else if (!alreadyBeenHere(x+1,y) && existPath(x+1,y)) {
                return true;
            } else {
                return false;
            }
        }
    }


    public void printLabyrinth() {
        for (char[] row : lab) {
            for (char element : row) {
                System.out.print(element);
            }
            System.out.println();
        }
    }


}
