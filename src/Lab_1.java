import java.util.Scanner;

public class Lab_1 {
    public static void first (int x1, int y1, int x2, int y2) {
        int x3 = x1 + x2;
        int y3 = y1 + y2;
        x3 = x3/2;
        y3 = y3/2;

        System.out.println("Coordinates: " + x3 + ", " + y3);
    }

    public static void second (int x) {
        if (x == 0) {
           System.out.println("0");
        }
        else {
            String s = "";
            if (x > 0) {
                s = "positive";
            }
            else {
                s = "negative";
            }

            String num = "";
            x = Math.abs(x);

            if (x < 10) {
                num = "single digit number";
            }
            else if (x < 100) {
                num = "two-digit number";
            }
            else{
                num = "three digit number";
            }

            System.out.println(s + " " + num);
        }
    }

    public static long fact(int n) {
        long res = 0;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }
    public static void third (int number) {
        double sum = 0;

        for (int i = 1; i <= number; i++) {
            long fact = fact(i);
            double el;

            if (i % 2 == 0) {
                el = (i * Math.pow(2, i)) / fact;
            }
            else {
                el = fact / Math.pow(2, i);
            }

            sum += el;
        }

        System.out.println("Sum: " + sum);
    }

    public static void fourth (int[] numbers) {
        int max = 0;
        int mostch = 0;

        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            int count = 0;

            for (int j = 0; j < numbers.length; j++) {
                if (current == numbers[j]) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
                mostch = current;
            }
        }
        System.out.println("Most common number is: " + mostch);
    }

    public static void fifth(int [] X, int[] Y) {
        double Maxdist = 0;
        int point1 = 0, point2 = 0;
        for (int i = 0; i < X.length; i++) {
            for (int j = i + 1; j < X.length; j++) {
                int x = X[i] - X[j];
                int y = Y[i] - Y[j];
                double dist = Math.sqrt(x * x + y * y);

                if (dist > Maxdist) {
                    Maxdist = dist;
                    point1 = i;
                    point2 = j;
                }
            }
        }
        System.out.println("Max Dist from points " + point1 + "and" + point2);
    }

    public static void run() {
        Scanner sc = new Scanner(System.in);

        int stage = 0;

        while (stage < 6) {
            System.out.println("Enter number of stage (1-5, 6 - exit) : ");
            if (sc.hasNextInt()) {
                stage = sc.nextInt();

                switch (stage) {
                    case 1:
                        System.out.println("Enter coordinate X1: ");
                        int x1 = sc.nextInt();
                        System.out.println("Enter coordinate Y1: ");
                        int y1 = sc.nextInt();
                        System.out.println("Enter coordinate X2: ");
                        int x2 = sc.nextInt();
                        System.out.println("Enter coordinate Y2: ");
                        int y2 = sc.nextInt();

                        if ((x1 != x2) || (y1 != y2)) {
                            first(x1, y1, x2, y2);
                        }
                        else {
                            System.out.println("It`s the same point");
                        }
                        break;

                    case 2:
                        System.out.println("Enter your number: ");
                        if (sc.hasNextInt()) {
                            int num = sc.nextInt();
                            second(num);
                        }
                        else {
                            System.out.println("Invalid number");
                            return;
                        }
                        break;

                    case 3:
                        System.out.println("Enter number of elements: ");
                        if (sc.hasNextInt()) {
                            int many = sc.nextInt();
                            third(many);
                        }
                        else {
                            System.out.println("Invalid number");
                            return;
                        }
                        break;

                    case 4:
                        System.out.println("Enter size of masive: ");
                        int n = sc.nextInt();
                        int [] massive = new int[n];

                        for (int i = 0; i < n; i++) {
                            System.out.println("Enter massive element: ");
                            massive[i] = sc.nextInt();
                        }
                        fourth(massive);
                        break;

                    case 5:
                        System.out.println("Enter koordinates: ");

                        int [] X = new int[5];
                        int [] Y = new int[5];

                        for (int i = 0; i < 5; i++) {
                            System.out.println("Enter X " + i + " coordinate: ");
                            X[i] = sc.nextInt();
                            System.out.println("Enter Y" + i + "coordinate: ");
                            Y[i] = sc.nextInt();
                        }

                        fifth(X, Y);
                        break;
                }
            }
            else {
                System.out.println("Enter valid number");
                return;
            }
        }
    }
}
