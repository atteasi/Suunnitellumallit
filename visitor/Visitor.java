package visitor;

public interface Visitor {
    public void visit(Ihminen i);
    public void visit(Ritari r);
    public void visit(Peikko p);
    public void visit(Orkki o);
}
