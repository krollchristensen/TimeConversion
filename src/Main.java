import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Læs antallet af timer fra brugeren
        System.out.print("Indtast antal timer: ");
        int hours = input.nextInt();

        // Konverter timer til sekunder
        int seconds = hours * 3600;

        // Udskriv resultatet
        System.out.println(hours + " timer er lig med " + seconds + " sekunder.");

        input.close();
    }
}
