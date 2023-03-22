package state;

public class Charizard implements PokemonState{

    private static Charizard instance = null;

    private Charizard(){}

    public static Charizard getInstance() {
        if (instance == null) {
            instance = new Charizard();
        }
        return instance;
    }

    @Override
    public void hyokkaa(Pokemon p) {
        System.out.println("Charizard hyökkää flame throwerilla!");
        p.setExp(p.getExp() + 10);
    }

    @Override
    public void puolustaudu(Pokemon p) {
        System.out.println("Charmander puolustautuu smoke screenillä!");
        p.setExp(p.getExp() + 5);
    }

    @Override
    public void puhu(Pokemon p) {
        System.out.println("Charizard!!!");
        p.setExp(p.getExp() + 15);
    }

    @Override
    public void changeState(Pokemon p, PokemonState ps) {
       p.changeState(ps);
    }
    
}

