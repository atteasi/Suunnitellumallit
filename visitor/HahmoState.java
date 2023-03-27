package visitor;

public interface HahmoState {
    public void accept(Visitor visitor);
    public void hyokkaa(Hahmo h);
    public void puhu(Hahmo h);
    public int hyokkaysTodennakoisyys(Hahmo h);
    public void changeState(Hahmo h, HahmoState hs);
}
