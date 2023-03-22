package state;

public class Pokemon {
    private PokemonState state;
    private int exp = 0;

    public Pokemon() {
        state = Charmander.getInstance();
    }

    public void hyokkaa() {
        state.hyokkaa(this);
    }

    public void puolustaudu() {
        state.puolustaudu(this);
    }

    public void puhu() {
        state.puhu(this);
    }

    protected void changeState(PokemonState ps) {
        state = ps;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
