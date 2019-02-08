package ui;


import Algorithms.BreadthFirst;
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
        BreadthFirst bread;
        first = new Puzzle(4);
        
        
        
       first.fill();
       if (first.check()) {
           System.out.println("järjestyksessä");
           System.out.println("manhattan: " + first.manhattan());
       }
       System.out.println(first.getRowOfNumber(14));
       System.out.println(first.getColumnOfNumber(14));
       first.suffle(10);
       if (first.check()) {
           System.out.println("järjestyksessä");
           System.out.println("manhattan: " + first.manhattan());
       } else {
           System.out.println("sekoitettu");
           System.out.println("manhanttan: "+ first.manhattan());
       }
       System.out.println(first.getRowOfNumber(14));
       System.out.println(first.getColumnOfNumber(14));
       
       System.out.println(first);
       bread = new BreadthFirst(first);
       System.out.println("siirtoja tarvitaan " +bread.showResult());
       // jää vielä jumiin, ainakin jos suffle(120)
       
       
       
       
    }
    
}
