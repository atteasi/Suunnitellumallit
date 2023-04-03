package builder;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        HesburgerBuilder hb = new HesburgerBuilder();
        McDonaldsBuilder mb = new McDonaldsBuilder();
        hb.luoBurgeri();
        mb.luoBurgeri();

        ArrayList hesburgerHamppari = hb.getBurger();
        StringBuilder mcDonaldsHamppari = mb.getBurger();
        System.out.println("Hesburgerin hampparissa on: " + hesburgerHamppari.toString());
        System.out.println("McDonaldsin Big Macissa on: " + mcDonaldsHamppari.toString());
        
    }
}
