import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci tre parole");
        String word1 = scanner.nextLine();
        System.out.println("Prima parola inserita: " + word1);
        String word2 = scanner.nextLine();
        System.out.println("Seconda parola inserita: " + word2);
        String word3 = scanner.nextLine();
        System.out.println("Terza parola inserita: " + word3);
        System.out.println("Concatenazione delle parole: " + word1 + " " + word2 + " " + word3);
        System.out.println("Concatenazione delle parole (inverso): " + word3 + " "+ word2 + " " + word1);

        scanner.close();
    }
}
