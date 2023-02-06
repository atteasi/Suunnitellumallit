public class Prosessori implements ILaiteosa{

    private double hinta;

    public Prosessori(double h){
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
