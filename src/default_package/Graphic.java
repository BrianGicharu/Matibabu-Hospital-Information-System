package default_package;

import java.awt.*;
import javax.swing.*;

public class Graphic extends JFrame{

    private JLabel Client;
    private JLabel pic;
    private String name="MATIBABU CLINIC";
    private static String filename ="matibabu_staff_icon.png";
    private JComboBox icon_panel;

    public Graphic(){
        super("MATIBABU HOSPITAL MANAGEMENT INFORMATION SYSTEM");
        setLayout(new FlowLayout());
        Client = new JLabel(name);
        add(Client, BorderLayout.NORTH);
        pic = new JLabel();
        pic.setIcon(new ImageIcon("matibabu_staff_icon.png"));
        add(pic,BorderLayout.WEST);
    }
}
