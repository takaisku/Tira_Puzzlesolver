
package ui;

import model.Puzzle;

/**
 * Queue done as array of Puzzles used in BreadthFirst algorithm
 * @author tkarkine
 */
public class Queue {
    Puzzle[] que;
    int size;
    int head;
    int tail;
    
    /** 
     * new queue with default size of 16
     */

    public Queue() {
        que = new Puzzle[16];
        size = 16;
        head = 0;
        tail = 0;
            
    }
    
    /**
     * new queue with first puzzle in it
     * default size is 16
     * @param root starting puzzle
     */
    
    public Queue(Puzzle root) {
        que = new Puzzle[16];       
        size = 16;
        head = 0;
        tail = 0;
        this.add(root);
    }
    
    /**
     * method to resize the queue by double
     */
    
    private void resize() {
        Puzzle[] copy = new Puzzle[size * 2];
        for (int i = 0; i < size; i++) {
            copy[i] = que[i];            
        }
        que = copy;
        size += size;
    }
    
    /**
     * Adding a puzzle to the end of the queue
     * @param added puzzle to add
     */
    
    public void add(Puzzle added) {  
        que[head++] = added;
        if (head == size) {
            this.resize();
        }
    }
    
    /**
     * checking if queue is empty
     * @return true if so
     */
    
    public boolean isEmpty() {
        return head == tail;
    }
    
    /**
     * taking a puzzle from queue if it is not empty
     * @return a puzzle from front of queue
     */
    
    public Puzzle remove() {
        if (isEmpty()) {
            return null;
        }
        Puzzle rved = que[tail];
        que[tail++] = null;
        return rved;
    }
        
}

