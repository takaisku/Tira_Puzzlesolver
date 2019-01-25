package Model;

/*
 * 
 * 
 * 
 */

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
public class PuzzleTest {
    Puzzle puzzle;
    
    public PuzzleTest() {
        puzzle = new Puzzle(4);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        puzzle.fill();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void rowNumberLow() {
        assertEquals(0,puzzle.getRowOfNumber(3));
    }
    
    @Test
    public void rowNumberMax() {
       int search = puzzle.getRow()*puzzle.getRow()-1;
        int result = puzzle.getRow()-1;
        assertEquals(result, puzzle.getRowOfNumber(search));
    }
    
    @Test
    public void columnNumberLow() {
       int search = puzzle.getRow()+1;
       assertEquals(0,puzzle.getColumnOfNumber(search));
                
    }
    
    @Test
    public void columnNumberMax() {
        int search = puzzle.getRow()*puzzle.getRow()-1;
        int result = puzzle.getRow()-2;
        assertEquals(result, puzzle.getColumnOfNumber(search));
          
    }
    
    @Test
    public void checkWithFill() {
        assertTrue(puzzle.check());
    }
    
    @Test
    public void chechFalseWithSuffle() {
        puzzle.suffle(1);
        assertFalse(puzzle.check()  );
    }
    
}
