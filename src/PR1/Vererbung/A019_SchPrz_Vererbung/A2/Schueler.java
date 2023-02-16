package PR1.Vererbung.A019_SchPrz_Vererbung.A2;
import java.util.ArrayList;
public class Schueler extends Person{
    private Tablet seinTablet;
    ArrayList<Tablet> meineTablets = new ArrayList<Tablet>();

    public Tablet getTablet() {
        return seinTablet;
    }
    public void setSeinTablet(Tablet pNeuesTablet) {
        this.meineTablets.add(pNeuesTablet);
    }
}
