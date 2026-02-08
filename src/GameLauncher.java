public class GameLauncher {
    static int ComputerNumber;
    static int UserNumber;
    static int count = 0;

    public static void GameStart(){
        ComputerNumber = RandomNumberSetter.RandomNumberSetting();

        for(int idx = 0; idx < 20; idx++){
            UserNumber = UserInputReader.getUserInput();
            boolean gameOver = JudgeUserNumber.JudgeUserNumber(ComputerNumber, UserNumber);

            if (gameOver == true){
                System.out.println("게임이 끝났습니다! " + count + "번 만에 맞췄습니다.");
                break;
            }

            if (count == 20){
                System.out.println("숫자를 20번 안에 맞추지 못했습니다.");
                break;
            }

            count = count + 1;
        }
    }
}
