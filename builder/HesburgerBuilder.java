package builder;

import java.util.ArrayList;

public class HesburgerBuilder {
    private ArrayList hampurilaisOsat = new ArrayList<>();

    public void lisaaSampyla(){
        hampurilaisOsat.add(new Sampyla());
    }

    public void lisaaPihvit(){
        hampurilaisOsat.add(new Pihvi("Ylempi Pihvi"));
        hampurilaisOsat.add(new Pihvi("Alempi pihvi"));
    }
    
    public void lisaaJuusto(){
        hampurilaisOsat.add(new Juusto());
    }

    public void lisaaSalaatti(){
        hampurilaisOsat.add(new Salaatti());
    }

    public void lisaaTomaatti(){
        hampurilaisOsat.add(new Tomaatti());
    }

    public void luoBurgeri(){
        lisaaSampyla();
        lisaaPihvit();
        lisaaSalaatti();
        lisaaJuusto();
        lisaaTomaatti();
        lisaaMajoneesi();
    }

    private void lisaaMajoneesi() {
        hampurilaisOsat.add(new Majoneesi("Paprika"));
    }

    public ArrayList getBurger(){
        return hampurilaisOsat;
    }
}
