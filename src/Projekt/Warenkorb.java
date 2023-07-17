package Projekt;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;

public class Warenkorb extends JPanel {

    JTable wkItems;
    DefaultTableModel tableModel;
    double summe = 0;
    JLabel total;

    boolean reduziert = false;

    DecimalFormat euro = new DecimalFormat("0.00€");

    ArrayList<Gericht> gerichte = new ArrayList<>();
    double rabattcode = 0;

    public Warenkorb() {
        setLayout(new BorderLayout());

        //JLabel ueberschrift = new JLabel("Warenkorb");

        tableModel = new DefaultTableModel();
        tableModel.addColumn("Name");
        tableModel.addColumn("Preis");

        wkItems = new JTable(tableModel);
        wkItems.setEnabled(false);
        total = new JLabel("Summe: " + euro.format(summe));

        //add(ueberschrift, BorderLayout.NORTH);
        add(wkItems, BorderLayout.CENTER);
        add(total, BorderLayout.SOUTH);
    }

    public void addToWarenkorb(Gericht g) {
        gerichte.add(g);
        summe += g.preis;
        updateSumme();
        tableModel.addRow(new Object[]{g.name, euro.format(g.preis)});
        LoggerUtil.log("Gericht zum Warenkorb hinzugefügt: " + g.name);
    }

    public void reset() {
        gerichte.clear();
        rabattcode = 0;
        summe = 0;
        reduziert = false;
        updateSumme();
        tableModel.setRowCount(0);
        LoggerUtil.log("Warenkorb zurückgesetzt");
    }

    public void updateSumme() {
        total.setText("Summe: " + euro.format(summe));
    }

    public void rabattAnwenden(double wert) {
        if (!reduziert) {
            rabattcode = wert;
            summe *= 1 - wert;
            total.setText(total.getText() + " - " + wert * 100 + "% Rabatt =  " + euro.format(summe *= 1 - wert));
            reduziert = true;
        }
    }

    public void kaufen(Connection c) {
        DBTabelleLesen.create_new_BestellungsItem(Restaurant.dbVerbindung, new Bestellung(new Date(), (summe * 1-rabattcode), c), gerichte );
        LoggerUtil.log("Kauf ausgeführt: "+ (summe * 1-rabattcode));
        reset();
    }
}
