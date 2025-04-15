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
            }
        }
        else {
            System.out.println("Invalid number");
            sc.close();
            return;
        }
    }
}