package state;

public class Charmeleon implements PokemonState{
    
    private static Charmeleon instance = null;

    private Charmeleon(){}

    public static Charmeleon getInstance() {
        if (instance == null) {
            instance = new Charmeleon();
        }
        return instance;
    }
    @Override
    public void hyokkaa(Pokemon p) {
        System.out.println("Charmeleon hyökkää slashilla!");
        p.setExp(p.getExp() + 10);
        if(p.getExp() > 100){
            changeState(p, Charizard.getInstance());
        }
    }

    @Override
    public void puolustaudu(Pokemon p) {
        System.out.println("Charmander puolustautuu screechillä!");
        p.setExp(p.getExp() + 5);
        if(p.getExp() > 100){
            changeState(p, Charizard.getInstance());
        }
    }

    @Override
    public void puhu(Pokemon p) {
        System.out.println("Charmeleon!!");
        p.setExp(p.getExp() + 15);
        if(p.getExp() > 100){
            changeState(p, Charizard.getInstance());
        }
    }

    @Override
    public void changeState(Pokemon p, PokemonState ps) {
        p.changeState(ps);
    }
    
}
