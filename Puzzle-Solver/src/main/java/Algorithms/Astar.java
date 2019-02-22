/*
 * 
 * 
 * 
 */
package Algorithms;

import Model.Puzzle;
import Model.Result;
import ui.Heap;

/**
 *
 * @author tkarkine
 */
public class Astar {
    Heap heap;
    Result result;
    Puzzle current;
    
    public Astar(Puzzle root){
        heap = new Heap(15);
        result = new Result();
        current = null;
        heap.add(root);
    }
    
    private void run() {
        result.start();
        Puzzle candidate;
        while (!heap.isEmpty()){
            current = heap.remove();
            result.addMove();
            if (current.check()) {
                break;
            }
            if (current.canMoveRight()) {
                candidate =current.moveRight();
                if (candidate.getCost()==0) {
                    break;
                }
                heap.add(candidate);
            }
            if (current.canMoveDown()) {
                candidate =current.moveDown();
                if (candidate.getCost()==0) {
                    break;
                }
                heap.add(candidate);
            }
            if (current.canMoveLeft()) {
                candidate =current.moveLeft();
                if (candidate.getCost()==0) {
                    break;
                }
                heap.add(candidate);
            }
            if (current.canMoveUp()) {
                candidate =current.moveUp();
                if (candidate.getCost()==0) {
                    break;
                }
                heap.add(candidate);
            }
        }
        result.end();
        heap=null;
        System.gc();
    }
    
    public Result showResult(){
        run();
        return result;
    }
    
}