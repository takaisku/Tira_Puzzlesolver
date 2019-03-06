/**
 * A star uses heap and puzzles are arranged in heap by heuristic algorithm to solve a puzzle
 * heuristic algorithm is getCost() in Puzzle.Java
 * 
 */
package algorithms;

import model.Puzzle;
import model.Result;
import ui.Heap;
import ui.Position;

/**
 *
 * @author tkarkine
 */

public class Astar {
    Heap heap;
    Position position;
    Result result;
    Puzzle current;
    
    /**
    * A star is started with first Puzzle and 
    * heap start size is 15
    * position stores Puzzle positions during solving so no same position solved
     * @param root starting position to solve
    */
    
    public Astar(Puzzle root) {
        heap = new Heap(15);
        result = new Result();
        current = null;
        heap.add(root);
        position = new Position(root);
    }
    
    /**
    * Method run() is actually solving given puzzle
    */
    
    private void run() {
        result.start();
        Puzzle candidate;
        while (!heap.isEmpty()) {
            current = heap.remove();
            result.addMove();
            if (current.check()) {
                break;
            }
            if (current.canMoveRight()) {
                candidate = current.moveRight();
                if (candidate.getCost() == 0) {
                    break;
                }
                if (!position.findOrAdd(candidate)) {
                    heap.add(candidate);
                }
            }
            if (current.canMoveDown()) {
                candidate = current.moveDown();
                if (candidate.getCost() == 0) {
                    break;
                }
                if (!position.findOrAdd(candidate)) {
                    heap.add(candidate);
                }
            }
            if (current.canMoveLeft()) {
                candidate = current.moveLeft();
                if (candidate.getCost() == 0) {
                    break;
                }
                if (!position.findOrAdd(candidate)) {
                    heap.add(candidate);
                }
            }
            if (current.canMoveUp()) {
                candidate = current.moveUp();
                if (candidate.getCost() == 0) {
                    break;
                }
                if (!position.findOrAdd(candidate)) {
                    heap.add(candidate);
                }   
            }
        }
        result.end();
        heap = null;
       // position.emptyPosition(position);
        position = null;
        System.gc();
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
