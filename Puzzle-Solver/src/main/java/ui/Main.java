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
        System.out.println("Puzzlen ratkoja algoritmien vertailua\n");
        System.out.println("Aluksi ratkaistu 15-puzzle:");
        
        first = new Puzzle(4);
        first.fill();
        System.out.println(first);
        System.out.println("");
        System.out.println("");
        System.out.println("Anna luku, montako numeroa vaihdetaan:");
        int temp = scanner.nextInt();
        for ( int i = 0; i < 2; i++) {
            first.suffle(temp);
            if (first.check()) {
                System.out.println("Puzzle on edelleen järjestyksessä");
                System.out.println("manhattan etäisyys: " + first.manhattan() + "\n");
            } else {
                System.out.println("manhanttan etäisyys: "+ first.manhattan() + "\n");
                System.out.println("ratkaistavissa: " + first.solvable() + "\n");
                System.out.println("");
                System.out.println(first);
                System.out.println("jos vaihdetaan parillinen määrä yhteensä");
                System.out.println("on puzzle ratkaistavissa, anna uusi luku, montako vaihdetaan:");
                temp = scanner.nextInt();        
            }
        }
        
       
       System.out.println("Ratkaistaan algoritmilla A-star...odota");
      
       astar = new Astar(first);
       result= astar.showResult();
       System.out.println("siirtoja tarvitaan " + result.getMoves());
       System.out.println("Muistia: " + result.usedMemToString());
      
       System.out.println("Aikavaatimus: "+ result.usedTime());
       astar = null;
       result= null;
       System.gc();
       System.out.println("Puzzle voi olla myös muun kokoinen"); 
       System.out.println("Varoitus, jos annat isomman luvun, tarvitaan muistia ja aikaa");
       System.out.println("Suositus 3, anna luku puzzlen sivun pituudelle:");
       temp = scanner.nextInt();  
       
       
       first = new Puzzle(temp);
       first.fill();  
       System.out.println("Vaihdan ensin parittoman määrän lukuja, (19)");
       first.suffle(19);
       System.out.println(first);
       System.out.println("manhanttan: "+ first.manhattan() + "\n");
       System.out.println("ratkaistavissa: " + first.solvable() + "\n");
       System.out.println("Vaihdan vielä yhden lisää");
       first.suffle(1);
       System.out.println(first);
       System.out.println("manhanttan: "+ first.manhattan() + "\n");
       System.out.println("ratkaistavissa: " + first.solvable() + "\n");         
       
       
       System.out.println("Aloitetaan syvyyshaulla, tämä kestää... malta");
      
       
       depth = new DepthFirst(first);
       result= depth.showResult();
       System.out.println("siirtoja tarvitaan " + result.getMoves());
       System.out.println("Muistia: " + result.usedMemToString());
      
       System.out.println("Aikavaatimus: "+ result.usedTime());
       depth = null;
       result= null;
       System.gc();
       
       
       System.out.println("");
       
       System.out.println("Leveyshaku on paljon nopeampi");
      
       
       bread = new BreadthFirst(first);
       result= bread.showResult();
       System.out.println("siirtoja tarvitaan " + result.getMoves());
       System.out.println("Muistia: " + result.usedMemToString());
      
       System.out.println("Aikavaatimus: "+ result.usedTime());
       bread = null;
       result= null;
       System.gc();
       
       System.out.println("");
       
       System.out.println("Nopein näistä on  A-star algoritmi");
      
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
