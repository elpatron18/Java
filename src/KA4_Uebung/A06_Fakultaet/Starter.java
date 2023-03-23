package KA4_Uebung.A06_Fakultaet;

public class Starter {

    public static int fakultaet(int n){
        if (n == 1) return n;
        else return n * fakultaet(n-1);
    }

    public static void main(String[] args) {

        System.out.println(fakultaet(3));

    }

}
