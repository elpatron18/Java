package GUI.Superclass;

import javax.swing.*;
import java.awt.*;

public class WellisOwnFrame extends JFrame {

    public WellisOwnFrame(String title) throws HeadlessException {
        super(title);
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new FlowLayout());

        JLabel lb = new JLabel("Hello ADV World");
        this.add(lb);
    }
}
