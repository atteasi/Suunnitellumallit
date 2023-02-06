package singleton;

public class Keittio {
    public Keittio(){

    }

    public void valmistaAteria(){
        IRuoka po = new Porkkana();
        IRuoka pe = new Peruna();
        IRuoka pi = new Pihvi();

        po.valmista();
        pe.valmista();
        pi.valmista();
    }
}
