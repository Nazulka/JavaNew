package leetCode;

// problem 6/6 week 10

import java.util.Arrays;
import java.util.List;

public class SnakeInMatrix {
    public int finalPosition(int n, List<String> commands) {
        int number = 0;
        for (String command : commands) {
            if (command.equals("UP")) {
                number -= n;
            }
            else if (command.equals("DOWN")) {
                number += n;
            }
            else if (command.equals("RIGHT")) {
                number++;
            }
            else if (command.equals("LEFT")) {
                number--;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        SnakeInMatrix sim = new SnakeInMatrix();
        int n = 2;  // Matrix width (e.g., 3x3)

        List<String> commands = Arrays.asList("RIGHT", "DOWN");
        int result = sim.finalPosition(n, commands);

        System.out.println("Final position: " + result);
    }
}
