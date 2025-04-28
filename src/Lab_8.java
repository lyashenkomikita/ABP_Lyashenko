import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Lab_8 extends JFrame {
    private Color col = Color.YELLOW;

    Lab_8(String s) {
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

        JPopupMenu popup = new JPopupMenu();

        JMenuItem red = new JMenuItem("Fill red");
        JMenuItem black = new JMenuItem("Fill black");
        JMenuItem green = new JMenuItem("Fill green");

        popup.add(red);
        popup.add(black);
        popup.add(green);

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

        panel.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popup.show(panel, e.getX(), e.getY());
                }
            }
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popup.show(panel, e.getX(), e.getY());
                }
            }
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
        Lab_8 s = new Lab_8("Lab 8");
    }
}

