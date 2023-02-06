public class Verkkokortti implements ILaiteosa{

    private double hinta;

    public Verkkokortti (double h){
        hinta = h;
    }
    @Override
    public void setHinta(double h) {
        hinta = h;
    }

    @Override
    public double getHinta() {
        return hinta;
    }

}
