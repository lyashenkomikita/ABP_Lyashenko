import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab_7 extends JFrame {

    public Lab_7(String s) {
        super(s);
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

        TextField name = new TextField();
        name.setBounds(425, 150, 200, 25);
        add(name);

        TextField[] month = new TextField[12];

        for (int i = 0; i < 12; i++) {
            int y;
            month[i] = new TextField();
            if (i < 6) {
                y = 250 + i*100;
                month[i].setBounds(200, y, 200, 25);
            }
            else {
                y = 250 + (i-6)*100;
                month[i].setBounds(700, y, 200, 25);
            }
            add(month[i]);
        }

        String[] monnames = {"January : ", "February : ", "March : ", "April : ", "May : ", "June : ", "July : ", "August : ", "September : ", "October : ", "November : ", "December : "};

        JButton next = new JButton("Next page");
        next.setBounds(500, 900, 100, 25);
        add(next);

        next.addActionListener(e-> {
           String person = name.getText();
           double max = 0;
           int maxIndex = -1;

           double cash = 0;

           for (int i = 0; i < 12; i++) {
               try {
                   cash = Double.parseDouble(month[i].getText());
                   if (cash > max) {
                       max = cash;
                       maxIndex = i;
                   }

               } catch (NumberFormatException ex) {}

           }
           if (maxIndex > -1) {
               String Mmonth = monnames[maxIndex];
               new Second(person, Mmonth, max). setVisible(true);
           }
           else {
               JOptionPane.showMessageDialog(this, "Invaild input");
           }
        });
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.black);
        g.setFont(new Font("Serif", Font.BOLD, 25));
        g.drawString("Enter name and cash", 400, 100);

        g.setFont(new Font("Serif", Font.BOLD, 20));
        g.drawString("Name : ", 350, 200);

        g.drawString("January : ", 100, 300);
        g.drawString("February : ", 100, 400);
        g.drawString("March : ", 100, 500);
        g.drawString("April : ", 100, 600);
        g.drawString("May : ", 100, 700);
        g.drawString("June : ", 100, 800);
        g.drawString("July : ", 600, 300);
        g.drawString("August : ", 600, 400);
        g.drawString("September : ", 600, 500);
        g.drawString("October : ", 600, 600);
        g.drawString("November : ", 600, 700);
        g.drawString("December : ", 600, 800);
    }

    public static void run() {
        Lab_7 lab = new Lab_7("Lab 7");
    }
}


class Second extends JFrame {
    public Second(String name, String month, double cash) {
        super("Result");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        setVisible(true);

        JLabel n = new JLabel("Name: " + name);
        n.setBounds(425, 150, 200, 25);
        add(n);

        JLabel c = new JLabel("Most cash: " + month + cash);
        c.setBounds(400, 300, 200, 25);
        add(c);
    }
}