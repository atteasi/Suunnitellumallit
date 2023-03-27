package visitor;

import java.util.Random;

public class Ritari implements HahmoState{
    private Random rn = new Random();
    private static Ritari instance = null;

    public static Ritari getInstance(){
        if(instance == null){
            instance = new Ritari();
        }
        return instance;
    }

    private Ritari(){}

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
        System.out.println("Ritari lyö vihollista miekalla!!");
        h.setExp(h.getExp() + 10);
    }

    @Override
    public void puhu(Hahmo h) {
        System.out.println("Kuninkaan puolesta!");
    }
    
   
    public int hyokkaysTodennakoisyys(Hahmo h){
        return rn.nextInt(20-3+1) + 5;
    }


}
