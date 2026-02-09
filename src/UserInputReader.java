import java.util.Scanner;

public class UserInputReader {
    public static int getUserInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}