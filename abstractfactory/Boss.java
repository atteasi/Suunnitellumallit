public class Boss implements Vaatetehdas{

    private String vaateMerkki = "Boss";

    public Farmarit pueFarmarit(){
        return new Farmarit(vaateMerkki);
    }

    public Paita puePaita(){
        return new Paita(vaateMerkki);
    }
    
    public Lippis pueLippis(){
        return new Lippis(vaateMerkki);
    }
    
    public Kengat pueKengat(){
        return new Kengat(vaateMerkki);
    }
}
