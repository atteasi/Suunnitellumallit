package visitor;

public interface VihollinenState {
    public void accept(Visitor visitor);
    public void changeState(Vihollinen v, VihollinenState vs);
    public int hyokkaysTodennakoisyys(Vihollinen v);
    public void hyokkaa(Vihollinen vihollinen);
    public void puhu(Vihollinen vihollinen);
}
