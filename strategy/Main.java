package strategy;

public class Main {
    public static void main(String[] args){
        ListConverter st1 = new Strategia1();
        ListConverter st2 = new Strategia2();
        ListConverter st3 = new Strategia3();

        Context ct = new Context();

        ct.setConverter(st1);
        ct.print();

        ct.setConverter(st2);
        ct.print();

        ct.setConverter(st3);
        ct.print();
    }
}
