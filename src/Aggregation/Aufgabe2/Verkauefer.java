package Aggregation.Aufgabe2;

public class Verkauefer {
    public static Artikel [] sortiment = new Artikel[100];

    public double getPreis(int i) {
        return sortiment[i].getPreis();
    }
    public void setPreis(int i, double p) {
        sortiment[i].setPreis(p);
    }
    public void kaufen(int i, int b) {
        sortiment[i].kaufen(b);
    }
    public void rabatt(int s, int d) {
        for (Artikel a : sortiment) if (a.getBestand() > s)
            a.setPreis(a.getPreis() - a.getPreis() *  (d / 100));
    }
    public void erweitereSortiment(int n) {
        Artikel [] neuesSortiment = new Artikel[sortiment.length + n];
        System.arraycopy(
                sortiment, 0, neuesSortiment, 0, sortiment.length
        );
        sortiment = neuesSortiment;
    }

    public static void main(String[] args) {
        Verkauefer v = new Verkauefer();
        v.erweitereSortiment(10);

        System.out.println(sortiment.length);
    }

}
