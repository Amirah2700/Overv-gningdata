public class covid19data {
    private String Region;
    private String Aldersgruppe;
    private double Death;
    private int tilfaelde;
    private int indlagteIntensiv;
    private int indlagte;
    private String dato;

    public covid19data(String Region, String Aldersgruppe, int tilfaelde, int Death, int indlagteIntensiv, int indlagte, String dato) {
        this.Region = Region;
        this.Aldersgruppe = Aldersgruppe;
        this.tilfaelde = tilfaelde;
        this.Death = Death;
        this.indlagteIntensiv = indlagteIntensiv;
        this.indlagte = indlagte;
        this.dato = dato;

    }

    @Override
    public String toString() {
        return "\n [Region: " + Region + " - Aldersgruppe: " + Aldersgruppe + " - Tilfælde: " + tilfaelde + " - Død: " + Death + " - Indlagte Intensiv: " + indlagteIntensiv + " - Indlagte: " + indlagte + " - Dato: " + dato + "]";
    }
}
