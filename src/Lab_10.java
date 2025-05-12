import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.io.*;

public class Lab_10 extends JFrame {
    public static void run() {
        System.out.println("Enter number of students: ");
        Scanner yes = new Scanner(System.in);
        int[]grades;
        String[] students;
        if (yes.hasNextInt()) {
            int n = yes.nextInt();
            if (n > 1 && n <= 5) {
                grades = new int[n];
                students = new String[n];
            }
            else {
                System.out.println("Invalid number of students!");
                return;}
        }
        else {
            System.out.println("Invalid input");
            return;
        }

        int i = 0;
        try {
            File input = new File("C:\\Users\\Admin\\ABP\\src\\INPUT.txt");
            Scanner sc = new Scanner(input);
            while (sc.hasNextLine() && i < grades.length) {
                String line = sc.nextLine();
                Scanner lineScanner = new Scanner(line);

                String name = lineScanner.next();
                int bal = lineScanner.nextInt();

                if (name != null && bal > 0) {
                    System.out.println(name + " - " + bal);

                    grades[i] = bal;
                    students[i] = name;
                    i++;
                }
                else {
                    System.out.println("too much");
                    return;}

                lineScanner.close();
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        Lab_10 lab = new Lab_10("Lab_10", students, grades);

    }

    public Lab_10(String s, String[] names, int[] grades) {
        super(s);
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

        JButton check = new JButton("Next stage");
        check.setBounds(500, 900, 100, 25);
        add(check);

        check.addActionListener(e -> {
            int max = 0;
            int sum = grades[0];
            int ser = 0;
            String topstudent = names[0];

            for (int i = 1; i < grades.length; i++) {
                sum += grades[i];
                if (grades[i] > max) {
                    max = grades[i];
                    topstudent = names[i];
                }
            }
            ser = sum / grades.length;
            JOptionPane.showMessageDialog(this, "Maximum grade have " + topstudent + "\n Seredniy bal " + ser + "\n Sum: " + sum);
        });

        int y = 100;
        for (int i = 0; i < names.length; i++) {
            JLabel name = new JLabel(names[i]);
            name.setBounds(50, y, 100, 25);
            add(name);
            JLabel grade = new JLabel("Grade: " + grades[i]);
            grade.setBounds(200, y, 100, 25);
            add(grade);

            y += 100;
        }
    }
}
