package PR1.Exeptions.A021;

public class starter {

    public static void main(String[] args) {

        Vergleichbar v = new VInteger(5);
        Vergleichbar v2 = new VInteger(6);

        System.out.println(v.vergleichenMit(v2));

        Vergleichbar [] arr = new Vergleichbar[2];
        arr[0] = v;
        arr[1] = v2;

        System.out.println(NuetzlicheFunktionen.kleinsteElement(arr));

    }

}
