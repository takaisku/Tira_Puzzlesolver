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
    private long timeAtStart;
    private long timeAtEnd;
    private long totalMemory;
    private long freeMemory;
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
    
    public void start(){
        timeAtStart=System.currentTimeMillis();
    }
    
    public void end() {
        timeAtEnd=System.currentTimeMillis();
        totalMemory=runTime.totalMemory();
        freeMemory=runTime.freeMemory();
    }
    
    public String usedMemToString(){
        long used= (totalMemory-freeMemory)/(1024);
       return Long.toString(used);
    }
    
    public String usedTime(){
        long used=timeAtEnd-timeAtStart;
        return Long.toString(used);
    }
    
    
    
}
