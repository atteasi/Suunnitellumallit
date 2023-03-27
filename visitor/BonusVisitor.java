package visitor;

public class BonusVisitor implements Visitor {

    private static int vihollinenBonus = 0;
    private static int hahmoBonus = 0;

    @Override
    public void visit(Ihminen i) {
        hahmoBonus += 5;
    }

    @Override
    public void visit(Ritari r) {
        hahmoBonus += 10;
    }

    @Override
    public void visit(Peikko p) {
        vihollinenBonus += 5;
    }

    @Override
    public void visit(Orkki o) {
        vihollinenBonus += 10;
    }

    public static int getHahmoBonus() {
        return hahmoBonus;
    }
    
    public static int getVihollinenBonus() {
        return vihollinenBonus;
    }
    
}
