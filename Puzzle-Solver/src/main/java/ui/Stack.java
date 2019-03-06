
package ui;

import model.Puzzle;

/**
 * Stack done as array of Puzzles used by DepthFirst algorithm
 * @author tkarkine
 */
public class Stack {
    Puzzle[] stack;
    int size;
    int head;
    
    /**
     * Constructor for new stack with default size of 16
     */
    
    public Stack() {
        stack = new Puzzle[16];
        size = 16;
        head = 0;
       
            
    }
    
    /**
     * Creating new stack with first Puzzle in it
     * default size 16
     * @param root 
     */
    
    public Stack(Puzzle root) {
        stack = new Puzzle[16];       
        size = 16;
        head = 0;
        this.add(root);
    }
    
    /**
     * doubling the size of stack
     */
    
    private void resize() {
        Puzzle[] copy = new Puzzle[size * 2];
        for (int i = 0; i < size; i++) {
            copy[i] = stack[i];            
        }
        stack = copy;
        size += size;
    }
    
    /**
     * adding a puzzle to the top of the stack, resizing if necessary
     * @param added puzzle to add to the stack
     */
    
    public void add(Puzzle added) {  
        stack[head++] = added;
        if (head == size) {
            this.resize();
        }
    }
    
    /**
     * Checking if stack is empty
     * @return true if so
     */
    
    public boolean isEmpty() {
        return head == 0;
    }
    
    /**
     * taking a puzzle from stack if it is not empty
     * @return puzzle from the top of the stack
     */
    
    public Puzzle remove() {
        if (isEmpty()) {
            return null;
        }
        Puzzle rved = stack[--head];
        stack[head + 1] = null;
        return rved;
    }
        
}

