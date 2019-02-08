/*
 * 
 * 
 * 
 */
package Model;

/**
 *
 * @author tkarkine
 */
public class Result {
    private long memory;
    private long runTime;
    private int moves;
    
    public Result() {
        moves = 0;
    }
    
    public void addMove() {
        moves++;
    }
    
    public int getMoves() {
        return moves;
    }
}
