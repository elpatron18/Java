package PR1.PR1_Aufgaben.A002_Ueberladung;

public class Punkt {

    private double x, y;
    private int norm = 1;

    public void setNorm(int i){
        this.norm = i;
    }

    public Punkt(double x, double y) {}


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
    public static double dist(Punkt a, Punkt b, int norm) {
        double distance = 0;
        if (norm == 1) distance = Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
        if (norm == 2) distance = Math.abs(a.getX()-b.getX()) + Math.abs(a.getY()-b.getY());

        return distance;
    }


}
