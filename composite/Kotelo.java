package composite;

public class Kotelo implements ILaiteosa {
    
    private double hinta;

    public Kotelo(double h){
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
