package builder;

public class McDonaldsBuilder {
    private StringBuilder hampurilaisOsat = new StringBuilder();

    public McDonaldsBuilder(){}

    public void luoBurgeri(){
        lisaaSampyla();
        lisaaPihvit();
        lisaaSalaatti();
        lisaaJuusto();
        lisaaTomaatti();
        lisaaKastike();
    }

    private void lisaaKastike() {
        hampurilaisOsat.append("Big Mac soossi");
    }

    private void lisaaTomaatti() {
        hampurilaisOsat.append("Tomaatti ");
    }

    private void lisaaJuusto() {
        hampurilaisOsat.append("Juusto ");
    }

    private void lisaaSalaatti() {
        hampurilaisOsat.append("Salaatti ");
    }

    private void lisaaPihvit() {
        hampurilaisOsat.append("Ylempi Pihvi ");
        hampurilaisOsat.append("Alempi Pihvi ");
    }

    private void lisaaSampyla() {
        hampurilaisOsat.append("Sämpylä (mukaan lukien välikerros!) ");
    }

    public StringBuilder getBurger(){
        return hampurilaisOsat;
    }
}
