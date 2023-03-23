package JavaGenerics.A023;

public class Square extends Figure{

    public Square(int id) {
        super(id);
    }

    @Override
    void draw() {
        System.out.println("Square " + id );
    }
}
