package visitor;

public class Vihollinen {
    private VihollinenState state;
    private int exp;

    public Vihollinen(){
        state = Peikko.getInstance();
    }

    public void changeState(VihollinenState vs) {
        state = vs;
    }

    public void hyokkaa() {
        state.hyokkaa(this);
    }

    public void puhu() {
        state.puhu(this);
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void accept(Visitor visitor){
        state.accept(visitor);
    }
    
    public int hyokkaysTodennakoisyys(){
        return state.hyokkaysTodennakoisyys(this);
    }
}
