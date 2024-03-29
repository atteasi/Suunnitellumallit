package visitor;

public class Hahmo {
    private HahmoState state;
    private int exp;

    public Hahmo(){
        state = Ihminen.getInstance();
    }

    public void changeState(HahmoState hs) {
        state = hs;
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
