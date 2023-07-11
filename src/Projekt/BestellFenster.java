package Projekt;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.text.DecimalFormat;

public class BestellFenster extends JFrame {

    public JPanel gallerie;
    public Warenkorb warenkorb;

    DecimalFormat euro = new DecimalFormat("0.00€");

    public BestellFenster(String title) throws HeadlessException {

        setTitle(title);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0, 0, 800, 500);

        JLabel label = new JLabel("Willkommen im Restaurant!");
        add(label, BorderLayout.NORTH);

        JPanel mitte = new JPanel();

        gallerie = new JPanel();
        gallerie.setLayout(new FlowLayout());

        warenkorb = new Warenkorb();

        mitte.add(gallerie, BorderLayout.WEST);
        mitte.add(warenkorb, BorderLayout.EAST);


        add(mitte, BorderLayout.CENTER);
        JPanel bottomPanel = new JPanel();
        JButton cancelButton = new JButton("Abbrechen");
        bottomPanel.add(cancelButton);
        add(bottomPanel, BorderLayout.SOUTH);

        setExtendedState(JFrame.MAXIMIZED_BOTH);

        setVisible(true);
    }

    public void gerichtHinzufuegen(Gericht g) {

        ImageIcon icon = new ImageIcon("Bilder/" + g.bildadresse);

        JButton button = new JButton("<html>" + g.name + "<br>" + euro.format(g.preis) + "</html>", icon);
        button.setPreferredSize(new Dimension(100, 100));

        button.addActionListener(e -> warenkorb.addToWarenkorb(g.name, g.preis));

        button.setRolloverIcon(icon);
        gallerie.add(button);
    }

}
