package state;

public class Main {
    public static void main(String args[]){
        Pokemon p = new Pokemon();


        while(p.getExp() < 300){
            p.hyokkaa();
            p.puolustaudu();
            p.puhu();
        }
        System.out.println("Charizard on nyt max levelillä!");
    }
}
