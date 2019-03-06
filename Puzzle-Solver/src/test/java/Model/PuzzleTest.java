package Model;

/*
 * 
 * 
 * 
 */

import model.Puzzle;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
    Puzzle solvable;
    Puzzle notSolvable;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

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
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        puzzle.fill();
    }   
    
    @After
    public void tearDown() {
        System.setOut(originalOut);
        System.setErr(originalErr);
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
    public void columnNumberMax(){
        int search = puzzle.getRow()*puzzle.getRow()-1;
        int result = puzzle.getRow()-2;
        assertEquals(result, puzzle.getColumnOfNumber(search));
          
    }
    
    @Test
    public void checkWithFill(){
        assertTrue(puzzle.check());
    }
    
    @Test
    public void chechFalseWithSuffle(){
        puzzle.suffle(1);
        assertFalse(puzzle.check()  ); 
    }
    
    @Test 
    public void givenPuzzleWithWrongSize(){
        puzzle=new Puzzle(1);
        int[] candidate =new int[]{8,4,2,3,1,7,9,10,12,11,13,8,6,0,17,14,15};
        assertFalse(puzzle.isValid(candidate));}
    
    @Test 
    public void givenPuzzleWithTwoSameTile(){
        puzzle=new Puzzle(1);
        int[] candidate =new int[]{8,4,2,3,1,7,9,10,12,11,13,8,6,0,14,15};
        assertFalse(puzzle.isValid(candidate));
    }   
    
    @Test 
    public void givenAcceptablePuzzle(){
        puzzle=new Puzzle(1);
        int[] candidate =new int[]{5,4,2,3,1,7,9,10,12,11,13,8,6,0,14,15};
        assertTrue(puzzle.isValid(candidate)); }
    
    
   
    
    @Test
    public void puzzleUnSolvable(){
        solvable = new Puzzle(new int[]{8,4,2,3,1,7,9,10,12,11,13,5,6,0,14,15});
        assertFalse(solvable.solvable());           
        }
        
    @Test
    public void puzzleSolvable(){
        solvable = new Puzzle(new int[]{8,4,2,3,1,7,9,10,12,11,13,5,6,0,15,14});
        assertTrue(solvable.solvable()); 
    }
    
    
}
