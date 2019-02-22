/*
 * 
 * 
 * 
 */
package Model;

import java.util.Random;

/**
 * @author tkarkine
 * 
 * Puzzlen tilanne muistissa kokonaislukutaulukkona
 * freeRow      tyhjän ruudun rivi
 * freeCol      tyhjän ruudun sarake
 * row          pelialueen sivun koko ruutuina ja siis myös column
 * cubic        pelialueen koko ruutuina
 * lastMove     edellinen siirtosuunta, used not to go
 * cost         manhattan + missplaced, used with comparation
 * 
 */
public class Puzzle implements Comparable<Puzzle> {
    private int[] table;
    private int freeRow;
    private int freeCol;
    private int cubic;    
    private int row;
    private int lastMove;
    private int cost;
    
    /**
     * 
     * @param side pelialue luodaan antamalla sen sivun pituus ruutuina
     * 
     * freeTile sijoitetaan oikeaan alakulmaan pelialuetta
     */
    
    public Puzzle(int side) {
        row = side;
        cubic= side*side;
        table = new int[cubic];
        freeRow = row -1;
        freeCol = row -1;
        lastMove = 0;       
        
    }
    
    /**
     * 
     * @param game pelialue voidaan antaa taulukkona
     * lähinnä testausta varten
     * 
     */
    
    public Puzzle(int[] game) {
        if (isValid(game)) {
            table = game;
            for (int i = 0;i<cubic;i++) {            
            if (table[i]==0) {
                freeRow = Math.floorDiv(i, row);
                freeCol = i%row;
                }
            }
        lastMove = 0;
        }
    }   
    
    
    public final boolean isValid(int[] table){
        row =(int) Math.sqrt(table.length);
        cubic = row*row;
        if (cubic!=table.length) {
            // epäkelpo pelikoko
            System.out.println("Virheellinen puzzle, pelialue ei ole neliö!");
            return false;
        }
        boolean[] checkTable = new boolean[cubic];
        for (int i = 0;i<cubic;i++) {
            if (checkTable[table[i]]) {
                // sama numero kahdesti
                System.out.println("Virheellinen puzzle, kaksi samaa numeroa!");
                return false;
            }
            checkTable[table[i]]=true;
        }
        return true;        
    }
    
    /**
     * apumetodi
     * @return kopioi tämän puzzlen
     */
    
    public Puzzle copyPuzzle() {
        Puzzle next= new Puzzle(row);
        next.freeRow = this.freeRow;
        next.freeCol = this.freeCol;
        for(int i=0; i<cubic; i++) {
              next.table[i] = this.table[i];
        }
        return next;
    }
    
    /**
     * Apumetodi, jolla pelialueen koko voidaan kysyä, muttei muokata
     * @return pelialueen sivun pituus ruutuina
     */
    
    public int getRow(){
        return row;
    }
    
    /**
     * Arvo, jolla saadaan selville millä siirrolla tähän tilanteeseen on tultu
     * estetään edestakaiset siirrot
     * @return       suunta kellotaulun numerona, 0 ei edellistä siirtoa
     */
    
    public int getLastMove() {
        return lastMove;
    }
    
    /**
     * voidaan siirtää tyhjä oikealle, jos ei ole oikeassa laidassa eikä viimeksi 
     * ole siirrytty vasemmalle
     * @return 
     */
    
    public boolean canMoveRight() {
       return freeCol < (row -1) && lastMove != 9;
    }
    
    /**
     * voidaan siirtää tyhjä alas, jos ei ol ala laidassa eikä viimeksi 
     * ole siirrytty ylös
     * @return 
     */
    
    public boolean canMoveDown() {
        return freeRow < (row-1)&& lastMove != 12;
    }
    
    /**
     * voidaan siirtää tyhjä vasemmalle, jos ei ole vasemmassa laidassa eikä viimeksi 
     * ole siirrytty oikealla
     * @return 
     */
    
    public boolean canMoveLeft() {
      return freeCol > 0 && lastMove != 3;
    }
    
    /**
     * voidaan siirtää tyhjä ylös, jos ei ole ylä laidassa eikä viimeksi 
     * ole siirrytty alas
     * @return 
     */
    
    public boolean canMoveUp() {
        return freeRow > 0 && lastMove != 6;
    }
    
    /**
     * 
     * @return palauttaa puzzlen jossa tästä vapaakohta on siirretty vasemmalle
     * 
     */
    public  Puzzle moveLeft() {
        Puzzle left = copyPuzzle();
        left.table[freeRow*row+freeCol] = this.table[freeRow*row+freeCol-1];
        left.freeCol--;
        left.lastMove = 9;
        return left;
    }
    
    /**
     * 
     * @return palauttaa puzzlen jossa tästä vapaakohta on siirretty oikealle
     * 
     */
    
     public Puzzle moveRight() {
        Puzzle right = copyPuzzle();
        right.table[freeRow*row+freeCol] = this.table[freeRow*row+freeCol+1];
        right.freeCol++; 
        right.lastMove = 3;
        return right;
    }
     
    /**
     * 
     * @return palauttaa puzzlen jossa tästä vapaakohta on siirretty ylös
     * 
     */
     
     public Puzzle moveUp() {
        Puzzle up = copyPuzzle();
        up.table[freeRow*row+freeCol] = this.table[(freeRow-1)*row+freeCol];
        up.freeRow--;   
        up.lastMove = 12;
        return up;
    }
    
    /**
     * 
     * @return palauttaa puzzlen jossa tästä vapaakohta on siirretty alas
     * 
     */
     
     public Puzzle moveDown() {
        Puzzle down = copyPuzzle();
        down.table[freeRow*row+freeCol] = this.table[(freeRow+1)*row+freeCol];
        down.freeRow++;
        down.lastMove = 6;
        return down;
    }
     
    /**
     * 
     * @return kokonaisluvun, joka on summa jokaisen numeron vaaka+pysty etäi
     * syydestä oikealle paikalleen.
     * 
     */
     
    public int manhattan(){
        int manh = 0;
        for (int i=0; i<row; i++) {
            for (int j=0; j<row; j++) {
                if(table[i*row+j]==0) {
                   manh+=Math.abs((row-1)-i);
                   manh+=Math.abs((row-1)-j);           
                } else {
                manh+=Math.abs(Math.floorDiv(table[i*row+j]-1, row)-i);
                manh+=Math.abs((table[i*row+j]-1)%row-j);
                }
            }
            
        }
        return manh;
    }
    
    /**
     * 
     * @return palauttaa kuinka monta laattaa ei ole omalla paikallaan
     * 
     */
    public int countMissPlaced(){
        int cmp=0;
        for (int i=0; i< (cubic-1);i++){
            if (table[i]!= i+1) {
                cmp++;
            }
        }
        if (table[cubic-1]!=0) {
            cmp++;
        }
        return cmp;
    }
    /**
     * 
     * @return heurestic funktio for astar
     * 
     */
    
    
    public int getCost(){
        this.cost = Math.max(manhattan(), countMissPlaced());
        return this.cost;
    }
    
    /**
     * Apumetodi, jolla saadaan selville millä rivillä jokin numero on
     * 
     * @param number haettu numero
     * @return       rivinumero ylhäältä ja nollasta lukien
     */
    
    public int getRowOfNumber(int number) {
        int inRow = 0;
        for (int i = 0; i< cubic;i++) {
            if (table[i] == number) {
               while (i  > row) {
                   inRow++;
                   i-=row;                   
               }   
                break;
            }
       
        }
        return inRow;
    }
    
    /**
     * Apumetodi, jolla saadaan selville missä sarakkeessa jokin numero on
     * 
     * @param number haettu numero
     * @return       sarakenumero vasemmasta laidasta ja nollasta
     */
    public int getColumnOfNumber(int number) {
        for (int i = 0; i< cubic;i++) {
            if (table[i] == number) {
               return i % row;                  
               }               
            }        
        return -1;
    }
    
    /**
     * Täyttää pelialueen järjestyksessä
     */

    public void fill() {
        for (int i=1; i< cubic; i++) {
            table[i-1]=i;
        }
    }
    
    /**
     * Sekoittaa peliä vaihtamalla kahden arvotun numeron paikan
     * @param times vaihtokerrat
     */
    
    public void suffle(int times) {
        Random random;
        int freeTile = freeRow*row+freeCol;
        random = new Random();
        int a = 0;
        int b = 0;
        for (int i=times; i>0; i--) {
            do {
                a = random.nextInt(cubic);
            } while (a ==freeTile);
           do {
                b = random.nextInt(cubic);
            } while (b == freeTile || b==a);
            int c = table[a];
            table[a] = table[b];
            table[b]= c;
        }
        
    }
    
    /**
     * Tarkistus onko puzzle ratkaistu
     * 
     * @return totuusarvo ratkaistu puzzle palauttaa true
     */
    
    public boolean check() {
        if (freeRow != row-1 && freeCol != row -1) {
            return false;
        }
        for (int i = cubic -2; i>=0; i--){
            if (table[i] != i+1) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Tulostusasu pelialueelle. Tässä vaiheessa toimii sivunpituuksill 2-9
     * 
     * @return puzzle merkkijonona
     */
    
    @Override
    public String toString() {
        String tablePrint;
        tablePrint = "";
        for (int i=0;i <row;i++) {
            tablePrint += "\n";
            for (int j=0;j<row;j++) {
                if (table[i*row+j]<10) {
                    tablePrint += "  ";
                } else {
                    tablePrint += " ";
                }
                if (i == freeRow && j == freeCol ) {
                        tablePrint += " ";
                    for (int p = i*row+j; p >= 9; p/=10) {
                        tablePrint += " ";
                    }
                } else {
                    tablePrint +=  table[i*row+j]; 
                }
            }
        }
        return tablePrint; 
    }
    
    /**
     * Using parity of inversions if solvable
     * 
     * @return 
     */
    
    
        public boolean solvable(){
        boolean[] found = new boolean[cubic];
        int inversion=0;
        for (int i = 0; i<cubic;i++){
            for(int j=1;j<table[i];j++){
                if (!found[j]){
                    inversion++;
                }
                
            }
            found[table[i]]=true;
        }
        return (inversion%2==0);
    }
        
    /**
     * 
     * @return palauttaa kumpi puzzle on lähempänä ratkaisua cost metodin perusteella
     * 
     */

    @Override
    public int compareTo(Puzzle o) {
        if (this.cost<o.cost) {
            return 1;
        }
        if (this.cost>o.cost){
            return -1;
        }
        return 0;
    }
}
    
    

