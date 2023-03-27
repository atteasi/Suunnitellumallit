package proxy;

import java.util.ArrayList;
import java.util.Scanner;

class ProxyExample {
    /**
     * Test method
     */
    public static void main(final String[] arguments) {

        Scanner sc = new Scanner(System.in);
        ProxyImage[] kuvat = {
            new ProxyImage("kuva1"),
            new ProxyImage("kuva2"),
            new ProxyImage("kuva3"),
            new ProxyImage("kuva4"),
            new ProxyImage("kuva5"),
        };

        for(ProxyImage kuva: kuvat){
            kuva.showData();
        }

        boolean jatkuu = true;
        int valinta;

        while(jatkuu){
            System.out.println("Mitä kuvaa haluaisit katsoa? (lopeta syötteellä 0)");
            valinta = sc.nextInt();
            if(valinta > kuvat.length || valinta < 0){
                System.out.println("Virheellinen valinta!");
            } 
            else if(valinta == 0){
                System.out.println("Poistutaan...");
                jatkuu = false;
            } else{
                kuvat[valinta - 1].displayImage();
            }
        }
        
    }
 }