/*
 * 
 * 
 * 
 */
package Model;

import model.Puzzle;
import model.Result;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ui.Stack;

/**
 *
 * @author tkarkine
 */
public class ResultTest {
    Result result;
    Stack stack;
    Puzzle puzzle;
    
    public ResultTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        result = new Result();
    }
    
    @After
    public void tearDown() {
    }

    // couldnot test memoryusage.
    
    @Test
    public void usedTimeToStringNotZero() {
        result.start();
        puzzle = new Puzzle(120);
        stack=new Stack(puzzle);
        for (int i = 0; i<100000; i++){
            
        }
        result.end();
        assertFalse(result.usedTime().equals("0"));
    }
}

