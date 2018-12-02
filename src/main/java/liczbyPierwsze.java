import java.util.Scanner;

public class liczbyPierwsze {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj liczbę całkowitą: ");
            int zmienna = scanner.nextInt();

            if (zmienna % 2 ==0){
                System.out.print("Liczba "+ zmienna + " nie jest liczbą pierwszą.");
            }else if (zmienna % 3 == 0){
                System.out.print("Liczba "+ zmienna + " nie jest liczbą pierwszą.");
            }else if (zmienna % 5 == 0){
                System.out.print("Liczba "+ zmienna + " nie jest liczbą pierwszą.");
            }else {
                System.out.print("Liczba "+ zmienna + " jest liczbą pierwszą.");
            }



    }

}
