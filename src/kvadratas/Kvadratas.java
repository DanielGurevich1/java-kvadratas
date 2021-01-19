/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kvadratas;

/**
 *
 * @author DanielMac
 */
public class Kvadratas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] m = {1, 2, 3, 4, 5, 6, 7};
            
        int[][] rez = new int [m.length][m.length];
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
//                rez[i][j] = m[(i+j) % m.length];
                rez[i][(i+j) % m.length] = m[j];
            }
        }
        
    
//        kvadratas[1] = new int [2];
        
//        kvadratas[1][1] = 9;
        
        for (int i=0; i < rez.length; i++) {
            int[] eilute = rez[i];
            for (int j = 0; j < eilute.length; j++){
                int elementas = eilute[j];
                System.out.print(elementas + " ");
            }
                System.out.println();
        }
    }
    
}
