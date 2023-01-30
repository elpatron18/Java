package PR1.KA4_Uebung.A03;

public class Konto {

    private double stand;
    private String inhaber;

    public Konto(double stand, String inhaber) {
        this.stand = stand;
        this.inhaber = inhaber;
    }

    public double getStand() {
        return stand;
    }

    public void setStand(double stand) {
        this.stand = stand;
    }

    public String getInhaber() {
        return inhaber;
    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }
}
