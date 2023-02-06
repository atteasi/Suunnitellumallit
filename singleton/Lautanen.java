package singleton;

import java.util.ArrayList;

public class Lautanen {
    
    private static Lautanen instanssi;
    private ArrayList<IRuoka> sisalto;

    public Lautanen(){
        sisalto = new ArrayList<>();
    }

    public static Lautanen getInstance() {
		if (instanssi == null){
			instanssi = new Lautanen();	
		}
		return instanssi;
    }

    public void lisaaLautaselle(IRuoka r){
        sisalto.add(r);
    }

    public String listaaSisalto(){
        String sis = "Lautasellani on: \n";
        for(IRuoka r : sisalto){
            sis += r.toString() + "\n";
        }
        return sis;
    }
}

