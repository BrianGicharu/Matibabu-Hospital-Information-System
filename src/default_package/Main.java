package default_package;

import javax.swing.JFrame;

public class Main{

    public static void main(String[] args){
        Graphic window = new Graphic();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(1700,800);
        window.setVisible(true);

    }
}
