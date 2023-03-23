package Exeptions.A021;

public class NuetzlicheFunktionen {

    public static Vergleichbar kleinsteElement (Vergleichbar[] elemente) {
        Vergleichbar kleinstes = elemente[0];
        for (Vergleichbar v : elemente) if (v.vergleichenMit(kleinstes) == -1) kleinstes = v;
        return kleinstes;
    }

}
