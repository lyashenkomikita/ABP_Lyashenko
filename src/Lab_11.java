import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class Lab_11 {
    @Test
    public void testFirst() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Lab_1.first(1, 1, 5, 5);

        assertTrue(out.toString().contains("Coordinates: 3, 3"));
    }

    @Test
    public void testSecond() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Lab_1.second(10);

        assertTrue(out.toString().contains("positive two-digit number"));
    }

    @Test
    public void testThird() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Lab_1.third(10);

        assertTrue(out.toString().contains("Sum: Infinity"));
    }

    @Test
    public void testFourth() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        int[] numbers = {1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Lab_1.fourth(numbers);

        assertTrue(out.toString().contains("Most common number is: 1"));
    }

    @Test
    public void testFifth() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        int[] X = {1, 2, 3, 4, 5};
        int[] Y = {1, 2, 3, 4, 5};
        Lab_1.fifth(X, Y);

        assertTrue(out.toString().contains("Max Dist from points 0 and 4"));
    }
}
