package singleton;

public class Porkkana implements IRuoka{
    public Porkkana(){
    }

    @Override
    public void valmista() {
        Lautanen l = Lautanen.getInstance();
        l.lisaaLautaselle(new Porkkana());
    }
    
    public String toString(){
        return "Rouskuva porkkana!";
    }
}
