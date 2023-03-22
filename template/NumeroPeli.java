package template;

import java.util.HashMap;
import java.util.Random;

public class NumeroPeli extends Game {

    HashMap pisteet = new HashMap<Integer, Integer>();
    boolean loppu = false;
    Random rand = new Random();
    @Override
    void initializeGame() {
        
        System.out.println("Tervetuloa pelamaan satunnaislukupeliä! Voittaja on se, joka ensin saa satunnaislukuarpojalta 50 pistettä!");
    }

    @Override
    void makePlay(int player) {
        int arvottuLuku = (rand.nextInt(10-1+1) + 1);

        System.out.println("Pelaajalle " + player + " arvottiin luku " + arvottuLuku);
        if(pisteet.get(player) == null){
            pisteet.put(player, arvottuLuku);
        } else {
            int pisteMaara = arvottuLuku + (int) pisteet.get(player);
            pisteet.put(player, pisteMaara);
        }
        int pisteita = (int) pisteet.get(player);
        if(pisteita > 50){
            loppu = true;
        }
    }

    @Override
    boolean endOfGame() {
        if(loppu)
            return true;
        return false;
    }

    @Override
    void printWinner() {
        int voittaja = 0;
        for(int i = 0; i < pisteet.size(); i++){
            if(i != 0){
                if((int) pisteet.get(i) > (int) pisteet.get(i - 1)){
                    voittaja = i;
                }
            } else if (i == 0){
            }
        }
        System.out.println("Pelin voitti pelaaja " + voittaja);
    }
    
}
