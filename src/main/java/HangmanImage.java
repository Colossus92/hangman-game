public class HangmanImage {

    public void displayImage(int wrongGuesses) {
        switch (wrongGuesses) {
            case 0:
                break;
            case 1:
                displayImage1();
                break;
            case 2:
                displayImage2();
                break;
            case 3:
                displayImage3();
                break;
            case 4:
                displayImage4();
                break;
            case 5:
                displayImage5();
                break;
            case 6:
                displayImage6();
                break;
            case 7:
                displayImage7();
                break;
            case 8:
                displayImage8();
                break;
            case 9:
                displayImage9();
                break;
            case 10:
                displayImage10();
                break;
            default:
                throw new IllegalArgumentException("Zoveel beurten hoor je niet te krijgen");
        }
    }

    private void displayImage10() {
        System.out.println("    _______      ");
        System.out.println("    |/   |       ");
        System.out.println("    |   \\0/     ");
        System.out.println("    |    |       ");
        System.out.println("    |   / \\     ");
        System.out.println(" __/|\\______    ");
        System.out.println(" |         |____ ");
        System.out.println(" |_____________| ");
    }

    private void displayImage9() {
        System.out.println("    _______      ");
        System.out.println("    |/   |       ");
        System.out.println("    |            ");
        System.out.println("    |            ");
        System.out.println("    |            ");
        System.out.println(" __/|\\______    ");
        System.out.println(" |         |____ ");
        System.out.println(" |_____________| ");

    }

    private void displayImage8() {
        System.out.println("    _______      ");
        System.out.println("    |/           ");
        System.out.println("    |            ");
        System.out.println("    |            ");
        System.out.println("    |            ");
        System.out.println(" __/|\\______    ");
        System.out.println(" |         |____ ");
        System.out.println(" |_____________| ");
    }

    private void displayImage7() {
        System.out.println("    |/           ");
        System.out.println("    |            ");
        System.out.println("    |            ");
        System.out.println("    |            ");
        System.out.println(" __/|\\______    ");
        System.out.println(" |         |____ ");
        System.out.println(" |_____________| ");
    }

    private void displayImage6() {
        System.out.println("    |            ");
        System.out.println("    |            ");
        System.out.println("    |            ");
        System.out.println("    |            ");
        System.out.println(" __/|\\______    ");
        System.out.println(" |         |____ ");
        System.out.println(" |_____________| ");
    }

    private void displayImage5() {
        System.out.println(" __/ \\______    ");
        System.out.println(" |         |____ ");
        System.out.println(" |_____________| ");
    }

    private void displayImage4() {
        System.out.println(" __/   ______    ");
        System.out.println(" |         |____ ");
        System.out.println(" |_____________| ");

    }

    private void displayImage3() {
        System.out.println(" __    ______    ");
        System.out.println(" |         |____ ");
        System.out.println(" |_____________| ");

    }

    private void displayImage2() {
        System.out.println(" |         |____ ");
        System.out.println(" |_____________| ");
    }

    private void displayImage1() {
        System.out.println("  _____________  ");
    }
}
