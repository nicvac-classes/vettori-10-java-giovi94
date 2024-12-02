import java.util.Scanner;
public class EsameStudenti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il numero di studenti: ");
        int n = scanner.nextInt();
        String[] nomi = new String[n];
        int[] votazioni = new int[n];
        int[] crediti = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Studente " + (i + 1));
            scanner.nextLine();
            System.out.print("Inserisci il nome dello studente: ");
            nomi[i] = scanner.nextLine();
            System.out.print("Inserisci la votazione dello studente: ");
            votazioni[i] = scanner.nextInt();
            System.out.print("Inserisci i crediti formativi dello studente: ");
            crediti[i] = scanner.nextInt();
        }
        int sommaVotazioni = 0;
        for (int i = 0; i < n; i++) {
            sommaVotazioni += votazioni[i];
        }
        double media = (double) sommaVotazioni / n;
        System.out.println("La media delle votazioni è: " + media);
        System.out.println("\nStudenti con votazione superiore alla media e crediti >= 6:");
        for (int i = 0; i < n; i++) {
            if (votazioni[i] > media && crediti[i] >= 6) {
                System.out.println(nomi[i]);
            }
        }
        scanner.close();
    }
}