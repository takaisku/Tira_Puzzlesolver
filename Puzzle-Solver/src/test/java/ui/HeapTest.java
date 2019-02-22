/*
 * 
 * 
 * 
 */
package ui;

import Model.Puzzle;
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
        first= new Puzzle(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,15,13,14,0});
        second= new Puzzle(new int[]{1,2,3,4,15,6,7,8,9,10,11,12,5,13,14,0});   
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void returningBetterFirst() {
        heap.add(second);
        heap.add(first);
        assertEquals(first.manhattan(), heap.remove().manhattan());
    }
}
