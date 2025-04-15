import java.awt.*;
import javax.swing.*;

public class Lab_5 extends JFrame {
    Lab_5(String s) {
        super(s);
        setSize(1000, 500);
        setLocation(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(null);
        panel.setFont(new Font("Arial", Font.BOLD, 20));

        setContentPane(panel);

        TextField f1 = new TextField(20);
        f1.setBounds(200, 95, 200, 35);
        add(f1);

        TextField f2 = new TextField(20);
        f2.setBounds(450, 300, 200, 35);
        add(f2);

        Button rep = new Button("Повторний дзвінок");
        rep.setBackground(Color.yellow);
        rep.setBounds(50, 400, 200, 50);
        add(rep);

        Button send = new Button("Надіслати");
        send.setBackground(Color.green);
        send.setBounds(400, 400, 200, 50);
        add(send);

        Button exit = new Button("Відмінити");
        exit.setBackground(Color.red);
        exit.setBounds(750, 400, 200, 50);
        add(exit);

        ImageIcon image = new ImageIcon("C:\\Users\\Admin\\Desktop\\Універ\\191.png");
        Image sImage = image.getImage().getScaledInstance(180, 200, Image.SCALE_SMOOTH);
        ImageIcon image1 = new ImageIcon(sImage);
        JLabel imageLabel = new JLabel(image1);
        imageLabel.setBounds(150, 150, imageLabel.getPreferredSize().width, imageLabel.getPreferredSize().height);
        add(imageLabel);
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.BOLD, 25));
        g.drawString("Авторизація входу", 400, 80);

        g.setFont(new Font("Arial", Font.PLAIN, 25));
        g.drawString("Телефон", 100, 150);

        g.setFont(new Font("Arial", Font.PLAIN, 20));
        g.drawString("Введіть чотири останні цифри номеру,", 400, 300);
        g.drawString("з якого Вам телефонують:", 400, 325);


    }

    public static void run() {
        Lab_5 s = new Lab_5("Lab 5");
    }
}
