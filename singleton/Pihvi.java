package singleton;

public class Pihvi implements IRuoka{
    public Pihvi(){
    }

    @Override
    public void valmista() {
        Lautanen l = Lautanen.getInstance();
        l.lisaaLautaselle(new Pihvi());
    }
    
    public String toString(){
        return "Mehukas pihvi!";
    }
}