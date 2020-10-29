import java.util.ArrayList;

public class InformationScreen {

    private HangmanImage hangmanImage;

    public InformationScreen() {
        hangmanImage = new HangmanImage();
    }

    public void displayStartMessage(){
        System.out.println("---------------------------");
        System.out.println("|   Welcome to Hangman!   |");
        System.out.println("---------------------------");
    }

    public void displayGuessedLetters(String[] guessedLetters){
        System.out.println("Tot nu toe geraden:");

        for(String guessedLetter : guessedLetters){
           System.out.print(guessedLetter + " ");
        }
        System.out.println("\n");

    }

    public void displayWronglyGuessedLetters(ArrayList<String> wronglyGuessedLetters, int wrongGuesses){
        System.out.println("Fout geraden letters:");

        for(String wronglyGuessedLetter : wronglyGuessedLetters){
            System.out.print(wronglyGuessedLetter + " ");
        }
        System.out.println("\n");

        hangmanImage.displayImage(wrongGuesses);
    }


    public void displayLoseMessage(){
        System.out.println("-------------------------");
        System.out.println("|       GAME OVER!       |");
        System.out.println("-------------------------");
    }

    public void displayWinMessage() {
        System.out.println("------------------------");
        System.out.println("|       YOU WIN!       |");
        System.out.println("------------------------");
    }
}
