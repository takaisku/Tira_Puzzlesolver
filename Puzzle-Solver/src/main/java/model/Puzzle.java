/*
 * 
 * 
 * 
 */
package model;

import java.util.Random;

/**
 * @author tkarkine
 * 
 * Model for Puzzle situation in memory as an array of integers
 * freeRow      row of the empty tile
 * freeCol      column of the empty tile
 * row          size of game area is row * column (row)
 * cubic        size of game area as integer
 * lastMove     previous move , used not to go anymore
 * cost         manhattan() + missplaced(), used with comparison in heap
 * 
 */
public class Puzzle implements Comparable<Puzzle> {
    private int[] table;
    private int freeRow;
    private int freeCol;
    private int cubic;    
    private int row;
    private int lastMove;
    private int cost;
    
    /**
     * 
     * @param side game area is created by giving it size as side
     * 
     * freeTile is placed right most bottom corner
     * creates other vice empty game area
     */
    
    public Puzzle(int side) {
        row = side;
        cubic = side * side;
        table = new int[cubic];
        freeRow = row - 1;
        freeCol = row - 1;
        lastMove = 0;       
        
    }
    
    /**
     * 
     * @param game puzzle situation can be given as an array of integer
     * 
     */
    
    public Puzzle(int[] game) {
        if (isValid(game)) {
            table = game;
            for (int i = 0; i < cubic; i++) {            
                if (table[i] == 0) {
                    freeRow = Math.floorDiv(i, row);
                    freeCol = i % row;
                }
            }
            lastMove = 0;
        }
    }   
    
    /**
     * Method to check if given puzzle is valid, 
     * no two same numbers, square by area 
     * @param table the array of given puzzle
     * @return true if valid
     */
    
    
    public final boolean isValid(int[] table) {
        row = (int) Math.sqrt(table.length);
        cubic = row * row;
        if (cubic != table.length) {
            // epäkelpo pelikoko
            System.out.println("Virheellinen puzzle, pelialue ei ole neliö!");
            return false;
        }
        boolean[] checkTable = new boolean[cubic];
        for (int i = 0; i < cubic; i++) {
            if (checkTable[table[i]]) {
                // sama numero kahdesti
                System.out.println("Virheellinen puzzle, kaksi samaa numeroa!");
                return false;
            }
            checkTable[table[i]] = true;
        }
        return true;        
    }
    
    /**
     * help method to copy a puzzle situation
     * @return copy of the given puzzle
     */
    
    public Puzzle copyPuzzle() {
        Puzzle next = new Puzzle(row);
        next.freeRow = this.freeRow;
        next.freeCol = this.freeCol;
        for (int i = 0; i < cubic; i++) {
            next.table[i] = this.table[i];
        }
        return next;
    }
    
    /**
     * Help method to get size of side of game area
     * @return size of side as int
     */
    
    public int getRow() {
        return row;
    }
    
    /**
     * 
     * @return  previous move as integer (clock table number of the direction)
     */
    
    public int getLastMove() {
        return lastMove;
    }
    
    /**
     * Method checks if moving empty tile to right is possible
     * @return true if possible
     */
    
    public boolean canMoveRight() {
        return freeCol < (row - 1) && lastMove != 9;
    }
    
    /**
     * Method checks if moving empty tile to down is possible
     * @return true if possible
     */
    
    public boolean canMoveDown() {
        return freeRow < (row - 1) && lastMove != 12;
    }
    
    /**
     * Method checks if moving empty tile to left is possible
     * @return true if possible
     */
    
    public boolean canMoveLeft() {
        return freeCol > 0 && lastMove != 3;
    }
    
    /**
     * Method checks if moving empty tile to up is possible
     * @return true if possible
     */
    
    public boolean canMoveUp() {
        return freeRow > 0 && lastMove != 6;
    }
    
    /**
     * 
     * @return new situation (Puzzle) where empty tile is moved left from this.puzzle
     * 
     */
    public  Puzzle moveLeft() {
        Puzzle left = copyPuzzle();
        left.table[freeRow * row + freeCol] = this.table[freeRow * row + freeCol - 1];
        left.table[freeRow * row + freeCol - 1] = 0;
        left.freeCol--;
        left.lastMove = 9;
        return left;
    }
    
     /**
     * 
     * @return new situation (Puzzle) where empty tile is moved right from this.puzzle
     * 
     */
    
    public Puzzle moveRight() {
        Puzzle right = copyPuzzle();
        right.table[freeRow * row + freeCol] = this.table[freeRow * row + freeCol + 1];
        right.table[freeRow * row + freeCol + 1] = 0;
        right.freeCol++; 
        right.lastMove = 3;
        return right;
    }
     
     /**
     * 
     * @return new situation (Puzzle) where empty tile is moved up from this.puzzle
     * 
     */
     
    public Puzzle moveUp() {
        Puzzle up = copyPuzzle();
        up.table[freeRow * row + freeCol] = this.table[(freeRow - 1) * row + freeCol];
        up.table[(freeRow - 1) * row + freeCol] = 0;
        up.freeRow--;   
        up.lastMove = 12;
        return up;
    }
    
     /**
     * 
     * @return new situation (Puzzle) where empty tile is moved down from this.puzzle
     * 
     */
     
    public Puzzle moveDown() {
        Puzzle down = copyPuzzle();
        down.table[freeRow * row + freeCol] = this.table[(freeRow + 1) * row + freeCol];
        down.table[(freeRow + 1) * row + freeCol] = 0;
        down.freeRow++;
        down.lastMove = 6;
        return down;
    }
     
    /**
     * 
     * @return manhattan sum to correct solved puzzle
     * 
     */
     
    public int manhattan() {
        int manh = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (table[i * row + j] == 0) {
                    manh += Math.abs((row - 1) - i);
                    manh += Math.abs((row - 1) - j);           
                } else {
                    manh += Math.abs(Math.floorDiv(table[i * row + j] - 1, row) - i);
                    manh += Math.abs((table[i * row + j] - 1) % row - j);
                }
            }
            
        }
        return manh;
    }
    
    /**
     * 
     * @return number of miss placed tiles in Puzzle
     * 
     */
    public int countMissPlaced() { 
        int cmp = 0;
        for (int i = 0; i < (cubic - 1); i++) {
            if (table[i] != i + 1) {
                cmp++;
            }
        }
        if (table[cubic - 1] != 0) {
            cmp++;
        }
        return cmp;
    }
    /**
     * 
     * @return heurestic funktion for astar
     * 
     */
    
    
    public int getCost() {
        this.cost = Math.max(manhattan(), countMissPlaced());
        return this.cost;
    }
    
    /**
     * Help method to get the row number where given number located
     * 
     * @param number number searched
     * @return       row number of location, from up = 0
     */
    
    public int getRowOfNumber(int number) {
        int inRow = 0;
        for (int i = 0; i < cubic; i++) {
            if (table[i] == number) {
                while (i  > row) {
                    inRow++;
                    i -= row;                   
                }   
                break;
            }
       
        }
        return inRow;
    }
    
    /**
     * Help method to get column of given number located
     * 
     * @param number number searched
     * @return       column number of location, left most = 0
     */
    
    public int getColumnOfNumber(int number) {
        for (int i = 0; i < cubic; i++) {
            if (table[i] == number) {
                return i % row;                  
            }               
        }        
        return -1;
    }
    
    /**
     * Fills puzzle in order
     */

    public void fill() {
        for (int i = 1; i < cubic; i++) {
            table[i - 1] = i;
        }
    }
    
    /**
     * Shuffles this puzzle by changing two numberTiles location among themselves
     * @param times how many changes to be made
     */
    
    public void suffle(int times) {
        Random random;
        int freeTile = freeRow * row + freeCol;
        random = new Random();
        int a = 0;
        int b = 0;
        for (int i = times; i > 0; i--) {
            do {
                a = random.nextInt(cubic);
            } while (a == freeTile);
            do {
                b = random.nextInt(cubic);
            } while (b == freeTile || b == a);
            int c = table[a];
            table[a] = table[b];
            table[b] = c;
        }
        
    }
    
    /**
     * check if puzzle is solved
     * 
     * @return true if puzzle is in order
     */
    
    public boolean check() {
        if (freeRow != row - 1 && freeCol != row - 1) {
            return false;
        }
        for (int i = cubic - 2; i >= 0; i--) {
            if (table[i] != i + 1) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Help method to make puzzle array to String for printing
     * 
     * @return puzzle as multiple rows string
     */
    
    @Override
    public String toString() {
        String tablePrint;
        tablePrint = "";
        for (int i = 0; i < row; i++) {
            tablePrint += "\n";
            for (int j = 0; j < row; j++) {
                if (table[i * row + j] < 10) {
                    tablePrint += "  ";
                } else {
                    tablePrint += " ";
                }
                if (i == freeRow && j == freeCol) {
                    tablePrint += " ";
                    for (int p = i * row + j; p >= 9; p /= 10) {
                        tablePrint += " ";
                    }
                } else {
                    tablePrint +=  table[i * row + j]; 
                }
            }
        }
        return tablePrint; 
    }
    
    /**
     * Using parity of inversions if solvable
     * 
     * @return 
     */
    
    
    public boolean solvable() {
        boolean[] found = new boolean[cubic];
        int inversion = 0;
        for (int i = 0; i < cubic; i++) {
            for (int j = 1; j < table[i]; j++) {
                if (!found[j]) {
                    inversion++;
                }
                
            }
            found[table[i]] = true;
        }
        return (inversion % 2 == 0);
    }
        
    /**
     * 
     * @return comparing to puzzles by cost (getCost) 
     * 
     */

    @Override
    public int compareTo(Puzzle o) {
        if (this.cost < o.cost) {
            return 1;
        }
        if (this.cost > o.cost) {
            return -1;
        }
        return 0;
    }
    
    /**
     * 
     * @return puzzle as string 0 = A
     */

    public String asString() {
        String string = "";
        for (int i = 0; i < cubic; i++) {
            string += String.valueOf((char) (65 + table[i]));
        }
        return string;
    }
}
    
    

