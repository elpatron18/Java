package JavaGenerics.A023;

public class Triangle extends Figure{

    public Triangle(int id) {
        super(id);
    }

    @Override
    void draw() {
        System.out.println("Triangle " + id );
    }
}
