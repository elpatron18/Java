package Projekt;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.text.DecimalFormat;

public class Warenkorb extends JPanel {

    JTable wkItems;
    DefaultTableModel tableModel;
    double summe = 0;
    JLabel total;

    DecimalFormat euro = new DecimalFormat("0.00€");
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

    public void addToWarenkorb(String name, double preis) {
        summe += preis;
        total.setText("Summe: " + euro.format(summe));
        tableModel.addRow(new Object[]{name, euro.format(preis)});
    }

    public void reset() {
        summe = 0;
        total.setText("Summe: " + euro.format(summe));
        tableModel.setRowCount(0);
    }
}
