package adapter;

public class Koira implements Adapter{

    private Kissa kissa;

    public Koira(Kissa kissa){
        this.kissa = kissa;
    }
    public void temppu() {
        kissa.teeTemppu();
    }
    
}
