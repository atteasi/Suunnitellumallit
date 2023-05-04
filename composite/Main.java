package composite;

import java.util.ArrayList;
public class Main {
    public static void main(String args[]){
        double tietokoneenHinta = 0.00;
        ILaiteosa kotelo = new Kotelo(150.00);
        ILaiteosa emolevy = new Emolevy(149.99);
        ILaiteosa muistipiiri = new Muistipiiri(50.00);
        ILaiteosa naytonohjain = new Naytonohjain(499.99);
        ILaiteosa prosessori = new Prosessori(399.99);
        ILaiteosa verkkokortti = new Verkkokortti(49.99); 
        ArrayList<ILaiteosa> tietokone = new ArrayList<>();

        tietokone.add(verkkokortti);
        tietokone.add(kotelo);
        tietokone.add(muistipiiri);
        tietokone.add(naytonohjain);
        tietokone.add(emolevy);
        tietokone.add(prosessori);

        for(ILaiteosa i : tietokone) {
            tietokoneenHinta += i.getHinta();
        }

        System.out.println("Tietokoneen hinnaksi tuli " + tietokoneenHinta + " euroa.");
    }
}
