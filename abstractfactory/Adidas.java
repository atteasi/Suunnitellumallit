public class Adidas implements Vaatetehdas{
   
    private String vaateMerkki = "Adidas";
    
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
