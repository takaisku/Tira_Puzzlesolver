package ui;


import Algorithms.Astar;
import Algorithms.BreadthFirst;
import Model.Puzzle;
import Model.Result;

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
        Astar astar;
        Result result;
        first = new Puzzle(4);
        
        first.fill();
        if (first.check()) {
           System.out.println("järjestyksessä");
           System.out.println("manhattan: " + first.manhattan()+"\n");
        }
        for (int i=0;i<10;i++) {
        first.suffle(30);
        if (first.check()) {
           System.out.println("järjestyksessä");
           System.out.println("manhattan: " + first.manhattan()+"\n");
        } else {
           System.out.println("sekoitettu");
           System.out.println("manhanttan: "+ first.manhattan());
           System.out.println("ratkaistavissa: " + first.solvable()+"\n");
        }
       
        System.out.println(first);
        if (first.solvable()){
           System.out.println("ratkaistavissa\n");
        } else {
           System.out.println("mahdoton\n");
        }
      
       //bread = new BreadthFirst(first);
       //System.out.println("siirtoja tarvitaan " +bread.showResult().getMoves());
       // jää vielä jumiin, ainakin jos suffle(120)
       astar = new Astar(first);
       result= astar.showResult();
       System.out.println("siirtoja tarvitaan " + result.getMoves());
       System.out.println("Muistia: " + result.usedMemToString());
      
       System.out.println("Aikavaatimus: "+ result.usedTime());
       astar = null;
       result=null;
       System.gc();
        }
       
    }
    
}
