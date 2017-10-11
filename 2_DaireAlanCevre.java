/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daire;

import java.util.Scanner;

/**
 *
 * @author murat
 * Yarıçap Değerini Klavyeden okuyarak 
 * bir dairenin alanını ve çevresini 
 * hesaplayan programı yazınız. 

 */
public class DaireAlanCevre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double yaricap,daireAlan,daireCevre;
        Scanner giris=new Scanner(System.in);
        System.out.println("Daire Yaricapi:");
        yaricap=giris.nextDouble();
        daireAlan=Math.PI*Math.pow(yaricap,2);
        daireCevre=2*Math.PI*yaricap;
        System.out.println("Dairenin Alani:"+daireAlan);
        System.out.println("Dairenin Alani:"+daireCevre);
        
    }
    
}
