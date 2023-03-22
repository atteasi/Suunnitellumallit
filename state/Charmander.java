package state;

public class Charmander implements PokemonState{

    private static Charmander instance = null;

    private Charmander(){}

    public static Charmander getInstance() {
        if (instance == null) {
            instance = new Charmander();
        }
        return instance;
    }

    @Override
    public void hyokkaa(Pokemon p) {
        System.out.println("Charmander hyökkää emberillä!");
        p.setExp(p.getExp() + 10);
        if(p.getExp() > 50){
            changeState(p, Charmeleon.getInstance());
        }

    }

    @Override
    public void puolustaudu(Pokemon p) {
        System.out.println("Charmander puolustautuu hardenilla!");
        p.setExp(p.getExp() + 5);
        if(p.getExp() > 50){
            changeState(p, Charmeleon.getInstance());
        }
    }

    @Override
    public void puhu(Pokemon p) {
        System.out.println("Charmander!!");
        p.setExp(p.getExp() + 15);
        if(p.getExp() > 50){
            changeState(p, Charmeleon.getInstance());
        }
    }

    @Override
    public void changeState(Pokemon p, PokemonState ps) {
        p.changeState(ps);
    }
    
}
