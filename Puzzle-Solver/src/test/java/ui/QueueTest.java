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
public class QueueTest {
    Queue que;
    Puzzle puzzle;

    
    public QueueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        que = new Queue();
        puzzle = new Puzzle(4);
    }
    
    @After
    public void tearDown() {
        que=null;
        puzzle=null;
    }

    @Test
    public void addToEmptynotEmpty() {
        que.add(puzzle);
        assertFalse(que.isEmpty());
    }
    
    @Test
    public void addUntilResize(){
        for(int i = 0;i<16;i++){
            que.add(puzzle);           
        }
        assertEquals(32, que.size);
    }
    
    @Test
    public void removeEmpty(){
        assertNull(que.remove());
    }
    
    @Test
    public void removeFirst(){
        Puzzle first=new Puzzle(3);
        Puzzle second=new Puzzle(4);
        que.add(first);
        que.add(second);
        assertEquals(3,que.remove().getRow());
    }
}
