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
public class PositionTest {
    Position position;
    
    public PositionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {        
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void newPositionCreateSavesPuzzlePosition() {
        Puzzle start=new Puzzle(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0});
        position = new Position(start);
        assertTrue(position.findOrAdd(start));        
    }
    
    @Test
    public void addingNewPositionReturnFalseInAdding() {
        Puzzle start=new Puzzle(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0});
        position = new Position(start);
        Puzzle adding=new Puzzle(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,0,15});
        assertFalse(position.findOrAdd(adding));        
    }
    
    @Test
    public void makingLoopWithMovesPositionFound() {
        Puzzle start=new Puzzle(new int[]{1,14,3,4,5,10,7,8,9,6,0,12,13,2,15,11});
        position = new Position(start);
        for(int i=0;i<3;i++){
        start = start.moveUp();
        position.findOrAdd(start);
        start = start.moveLeft();
        position.findOrAdd(start);
        start = start.moveDown();
        position.findOrAdd(start);
        start = start.moveRight();
        position.findOrAdd(start);
        }
        // now we back in startposition 
        assertTrue(position.findOrAdd(new Puzzle(new int[]{1,14,3,4,5,10,7,8,9,6,0,12,13,2,15,11})));        
    }
    
    

}
