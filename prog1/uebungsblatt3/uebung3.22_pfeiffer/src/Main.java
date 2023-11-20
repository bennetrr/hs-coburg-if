import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double piValue = 0, num = 4.0, denom = 1.0;
        boolean accuracyReached = false;
        long term = 1L;

        Scanner sc = new Scanner(System.in);

        System.out.print("Anzahl Nachkomma Genauigkeit: (1 bis 8): ");
        final int ACCURACY = sc.nextInt();  // Konstanten werden GROSS geschrieben
        System.out.println(ACCURACY);

        if (ACCURACY > 8) {
            System.out.print("Pi kann nicht approximiert werden auf " + ACCURACY + " Stellen");
            System.exit(1);   // exit beendet das Programm
        }

        long zuApproximierendesPi = (long) (Math.PI * Math.pow(10, ACCURACY));

        do {
            if (term % 2 != 0)
                piValue += num / denom;
            else
                piValue -= num / denom;

            if ((long) (piValue * Math.pow(10, ACCURACY)) != zuApproximierendesPi) {
                term++;
                denom += 2.0;
            } else
                accuracyReached = true;
        } while (!accuracyReached);

        System.out.println((zuApproximierendesPi / Math.pow(10, ACCURACY)) + " dem nach " + term + ".ten Term");
        sc.close();
    }
}
