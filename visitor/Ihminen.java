package visitor;

import java.util.Random;

public class Ihminen implements HahmoState{

    private Random rn = new Random();
    private static Ihminen instance = null;

    public static Ihminen getInstance(){
        if(instance == null){
            instance = new Ihminen();
        }
        return instance;
    }

    private Ihminen(){}

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void changeState(Hahmo h, HahmoState hs) {
       h.changeState(hs);
    }

    @Override
    public void hyokkaa(Hahmo h) {
        System.out.println("Ihminen lyö vihollista nyrkillä!");
        h.setExp(h.getExp() + 15);
        if(h.getExp() >= 75){
            changeState(h, Ritari.getInstance());
        }
    }

    @Override
    public void puhu(Hahmo h) {
        System.out.println("Siitäs sait!");
    }
    
    public int hyokkaysTodennakoisyys(Hahmo h){
        return rn.nextInt(10-1+1) + 1;
    }
}
