package composite;

public class Muistipiiri implements ILaiteosa {

    private double hinta;

    public Muistipiiri(double h){
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
