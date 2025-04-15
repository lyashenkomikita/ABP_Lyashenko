import javax.swing.*;
import java.awt.*;

public class Lab_4 extends JFrame {
    Lab_4(String s) {
        super(s);   //ініціалізація батьківського класу
        setSize(500, 500);
        setLocation(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);     //Виклик методу батьківського класу
        g.setColor(Color.red);
        g.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 19));
        g.drawString("Mikita", 200, 100);

        g.setColor(Color.red);
        Polygon pol1 = new Polygon();
        pol1.addPoint(450, 250);
        pol1.addPoint(375, 379);
        pol1.addPoint(225, 379);
        pol1.addPoint(150, 250);
        pol1.addPoint(225, 120);
        pol1.addPoint(375, 120);
        g.fillPolygon(pol1);

        g.setColor(Color.black);
        Polygon pol2 = new Polygon();
        pol2.addPoint(400, 250);
        pol2.addPoint(350, 337);
        pol2.addPoint(250, 337);
        pol2.addPoint(200, 250);
        pol2.addPoint(250, 163);
        pol2.addPoint(350, 163);
        g.fillPolygon(pol2);

        Polygon pol3 = new Polygon();
        g.setColor(Color.green);
        pol3.addPoint(350, 250);
        pol3.addPoint(325, 293);
        pol3.addPoint(275, 293);
        pol3.addPoint(250, 250);
        pol3.addPoint(275, 207);
        pol3.addPoint(325, 207);
        g.fillPolygon(pol3);
    }

    public static void run() {
        Lab_4 lab = new Lab_4("Lab_4");
    }
}
