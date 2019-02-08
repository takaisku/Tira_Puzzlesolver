/*
 * 
 * 
 * 
 */
package Algorithms;

import ui.Queue;
import Model.Puzzle;
import Model.Result;

/**
 *
 * @author tkarkine
 */
public class BreadthFirst {
    Queue queue;
    Result result;
    Puzzle current;

    public BreadthFirst(Puzzle root) {
        this.queue = new Queue(root);
        this.result = new Result();
        this.current = null;
    }
    
    private void run() {
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
    }
   
    public int showResult() {
        run();
        return result.getMoves();
        
    }
    
    
    
}
