import java.util.ArrayList;
import java.util.Scanner;

public class HangmanGame {

    private InformationScreen informationScreen;
    private Scanner scanner;
    private int wrongGuesses;
    private ArrayList<String> wronglyGuessedLetters;

    private String name;
    private Word word;


    public HangmanGame(){
        informationScreen = new InformationScreen();
        scanner = new Scanner(System.in);
        wrongGuesses = 0;
        wronglyGuessedLetters = new ArrayList<>();
    }

    public void setUpGame(){
        informationScreen.displayStartMessage();
        setName();
        setWord();
    }

    public void playGame(){
        while(!isGameOver() && !isGameWon()){
            guessLetter();
            informationScreen.displayGuessedLetters(word.getGuessedLetters());

            if(!isGameOver() && !isGameWon()){
                informationScreen.displayWronglyGuessedLetters(wronglyGuessedLetters, wrongGuesses);
            }
        }
    }

    public void endGame(){
        if(isGameWon()){
            informationScreen.displayWinMessage();
        }else if(isGameOver()){
            informationScreen.displayLoseMessage();
        }
    }

    private void setName(){
        System.out.println("Wat is de naam van de speler?");
        name = scanner.nextLine();
    }

    private void setWord(){
        System.out.println("Kies een woord.");
        String filledInWord = scanner.nextLine().toLowerCase();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        word = new Word(filledInWord);
    }

    private void guessLetter(){
        boolean isEntryValid = false;
        String letter = "";

        while(!isEntryValid) {
            System.out.println("Raad een letter");
            letter = scanner.nextLine();

            if(letter.length() != 1){
                System.out.println("Ongeldige invoer, voer 1 letter in.");
            }else{
                isEntryValid = true;
            }
        }

        if(word.isLetterInWord(letter)){
            System.out.println("\nGoed geraden " + name + "!");
        }else{
            wrongGuesses++;
            wronglyGuessedLetters.add(letter);
            System.out.println("\nHelaas " + name + "!");
        }
    }

    private boolean isGameOver(){
        if(wrongGuesses > 9){
            return true;
        }

        return false;
    }

    private boolean isGameWon(){
        if(word.isGuessed()){
            return true;
        }

        return false;
    }
}