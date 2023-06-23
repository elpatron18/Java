package Lambda.Teiluebungen;

public class LambdaTestDruck{

    public static void main(String[] args) {
        Drucker p= (s, t) -> {
            t = t.toUpperCase();
            System.out.println(s+ " "+ t);
        };

        p.ausdrucken("ADVler sind", "auch in Krisen ruhig und gelassen");
    }

}
