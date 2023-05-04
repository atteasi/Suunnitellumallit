package prototype;

public class Kello implements Cloneable {

    private Viisari tuntiviisari;
    private Viisari minuuttiviisari;

    public Kello(int tunti, int minsa) {
        tuntiviisari = new Viisari(tunti);
        minuuttiviisari = new Viisari(minsa);
    }

    public Kello syvaClone() {

        Kello k = null;

        try {
            k = (Kello)super.clone();
            k.tuntiviisari = (Viisari)tuntiviisari.clone();
            k.minuuttiviisari = (Viisari)minuuttiviisari.clone();
        } catch (CloneNotSupportedException e) {}

        return k;
    }

    public Kello matalaClone() {
        try {
            return (Kello) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void setAika(int tunti, int minsa) {
        tuntiviisari.setAika(tunti);
        minuuttiviisari.setAika(minsa);
    }

    public String toString() {
        return tuntiviisari.getAika() + ":" + minuuttiviisari.getAika();
    }
}