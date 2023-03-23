package JavaGenerics.A023;

public class FigureContainerTestDriver {
    public static void main(String[] args) {

        FigureContainer container = new FigureContainer();

        for (int i = 0; i < 100; i++) {
            if (i%3 == 0) container.add(new Circle(i));
            if (i%3 == 1) container.add(new Square(i));
            if (i%3 == 2) container.add(new Triangle(i));
        }
        container.drawAll();

        System.out.println("Size: " + container.size());
    }
}
