/*
 * 
 * 
 * 
 */
package algorithms;

import model.Puzzle;
import model.Result;
import ui.Heap;
import ui.Position;
import ui.Stack;

/**
 * DepthFirst uses Depth First approached with stack helped with
 * heap which returns best move first
 * worst of algorithms in package 
 * @author tkarkine
 */
public class DepthFirst {
    Stack stack;
    Heap heap;
    Position position;
    Puzzle current;
    Puzzle first;
    Puzzle second;
    Puzzle third;
    Puzzle forth;
    Result result;
    
    /**
     * stack is for storing new unexpanded positions 
     * heap is for arranging expandable position by Puzzle.getCost()
     * position is for storing expanded positions 
     * @param start starting position to solve
     */
    
    public DepthFirst(Puzzle start) {
        current = start;
        heap = new Heap(4);
        stack = new Stack();
        position = new Position(start);
        result = new Result();
    }
    
    /**
     * Method run() is actually solving a puzzle
     */
    
    private void run() {
        result.start();
        while (current.check() == false) {
            result.addMove();
            position.findOrAdd(current);
            if (current.canMoveLeft()) {
                heap.add(current.moveLeft());
            }
            if (current.canMoveRight()) {
                heap.add(current.moveRight());
            }
            if (current.canMoveUp()) {
                heap.add(current.moveUp());
            }
            if (current.canMoveDown()) {
                heap.add(current.moveDown());
            }
            first = heap.remove();
            second = heap.remove();
            
            third = heap.remove();
            
            forth = heap.remove();
            
            if (!(forth == null || position.findOrAdd(forth) == true)) {
                stack.add(forth);
            }
            if (!(third == null || position.findOrAdd(third))) {
                stack.add(third);
            }
            if (!(second == null || position.findOrAdd(second))) {
                stack.add(second);
            }
            if (!(first == null || position.findOrAdd(first))) {
                current = first;
            } else {
                if (stack.isEmpty()) {
                    //should not ever happen
                    break;
                } else {
                    current = stack.remove();
                }
            }
        }
        result.end();
        heap = null;
        stack = null;
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
