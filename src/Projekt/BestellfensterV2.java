package Projekt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class BestellfensterV2 extends JFrame {

    JTextField txtRabattcode;
    JTable table;
    JScrollPane gallerie;
    JPanel gallerie_panel;
    Warenkorb warenkorb;

    DecimalFormat euro = new DecimalFormat("0.00€");

    public static void main(String[] args) {
        BestellfensterV2 bf = new BestellfensterV2("Test");
    }

    public BestellfensterV2(String title) {
        super(title);
        initialize();
        setVisible(true);
    }

    private void initialize() {

        setBounds(100, 100, 801, 533);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        JPanel buttons = new JPanel();
        getContentPane().add(buttons, BorderLayout.SOUTH);

        JButton btnKaufen = new JButton("Kaufen");
        btnKaufen.addActionListener(e -> warenkorb.reset());
        buttons.add(btnKaufen);

        JButton btnAbbrechen = new JButton("Abbrechen");
        btnAbbrechen.addActionListener(e -> warenkorb.reset());
        buttons.add(btnAbbrechen);

        JLabel lbRabattcode = new JLabel("Rabattcode:");
        buttons.add(lbRabattcode);

        txtRabattcode = new JTextField();
        buttons.add(txtRabattcode);
        txtRabattcode.setColumns(10);

        JPanel mitte = new JPanel();
        getContentPane().add(mitte, BorderLayout.CENTER);
        mitte.setLayout(new GridLayout(1, 0, 0, 0));

        gallerie = new JScrollPane();
        gallerie.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        gallerie.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        gallerie_panel = new JPanel();
        gallerie_panel.setLayout(new GridLayout(0, 4, 10, 10));
        gallerie.setViewportView(gallerie_panel);
        mitte.add(gallerie);

        JScrollPane spWarenkorb = new JScrollPane();
        mitte.add(spWarenkorb);

        warenkorb = new Warenkorb();
        spWarenkorb.setViewportView(warenkorb);

        JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.NORTH);
        panel.setLayout(new GridLayout(0, 2, 0, 0));

        JLabel lblNewLabel = new JLabel("Willkommen bei Antonio's Burger Palace");
        panel.add(lblNewLabel);

        JLabel warenkorb_label = new JLabel("Warenkorb");
        panel.add(warenkorb_label);
    }

    public void gerichtHinzufuegen(Gericht g) {

        ImageIcon icon = new ImageIcon("Bilder/" + g.bildadresse);

        JButton button = new JButton("<html>" + g.name + "<br>" + euro.format(g.preis) + "</html>", icon);
        button.setPreferredSize(new Dimension(100, 100));

        button.addActionListener(e -> warenkorb.addToWarenkorb(g.name, g.preis));

        button.setRolloverIcon(icon);
        gallerie_panel.add(button);
    }
}
