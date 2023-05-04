package prototype;

public class Main {
    public static void main(String[] args) {

        //Syvä:
        System.out.println("Syvä kopiointi:");
        Kello kello1 = new Kello(14, 20);
        System.out.println("Kello on: " + kello1);

        Kello kello2 = kello1.syvaClone();
        System.out.println("Kopiokello on: " + kello2);

        kello1.setAika(18, 59);
        kello2.setAika(23, 11);

        System.out.println("Kopiokello on: " + kello2);
        System.out.println("Kello on: " + kello1 + "\n");


        //Matala:
        System.out.println("Matala kopiointi:");
        Kello matala1 = new Kello(11, 12);
        System.out.println("Kello on: " + matala1);

        Kello matala2 = matala1.matalaClone();
        System.out.println("Kopiokello on: " + matala2);

        matala1.setAika(21, 42);

        System.out.println("Kello on: " + matala1);
        System.out.println("Kopiokello on: " + matala2);

        matala2.setAika(5, 30);

        System.out.println("Kello on: " + matala1);
        System.out.println("Kopiokello on: " + matala2);
    }
}
