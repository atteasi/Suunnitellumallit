import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    
    public static void main(String args[]){
        Vaatetehdas vt = null;
        Class c = null;
        Properties properties = new Properties();
        try {
            properties.load(
                new FileInputStream("tehdas.properties"));
        } catch (IOException e) {e.printStackTrace();}
        try{
            c = Class.forName(properties.getProperty("tehdas"));
            vt = (Vaatetehdas)c.getDeclaredConstructor().newInstance();
        } catch (Exception e){e.printStackTrace();}

        Ihminen jasper = new Ihminen(vt, "Jasper");

        jasper.pueFarmarit();
        jasper.pueKengat();
        jasper.puePaita();
        jasper.pueLippis();

        System.out.print(jasper);
    }
}
