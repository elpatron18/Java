package GUI.Umwandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Waehrungsrechner extends JFrame implements ActionListener{

    JButton button;
    JTextField tfDollar;
    JTextField tfSPDollar;

    JLabel dollar;
    JLabel spDollar;

    static DecimalFormat waehrung = new DecimalFormat("###.00€");
    boolean dollarChange = false;

    public Waehrungsrechner(){

        this.setTitle("Waehrungsrechner");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        dollar = new JLabel("Dollar: ");

        tfDollar = new JTextField();
        tfDollar.setPreferredSize(new Dimension(250, 40));
        tfDollar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Dollar Change");
                dollarChange = true;

                changeValues();
                formatAll();
            }
        });

        spDollar = new JLabel("Singapurdollar: ");

        tfSPDollar = new JTextField();
        tfSPDollar.setPreferredSize(new Dimension(250, 40));
        tfSPDollar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("SPDollar Change");
                dollarChange = false;

                changeValues();
                formatAll();
            }
        });

        JButton button = new JButton("Umrechnen");
        button.addActionListener(this);

        this.add(dollar);
        this.add(tfDollar);
        this.add(spDollar);
        this.add(tfSPDollar);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Umrechnen")){
            changeValues();
            formatAll();
        }
    }

    public void changeValues() {
        if (dollarChange) {
            double zahl = Double.parseDouble(tfDollar.getText());
            double ergebnis = Arithmetic.umrechnen(zahl, 0.68);

            tfSPDollar.setText(String.valueOf(ergebnis));
        }
        else {
            double zahl = Double.parseDouble(tfSPDollar.getText());
            double ergebnis = Arithmetic.umrechnen(zahl, 1/0.68);

            tfDollar.setText(String.valueOf(ergebnis));
        }
    }

    public void formatAll() {
        waehrung.format(Double.parseDouble(tfSPDollar.getText()));
        waehrung.format(Double.parseDouble(tfDollar.getText()));
    }

    public static void main(String[] args) {
        Waehrungsrechner frame = new Waehrungsrechner();
        frame.setBounds(800, 400, 300, 200);
        frame.setVisible(true);
    }
}