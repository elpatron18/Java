package GUI.WindowBuilder.A1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Geometrie extends JFrame {

    private JPanel contentPane;
    private JTextField txtKRadius;
    private JTextField txtKVolumen;
    private JTextField txtKOberfl;
    private JTextField txtZRadius;
    private JTextField txtZVolumen;
    private JTextField txtZOberfl;
    private JTextField txtZMantel;

    /**
     * Launch the application.
     */
    /**
     * Create the frame.
     */
    public Geometrie() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1055, 617);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));

        JPanel panel = new JPanel();
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("Kugel");
        lblNewLabel_1.setBounds(154, 10, 25, 13);
        panel.add(lblNewLabel_1);

        JLabel lblNewLabel = new JLabel("HurensohN: ");
        lblNewLabel.setBounds(301, 187, 57, 13);
        panel.add(lblNewLabel);

        txtKRadius = new JTextField();
        txtKRadius.setText("tfRadius");
        txtKRadius.setBounds(357, 184, 96, 19);
        panel.add(txtKRadius);
        txtKRadius.setColumns(10);

        txtKVolumen = new JTextField();
        txtKVolumen.setColumns(10);
        txtKVolumen.setBounds(357, 255, 96, 19);
        panel.add(txtKVolumen);

        JLabel lblNewLabel_2 = new JLabel("HurensohN: ");
        lblNewLabel_2.setBounds(301, 258, 57, 13);
        panel.add(lblNewLabel_2);

        JLabel lblNewLabel_2_1 = new JLabel("HurensohN: ");
        lblNewLabel_2_1.setBounds(301, 288, 57, 13);
        panel.add(lblNewLabel_2_1);

        txtKOberfl = new JTextField();
        txtKOberfl.setColumns(10);
        txtKOberfl.setBounds(357, 285, 96, 19);
        panel.add(txtKOberfl);

        JButton btnKugel = new JButton("New button");
        btnKugel.setBounds(46, 343, 85, 21);
        panel.add(btnKugel);

        JPanel panel_2 = new JPanel();
        contentPane.add(panel_2);
        panel_2.setLayout(null);

        JLabel lblNewLabel_3 = new JLabel("Kreiszylinder");
        lblNewLabel_3.setBounds(333, 10, 58, 13);
        panel_2.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("Radius r:");
        lblNewLabel_4.setBounds(405, 55, 45, 13);
        panel_2.add(lblNewLabel_4);

        txtZRadius = new JTextField();
        txtZRadius.setBounds(456, 52, 24, 19);
        panel_2.add(txtZRadius);
        txtZRadius.setColumns(10);

        JLabel lblNewLabel_4_1 = new JLabel("Radius r:");
        lblNewLabel_4_1.setBounds(405, 81, 45, 13);
        panel_2.add(lblNewLabel_4_1);

        txtZVolumen = new JTextField();
        txtZVolumen.setColumns(10);
        txtZVolumen.setBounds(456, 78, 24, 19);
        panel_2.add(txtZVolumen);

        JLabel lblNewLabel_4_1_1 = new JLabel("Radius r:");
        lblNewLabel_4_1_1.setBounds(405, 110, 45, 13);
        panel_2.add(lblNewLabel_4_1_1);

        txtZOberfl = new JTextField();
        txtZOberfl.setColumns(10);
        txtZOberfl.setBounds(456, 107, 24, 19);
        panel_2.add(txtZOberfl);

        txtZMantel = new JTextField();
        txtZMantel.setColumns(10);
        txtZMantel.setBounds(456, 139, 24, 19);
        panel_2.add(txtZMantel);

        JLabel lblNewLabel_4_1_1_1 = new JLabel("Radius r:");
        lblNewLabel_4_1_1_1.setBounds(405, 142, 45, 13);
        panel_2.add(lblNewLabel_4_1_1_1);

        JButton btnZyl = new JButton("New button");
        btnZyl.setBounds(45, 232, 85, 21);
        panel_2.add(btnZyl);
    }

    public static void main(String[] args) {
        Geometrie frame = new Geometrie();
        frame.setVisible(true);
    }
}
