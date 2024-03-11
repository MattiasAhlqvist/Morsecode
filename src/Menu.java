import java.util.Scanner;

    class Menu {
        public static void main(String args[]) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Menu");
                System.out.println("1. Eng -> Morse");
                System.out.println("2. Morse -> Eng");
                System.out.println("3. Exit");
                int choice = scanner.nextInt();
                scanner.nextLine(); //Ignore "\n" in the input buffer.

                switch (choice) {
                    case 1:
                        //English to morse
                        System.out.println("Type the word you want translated!");
                        MorseCodeTranslator.translateToMorse(scanner.nextLine());
                        break;

                    case 2:
                        // Morse to english
                        System.out.println("Type the morse code you want translated!");
                        MorseCodeTranslator.translateToEnglish(scanner.nextLine());
                        break;
                    case 3:
                        //Exit
                        System.exit(0);
                    default:
                        System.out.println("Wrong input, try again!"); //Felhantering
                }
            }
        }
    }