package Projekt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;

public class Bestellfenster extends JFrame{

    JTextField txtRabattcode;
    JTable table;
    JScrollPane gallerie;
    JPanel gallerie_panel;
    Warenkorb warenkorb;
    DecimalFormat euro = new DecimalFormat("0.00€");

    public static void main(String[] args) {

    }

    public Bestellfenster(String title) {
        super(title);
        initialize();
        setVisible(true);
        LoggerUtil.log("Bestellfenster geöffnet");
    }


    private void initialize() {

        setBounds(100, 100, 801, 533);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Hier wird die Methode aufgerufen, wenn das JFrame geschlossen wird
                try {
                    Restaurant.dbVerbindung.close();
                    LoggerUtil.log("Bestellfenster geschlossen");
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        JPanel buttons = new JPanel();
        getContentPane().add(buttons, BorderLayout.SOUTH);

        JButton btnKaufen = new JButton("Kaufen");
        btnKaufen.addActionListener(e -> warenkorb.kaufen(Restaurant.dbVerbindung));
        buttons.add(btnKaufen);

        JButton btnAbbrechen = new JButton("Abbrechen");
        btnAbbrechen.addActionListener(e -> warenkorb.reset());
        buttons.add(btnAbbrechen);

        JLabel lbRabattcode = new JLabel("Rabattcode:");
        buttons.add(lbRabattcode);

        txtRabattcode = new JTextField();
        JButton btnRabattcode = new JButton("Enter");
        btnRabattcode.addActionListener(e -> {
            System.out.println("Rabatt" + txtRabattcode.getText());
            checkRabattcode(txtRabattcode.getText());
        });

        buttons.add(txtRabattcode);
        buttons.add(btnRabattcode);
        txtRabattcode.setColumns(10);

        JPanel mitte = new JPanel();
        getContentPane().add(mitte, BorderLayout.CENTER);
        mitte.setLayout(new GridLayout(1, 0, 0, 0));

        gallerie = new JScrollPane();
        gallerie.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        gallerie.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        gallerie.setBounds(0, 0, 1200, 950);
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

        JPanel panel = new JPanel();

        JButton button = new JButton(
                "<html>" +
                "<div style='background-color: #fefefe; width: 115px; height: 115px;display:flex;' justify-content:center; align-items:center> "
                + "<img src='" + g.bildadresse + "' width='80' height='80'> <br>"
                + g.name + "<br>" + euro.format(g.preis) +
                "</div>"+
                "</html>");
        button.setPreferredSize(new Dimension(150, 150));

        button.addActionListener(e -> warenkorb.addToWarenkorb(g));

        //button.setIcon(scaledIcon);
        panel.add(button);
        gallerie_panel.add(panel);
    }
    public void checkRabattcode(String name) {
        double rabatt = 0;
        for (Rabattcode r : Restaurant.codes) if (r.name.equals(name)) {
            //System.out.println("Code gefunden");
            rabatt = r.faktor;
        }
        if (rabatt != 0) warenkorb.rabattAnwenden(rabatt);
        LoggerUtil.log("Rabattcode " + name + " überprüfen: " + (rabatt != 0));
    }

}
