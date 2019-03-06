/*
 * 
 * 
 * 
 */
package model;

/**
 *
 * @author tkarkine
 */
public class Result {
    private long timeAtStart;
    private long timeAtEnd;
    private long totalMemory;
    private long endFreeMemory;
    private long startFreeMemory;
    private Runtime runTime;
    private int moves;
    
    public Result() {
        moves = 0;
        runTime = Runtime.getRuntime();
    }
    
    public void addMove() {
        moves++;
    }
    
    public int getMoves() {
        return moves;
    }
    
    public void start() {
        timeAtStart = System.currentTimeMillis();
        startFreeMemory = runTime.freeMemory();
    }
    
    public void end() {
        timeAtEnd = System.currentTimeMillis();
        totalMemory = runTime.totalMemory();
        endFreeMemory = runTime.freeMemory();
    }
    
    public String usedMemToString() {
        long used = (startFreeMemory - endFreeMemory) / (1024);
        return Long.toString(used);
    }
    
    public String usedTime() {
        long used = timeAtEnd - timeAtStart;
        return Long.toString(used);
    }
}
