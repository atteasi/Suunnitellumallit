package composite;

public class Naytonohjain implements ILaiteosa {

    private double hinta;

    public Naytonohjain (double h){
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
