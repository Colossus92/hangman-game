public class Word {

    int wordLength;
    private String[] wordToGuess;
    private String[] guessedLetters;
    private static final String UNDERSCORE = "_";

    public Word(String filledInWord) {
        wordLength = filledInWord.length();
        wordToGuess = new String[wordLength];
        guessedLetters = new String[wordLength];

        for(int i=0;i<wordLength;i++){
            wordToGuess[i] = filledInWord.substring(i, i+1);
            guessedLetters[i] = UNDERSCORE;
        }
    }

    public boolean isLetterInWord(String letter) {
        boolean isGuessRight = false;

        for(int i=0;i<wordLength;i++) {
            if (wordToGuess[i].equals(letter)) {
                guessedLetters[i] = letter;
                isGuessRight = true;
            }
        }

        return isGuessRight;
    }

    public String[] getGuessedLetters(){
        return guessedLetters;
    }

    public boolean isGuessed() {
        for(String guessedLetter : guessedLetters){
            if(guessedLetter.equals(UNDERSCORE)){
                return false;
            }
        }

        return true;
    }
}
