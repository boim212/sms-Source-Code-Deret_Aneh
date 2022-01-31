/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deret_aneh;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Deret_Aneh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int angka, bilangan, hitung1, hitung2;
        
        System.out.print  ("Masukkan Suatu Bilangan = ");
        angka = input.nextInt();
        
        //bilangan = 0;
        while (angka > 1)
        {
            if (angka % 2 == 1)
            {
                
                hitung1 = (angka * 3) + 1;
                angka = hitung1;
                System.out.printf (" %d " , angka);
                
            }
            else
            {
                hitung2 = (angka / 2);
                angka = hitung2;
                System.out.printf (" %d ", angka);
                
            }
        }
    }
}
