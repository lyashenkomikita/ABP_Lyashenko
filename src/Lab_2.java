import java.util.Arrays;
import java.util.Scanner;

class QuadraticEquation {
    int a; int b; int c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getNum() {
        double D = b*b - 4*a*c;
        if (D < 0) {
            return 0;
        }
        else if (D == 0) {
            return 1;
        }
        else {
            return 2;
        }
    }

    public double[] getKor() {
        double D = b*b - 4*a*c;

        if (D < 0) {
            return null;
        }
        else if (D == 0) {
            double x = (-b / (2*a));
            return new double[] {x};
        }
        else {
            double x1 = (-b + Math.sqrt(D)) / (2*a);
            double x2 = (-b - Math.sqrt(D)) / (2*a);

            return new double[] {x1, x2};
        }
    }
}

public class Lab_2 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();

        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        int count = qe.getNum();
        System.out.println("Number of quadratic equation roots: " + count);

        double[] roots = qe.getKor();
        if (roots == null) {
            System.out.println("No roots");
        }
        else {
            System.out.println("Kor: ");
            for (int i = 0; i < roots.length; i++) {
                System.out.print(roots[i] + " ");
            }
        }
    }
}
