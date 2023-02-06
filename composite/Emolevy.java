public class Emolevy implements ILaiteosa{


    private double hinta;

    public Emolevy(double h){
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
