/*
 * 
 * 
 * 
 */
package algorithms;

import ui.Queue;
import model.Puzzle;
import model.Result;

/**
 * BreadthFirst uses breadth first approach and queue to solve a puzzle
 * 
 * @author tkarkine
 */
public class BreadthFirst {
    Queue queue;
    Result result;
    Puzzle current;
    
    /**
     * Initiating algorithm
     * @param root is starting position
     * Starting position is added to queue 
     */

    public BreadthFirst(Puzzle root) {
        this.queue = new Queue(root);
        this.result = new Result();
        this.current = null;
    }
    
    
    /**
    * Method run() is actually solving given puzzle
    */
    
    private void run() {
        result.start();
        while (!queue.isEmpty()) {
            current = queue.remove();
            result.addMove();
            if (current.check()) {
                break;
            }
            if (current.canMoveRight()) {
                queue.add(current.moveRight());
            }
            if (current.canMoveDown()) {
                queue.add(current.moveDown());
            }
            if (current.canMoveLeft()) {
                queue.add(current.moveLeft());
            }
            if (current.canMoveUp()) {
                queue.add(current.moveUp());
            }
            
        }
        result.end();
    }
    
    /**
    * Method showResult is main method, as the programs idea is get comparable data
    * from solving Puzzle with this algorithm
     * @return results as model Result (moves, memory and time used)
    */
   
    public Result showResult() {
        run();
        return result;
        
    }
    
    
    
}
