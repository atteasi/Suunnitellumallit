public class Ihminen{
    private Vaatetehdas vt;
    private String nimi;
    private Kengat k;
    private Farmarit f;
    private Paita p;
    private Lippis l;

    public Ihminen(Vaatetehdas vt, String n){
        this.vt = vt;
        nimi = n;
    }

    public void pueFarmarit(){
        f = vt.pueFarmarit();
    }

    public void puePaita(){
        p = vt.puePaita();
    }

    public void pueKengat(){
        k = vt.pueKengat();
    }

    public void pueLippis(){
        l = vt.pueLippis();
    }

    public String toString(){
        String toString = "Nimeni on " + nimi + ", ja minulla on päälläni:\n";
        if(k != null){
            toString += "kengät merkkiä " + k.getMerkki() +"\n";
        }
        if (f != null){
            toString += "farmarit merkkiä " + f.getMerkki() + "\n";
        }
        if (p != null){
            toString += "paita merkkiä " + p.getMerkki() + "\n";
        }
        if (l != null){
            toString += "lippis merkkiä " + l.getMerkki();
        }
        if(l == null && p == null && k == null && f == null){
            toString += "Ei mitään";
        }
        return toString;
    }
}

