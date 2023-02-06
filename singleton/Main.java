package singleton;

public class Main {
    public static void main(String args[]){
        Keittio k = new Keittio();
        k.valmistaAteria();

        Lautanen l = Lautanen.getInstance();
        System.out.println(l.listaaSisalto());
    }
}
