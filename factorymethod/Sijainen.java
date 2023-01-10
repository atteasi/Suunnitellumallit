package factorymethod;

public class Sijainen extends AterioivaOtus{
    public Juoma createJuoma(){
        return new Piima();
    }

    @Override
    public Ruoka createRuoka() {
        return new Kasvispyorykat();
    };
}
