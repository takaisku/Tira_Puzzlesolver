/*
 * 
 * 
 * 
 */
package ui;

import model.Puzzle;

/**
 * Class for expanded positions of puzzle
 * uses linked list approach
 * but puzzles are stored as strings in alphabetical order
 * @author tkarkine
 */

public class Position {
    String asString;
    Position next;
    
    /*
    * Creating new list of expanded Puzzles
    * @param start is first Puzzle to list
    * it is how ever stored to second place, so it will be easier
    * to add new puzzle if if it is first in order
    */
    
    public Position(Puzzle start) {
        Position head = new Position();
        this.asString = "";
        this.next = head;
        head.asString = start.asString();
        head.next = null;
    }
    
    /*
    * empty constructor is used when adding puzzle to an existing list
    */
    
    public Position() {
        asString = null;
        next = null;
    }
    
    /*
    *
    * Method is used to check if a puzzle is already expanded 
    *  @param puzzle is new candidate to check
    *  @return true if puzzle already in list and so expanded
    *  @return false if puzzle new, before returning puzzle is added to list
    *  in alphabetical position 
    */
    
    public boolean findOrAdd(Puzzle puzzle) {
        String str = puzzle.asString();
        int diff = next.asString.compareTo(str);
        // new is first
        if (diff == 0) {
            return true;
        }
        //new to first
        if (diff > 0) {
            Position add = new Position();
            add.asString = str;
            add.next = next;
            this.next = add;
            return false;
        }
        // searching from middle
        Position head = this;
        while (head.next != null) {
            diff = head.next.asString.compareTo(str);
            if (diff == 0) {
                return true;
            } else if (diff > 0) {
                Position add = new Position();
                add.asString = str;
                add.next = head.next;
                head.next = add;
                return false;
            } else {
                head = head.next;
            }
        }
        Position add = new Position();
        add.asString = str;
        head.next = add;
        return false;     
    }
    
    /*
    * help Method which prints hole list to console for checking
    */
    
    public void printToConsole() {
        Position tmp = this;
        while (tmp.next != null) {
            System.out.println(tmp.asString + "\n");
            tmp = tmp.next;
        }
        
    }
    
    /**
    * Was meant to empty the list after use and so free memory
    * uses recursive approach emptying list from end
    * but couldn't solve stack overflow
    * 
     * @param emp is position which, if has next, continue recursion 
     * other words if it is not last in linked list
    */
    
    public void emptyPosition(Position emp) {
        if (emp.next != null) {
            Position temp = emp.next;
            emptyPosition(temp);
            emp.next = null;
        }
    }
    
}
