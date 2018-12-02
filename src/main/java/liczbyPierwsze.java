import java.util.Scanner;

public class liczbyPierwsze {
    public static void main(String[] args) {

        zadanie1();


    }

    public static void zadanie1() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int zmienna = scanner.nextInt();


            if (zmienna > 3 && zmienna % 2 == 0 && zmienna % 3 == 0 && zmienna % 5 == 0) {
                System.out.print("Liczba "+ zmienna + " nie jest liczbą pierwszą.");
            } else
                System.out.print("Liczba "+ zmienna + " jest liczbą pierwszą.");

    }

}
