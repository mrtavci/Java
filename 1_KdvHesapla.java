/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kdvhesapla;

/**
 *
 * @author murat
 * Bir malın fiyatı 1500ytl dir.
 * Bu mal,%18 i kadar KDVsi alınarak satılacaktır.
 * Bu malın KDV sini ve satılacağı fiyatı hesaplayıp 
 * ekrana yazdırınız. 
 */
public class KdvHesapla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double fiyat=1500,kdv,satisFiyat;
        kdv=(fiyat*18)/100;
        satisFiyat=kdv+fiyat;
        System.out.println("Bu Malın Kdvsi:"+kdv);
        System.out.print("Bu Malın Satis Fiyati:"+satisFiyat);
        
    }
    
}
