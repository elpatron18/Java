package PR1.PR1_Aufgaben.A011_RekursionFibbonaci;

public class Starter {

        public static void main(String[] args) {
            System.out.println(fibonacci(3));
        }

        public static int fibonacci(int n) {
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }



}