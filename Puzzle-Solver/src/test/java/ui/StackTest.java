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
public class StackTest {
    Stack stack;
    Puzzle puzzle;
    
    public StackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        stack=new Stack();
    }
    
    @After
    public void tearDown() {
        stack=null;
    }

    @Test
    public void addToEmptynotEmpty() {
        stack.add(puzzle);
        assertFalse(stack.isEmpty());
    }
    
    @Test
    public void addUntilResize(){
        for(int i = 0;i<16;i++){
            stack.add(puzzle);           
        }
        assertEquals(32, stack.size);
    }
    
    @Test
    public void removeEmpty(){
        assertNull(stack.remove());
    }
    
    @Test
    public void removeFirst(){
        Puzzle first=new Puzzle(3);
        Puzzle second=new Puzzle(4);
        stack.add(first);
        stack.add(second);
        assertEquals(4,stack.remove().getRow());
    }
}
