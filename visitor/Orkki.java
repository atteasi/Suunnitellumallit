package visitor;

import java.util.Random;

public class Orkki implements VihollinenState{
    private Random rn = new Random();
    private static Orkki instance = null;

    public static Orkki getInstance(){
        if(instance == null){
            instance = new Orkki();
        }
        return instance;
    }

    private Orkki(){}

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void changeState(Vihollinen v, VihollinenState vs) {
       v.changeState(vs);
    }

    public void hyokkaa(Vihollinen v) {
        System.out.println("Örkki lyö vihollista nuijalla!!");
        v.setExp(v.getExp() + 10);
    }

    public void puhu(Vihollinen v) {
        System.out.println("Olitpas helppo vastus!!");

    }
    
    public int hyokkaysTodennakoisyys(Vihollinen v){
        return rn.nextInt(18-5+1) + 5;
    }
}
