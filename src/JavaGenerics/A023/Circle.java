package JavaGenerics.A023;

public class Circle extends Figure{

    public Circle(int id) {
        super(id);
    }

    @Override
    void draw() {
        System.out.println("Circle " + id );
    }
}
