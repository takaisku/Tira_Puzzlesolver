package ui;


import Model.Puzzle;

/*
 * 
 * 
 * 
 */

/**
 *
 * @author tkarkine
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Puzzle first;
        first = new Puzzle(4);
        
       first.fill();
       if (first.check()) {
           System.out.println("järjestyksessä");
       }
       System.out.println(first.getRowOfNumber(14));
       System.out.println(first.getColumnOfNumber(first.getRow()-1));
       first.suffle(120);
       if (first.check()) {
           System.out.println("järjestyksessä");
       } else {
           System.out.println("sekoitettu");
       }
       System.out.println(first.getRowOfNumber(14));
       System.out.println(first.getColumnOfNumber(first.getRow()-1));
       
       System.out.println(first);
    }
    
}
