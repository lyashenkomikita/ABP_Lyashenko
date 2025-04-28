import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter lab number: ");

        int number = 0;

        if (sc.hasNextInt()) {
            number = sc.nextInt();

            switch (number) {
                case 1:
                    Lab_1.run();
                    break;

                case 2:
                    Lab_2.run();
                    break;

                case 4:
                    Lab_4.run();
                    break;

                case 5:
                    Lab_5.run();
                    break;

                case 6:
                    Laba_6.run();
                    break;

                case 7:
                    Lab_7.run();
                    break;

                case 8:
                    Lab_8.run();
                    break;

                default:
                    System.out.println("Invalid number");
                    break;
            }
        }
        else {
            System.out.println("Invalid number");
            sc.close();
            return;
        }
    }
}