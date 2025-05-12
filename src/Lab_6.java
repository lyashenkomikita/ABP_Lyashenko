import java.awt.*;
import javax.swing.*;

public class Lab_6 extends JFrame {
    private Color col = Color.YELLOW;

    Lab_6(String s) {
        super(s);
        setSize(1000, 800);
        setLocation(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        panel.setFont(new Font("Arial", Font.BOLD, 20));

        setContentPane(panel);

        JRadioButton red = new JRadioButton("Fill red");
        red.setBounds(700, 150, 150, 50);
        add(red);

        JRadioButton black = new JRadioButton("Fill black");
        black.setBounds(700, 250, 150, 50);
        add(black);

        JRadioButton green = new JRadioButton("Fill green");
        green.setBounds(700, 350, 150, 50);
        add(green);

        ButtonGroup group = new ButtonGroup();
        group.add(red);
        group.add(black);
        group.add(green);

        red.addActionListener(e -> {
            col = Color.RED;
            repaint();
        });
        black.addActionListener(e -> {
            col = Color.BLACK;
            repaint();
        });
        green.addActionListener(e -> {
            col = Color.GREEN;
            repaint();
        });
    }

    public void paint(Graphics g) {
        super.paint(g);

        Polygon tr = new Polygon();
        tr.addPoint(300, 200);
        tr.addPoint(100, 500);
        tr.addPoint(500, 500);
        g.setColor(col);
        g.fillPolygon(tr);
    }

    public static void run() {
        Lab_6 s = new Lab_6("Lab 6");
    }
}
