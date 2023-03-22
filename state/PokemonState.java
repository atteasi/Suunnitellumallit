package state;

public interface PokemonState {
    public void hyokkaa(Pokemon p);
    public void puolustaudu(Pokemon p);
    public void puhu(Pokemon p);

    public void changeState(Pokemon p, PokemonState ps);
}
