package visitor;

public class Main {
    
    public static void main(String args[]){
        BonusVisitor bv = new BonusVisitor();
        Vihollinen vihu = new Vihollinen();
        Hahmo hahmo = new Hahmo();

        int vihuHyokkays;
        int hahmoHyokkays;

        for(int i = 0; i < 10; i++){
            vihuHyokkays = vihu.hyokkaysTodennakoisyys();
            hahmoHyokkays = hahmo.hyokkaysTodennakoisyys();

            if(vihuHyokkays > hahmoHyokkays){
                vihu.hyokkaa();
                vihu.puhu();
                vihu.accept(bv);
            } else if(hahmoHyokkays >= vihuHyokkays){
                hahmo.hyokkaa();
                hahmo.puhu();
                hahmo.accept(bv);
            }
        }

        if(bv.getHahmoBonus() > bv.getVihollinenBonus()){
            System.out.println("Hahmo voitti bonuspisteissä!");
        } else {
            System.out.println("Vihollinen voitti bonuspisteissä!");
        }

    }
}
