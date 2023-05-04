package prototype;

public class Viisari implements Cloneable {

    private int aika;

    public Viisari(int aika) {
        this.aika = aika;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int getAika() {
        return aika;
    }

    public void setAika(int aika) {
        this.aika = aika;
    }
}
