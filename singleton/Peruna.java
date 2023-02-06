package singleton;

public class Peruna implements IRuoka{
    public Peruna(){
    }

    @Override
    public void valmista() {
        Lautanen l = Lautanen.getInstance();
        l.lisaaLautaselle(new Peruna());
    }
    
    public String toString(){
        return "Maittava peruna!";
    }
}
