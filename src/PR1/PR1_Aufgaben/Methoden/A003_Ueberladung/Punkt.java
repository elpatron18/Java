package PR1.PR1_Aufgaben.Methoden.A003_Ueberladung;

public class Punkt {

    private double x, y;

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public static boolean gleich(Punkt a, Punkt b) {
        boolean g = false;
        if (a.getX() == b.getX() && a.getY() == b.getY()) g = true;
        return g;
    }
    public void drucken(){
        System.out.println("X:" + this.getX() + " Y: " + this.getY());
    }
    public void drucken(String t){
        System.out.println("X:" + this.getX() + " Y: " + this.getY() + t);
    }

    public void spiegelnX(){
        this.setX(this.getX() * -1);
    }
    public void spiegelnY(){
        this.setY(this.getY() * -1);
    }
    public static double dist(Punkt a, Punkt b, Norm norm) {
        double distance = 0;
        if (norm == Norm.SVP) distance = Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
        if (norm == Norm.GERADE) distance = Math.abs(a.getX()-b.getX()) + Math.abs(a.getY()-b.getY());

        return distance;
    }

    public static void main(String[] args) {
        Punkt p1 = new Punkt(0, 0);
        Punkt p2 = new Punkt(1, 1);

        System.out.println( dist(p1, p2, Norm.SVP));
        System.out.println( dist(p1, p2, Norm.GERADE));
    }


}
