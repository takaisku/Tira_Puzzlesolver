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
public class Heap {
    private Puzzle[] heap;
    private int next;
    private int size;
    
    /**
     * Keko Puzzleja, ottaessa antaa lähimpänä ratkaisua olevan
     * 
     * @param size oltava 2 potenssiin n -1
     */
    
    public Heap(int size){
        this.size = size;
        heap = new Puzzle[size];
        next = 0;
    }
    
    public boolean isEmpty(){
        return next==0;
    }
    
    public void add(Puzzle a) {
        if (next==size) {
            resize();
        }
        heap[next]=a;
        shiftDown(next);
        next++;        
    }
    
    public Puzzle remove(){
        if(next==0){
            return null;
        }
        Puzzle best=heap[0];
        next--;
        if (next>0){
            heap[0]=heap[next];
            heap[next]=null;
            siftUp(0,1);
        }
        return best;
    }

    private void resize() {
        System.out.println("lisää tilaa " + size);
        Puzzle[] tmp = new Puzzle[(size+1)*2-1];
        for (int i= 0;i<size;i++){
            tmp[i]=heap[i];
        }
        heap=tmp;
        size= size << 1;
    }
    
    private void change(int parent, int child) {  
        if (heap[parent].compareTo(heap[child])==1){
            return;
        }
        Puzzle tmp = heap[parent];
        heap[parent]= heap[child];
        heap[child]=tmp;
    }

    private void shiftDown(int leaf) {
        int parent=0;
        if (leaf==0){
            return;
        }
        if (leaf%2==0) {
            parent=leaf/2-1;
        } else {
            parent=(leaf-1)/2;
        }
        if (heap[parent].compareTo(heap[leaf])==1){
            return;
        }
        change(parent,leaf);
        shiftDown(parent);
    }

    private void siftUp(int parent, int left){        
        if (left>=size || heap[left]== null){
            return;
        }
        if (heap[left+1]== null) {
            change(parent,left);
            parent=left;
            left=left*2+1;
            siftUp(parent,left);
        } else {        
            if (heap[left].compareTo(heap[left+1])==1){
                change(parent,left);
                parent=left;
                left=left*2+1;
                siftUp(parent,left); 
            } else {
                change(parent,left+1);
                parent=left+1;
                left=(left+1)*2;
                siftUp(parent,left);
            }
        }
    }
}
