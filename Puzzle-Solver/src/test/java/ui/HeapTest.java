/*
 * 
 * 
 * 
 */
package ui;

import model.Puzzle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tkarkine
 */
public class HeapTest {
    Heap heap;
    Puzzle first;
    Puzzle second;
    
    public HeapTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        heap= new Heap(15);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void returningBetterFirst() {        
        first= new Puzzle(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,15,13,14,0});
        second= new Puzzle(new int[]{1,2,3,4,15,6,7,8,9,10,11,12,5,13,14,0}); 
        heap.add(second);
        heap.add(first);
        assertEquals(first.manhattan(), heap.remove().manhattan());
    }
    
    @Test
    public void returningBestMoveFromSituation() {
        first = new Puzzle(new int[]{14,13,5,12,2,3,15,4,8,0,11,9,10,1,7,6});
        heap.add(first);
        heap.add(first.moveDown());
        heap.add(first.moveLeft());
        heap.add(first.moveRight());
        heap.add(first.moveUp());
        assertEquals(heap.remove().asString(),first.moveUp().asString());
    }
}
