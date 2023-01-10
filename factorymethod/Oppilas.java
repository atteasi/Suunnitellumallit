package factorymethod;

public class Oppilas extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Maito();
    }

    @Override
    public Ruoka createRuoka() {
        return new Juustohampurilainen();
    };

}
