package adapter;

public class Main {
    public static void main(String[] args){
        Kissa k = new Kissa();
        Koira ko = new Koira(k);

        k.teeTemppu();
        ko.temppu();
    }
}
