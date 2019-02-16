/*
 * 
 * 
 * 
 */
package ui;

import Model.Puzzle;

/**
 *
 * @author tkarkine
 */
public class Queue {
    Puzzle[] que;
    int size;
    int head;
    int tail;

    public Queue() {
        que = new Puzzle[16];
        size = 16;
        head = 0;
        tail = 0;
            
    }
    
    public Queue(Puzzle root) {
        que = new Puzzle[16];       
        size = 16;
        head = 0;
        tail = 0;
        this.add(root);
    }
    
    private void resize() {
        Puzzle[] copy = new Puzzle[size*2];
        for (int i=0; i<size; i++) {
            copy[i] = que[i];            
        }
        que=copy;
        size+= size;
    }
    
    public void add(Puzzle added) {  
        que[head++] = added;
        if (head == size) {
            this.resize();
        }
    }
    
    public boolean isEmpty() {
        return head==tail;
    }
    
    public Puzzle remove() {
        if (isEmpty()) {
            return null;
        }
        Puzzle rved = que[tail];
        que[tail++] = null;
        return rved;
    }
        
}

