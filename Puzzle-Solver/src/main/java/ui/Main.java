package ui;


import algorithms.Astar;
import algorithms.BreadthFirst;
import algorithms.DepthFirst;
import java.util.Scanner;
import model.Puzzle;
import model.Result;

/*
 * The task is the comparison of algorithms to solve 15-puzzle 
 * so far breadth first, depth first and a* algorithms have been done
 * The comparison is between used moves, memory and time.
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
        DepthFirst depth;
        Astar astar;
        Result result;
        Scanner scanner;
        
        scanner = new Scanner(System.in);
        
        first = new Puzzle(4);
        first.fill();
        System.out.println(first);
        System.out.println("");
        System.out.println("");
        int temp = scanner.nextInt();
        for ( int i = 0; i < 2; i++) {
            first.suffle(temp);
            if (first.check()) {
                System.out.println("järjestyksessä");
                System.out.println("manhattan: " + first.manhattan() + "\n");
            } else {
                System.out.println("manhanttan: "+ first.manhattan() + "\n");
                System.out.println("ratkaistavissa: " + first.solvable() + "\n");
                System.out.println("");
                System.out.println(first);
                System.out.println(""); 
                temp = scanner.nextInt();        
            }
        }
        
       
       System.out.println("A-star");
      
       astar = new Astar(first);
       result= astar.showResult();
       System.out.println("siirtoja tarvitaan " + result.getMoves());
       System.out.println("Muistia: " + result.usedMemToString());
      
       System.out.println("Aikavaatimus: "+ result.usedTime());
       astar = null;
       result= null;
       System.gc();
       temp = scanner.nextInt();  
       
       
       first = new Puzzle(3);
       first.fill();
       first.suffle(19);
       System.out.println(first);
       System.out.println("manhanttan: "+ first.manhattan() + "\n");
       System.out.println("ratkaistavissa: " + first.solvable() + "\n");
       first.suffle(1);
       System.out.println(first);
       System.out.println("manhanttan: "+ first.manhattan() + "\n");
       System.out.println("ratkaistavissa: " + first.solvable() + "\n");         
       
       
       System.out.println("depth");
      
       
       depth = new DepthFirst(first);
       result= depth.showResult();
       System.out.println("siirtoja tarvitaan " + result.getMoves());
       System.out.println("Muistia: " + result.usedMemToString());
      
       System.out.println("Aikavaatimus: "+ result.usedTime());
       depth = null;
       result= null;
       System.gc();
       
       
       System.out.println("");
       
       System.out.println("breath");
      
       
       bread = new BreadthFirst(first);
       result= bread.showResult();
       System.out.println("siirtoja tarvitaan " + result.getMoves());
       System.out.println("Muistia: " + result.usedMemToString());
      
       System.out.println("Aikavaatimus: "+ result.usedTime());
       bread = null;
       result= null;
       System.gc();
       
       System.out.println("");
       
       System.out.println("A-star");
      
       astar = new Astar(first);
       result= astar.showResult();
       System.out.println("siirtoja tarvitaan " + result.getMoves());
       System.out.println("Muistia: " + result.usedMemToString());
      
       System.out.println("Aikavaatimus: "+ result.usedTime());
       astar = null;
       result= null;
       System.gc();
       
        
       
    }
    
}
