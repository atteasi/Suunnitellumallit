package visitor;

import java.util.Random;

public class Peikko implements VihollinenState {
    
    private Random rn = new Random();
    private static Peikko instance = null;

    public static Peikko getInstance(){
        if(instance == null){
            instance = new Peikko();
        }
        return instance;
    }

    private Peikko(){}

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void changeState(Vihollinen v, VihollinenState vs) {
       v.changeState(vs);
    }

    @Override
    public void hyokkaa(Vihollinen v) {
        System.out.println("Peikko lyö vihollista tikulla!");
        v.setExp(v.getExp() + 15);
        if(v.getExp() >= 60){
            changeState(v, Orkki.getInstance());
        }
    }

    @Override
    public void puhu(Vihollinen v) {
        System.out.println("Hähhähhäää!");

    }
    
    public int hyokkaysTodennakoisyys(Vihollinen v){
        return rn.nextInt(11-1+1) + 1;
    }
}
