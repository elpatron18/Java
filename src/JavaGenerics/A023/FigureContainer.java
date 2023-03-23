package JavaGenerics.A023;

import java.util.Iterator;
import java.util.Vector;

public class FigureContainer {

    Vector<Figure> figures = new Vector<>();
    void add(Figure f) {
        figures.add(f);
    }
    Figure getFigure(int id) {
        return figures.get(id);
    }
    boolean containsFig(int id) {
        for (Figure f : figures) {
            if (f.id == id) {
                return true;
            }
        }
        return false;
    }

    Iterator<Figure> iterator() {
        return figures.iterator();
    }

    int size() {
        return figures.size();
    }

    void drawAll() {
        for (Figure f : figures) {
            f.draw();
        }
    }

}
