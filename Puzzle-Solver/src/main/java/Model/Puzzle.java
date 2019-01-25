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
 * freeTile on tyhjä ruutu mihin voi siirtää jonkin numeron
 * row on pelialueen sivun koko ruutuina ja siis myös column
 * cubic on pelialueen koko ruutuina
 * 
 */
public class Puzzle {
    private int[] table;
    private int freeTile;
    private int cubic;    
    private int row;
    
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
        freeTile = cubic -1;
    }
    
    /**
     * Apumetodi, jolla pelialueen koko voidaan kysyä, muttei muokata
     * @return pelialueen sivun pituus ruutuina
     */
    
    public int getRow(){
        return row;
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
        random = new Random();
        int a = 0;
        int b = 0;
        for (int i=times; i>0; i--) {
            do {
                a = random.nextInt(cubic);
            } while (a ==freeTile);
            do {
                b = random.nextInt(cubic);
            } while (b == freeTile && b==a);
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
        if (freeTile != cubic-1) {
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
                if (i*row+j == freeTile ) {
                        tablePrint += " ";
                    for (int p = freeTile; p >= 9; p/=10) {
                        tablePrint += " ";
                    }
                } else {
                    tablePrint +=  table[i*row+j]; 
                }
            }
        }
        return tablePrint; 
    }
}
    
    

