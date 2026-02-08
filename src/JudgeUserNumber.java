public class JudgeUserNumber {
    public static boolean JudgeUserNumber(int ComputerNumber, int UserNumber) {
        if (ComputerNumber == UserNumber) {
            System.out.println("right!");
            return true;
        } else {
            if (ComputerNumber < UserNumber) {
                System.out.println("down");
            } else {
                System.out.println("up");
            }

            return false;
        }
    }
}
