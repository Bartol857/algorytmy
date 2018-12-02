import java.util.Scanner;

public class liczbyPierwsze {
    public static void main(String[] args) {

//        zadanie1();
        zadanie2(100000);
    }

    public static void zadanie1() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int zmienna = scanner.nextInt();

        if (zmienna > 3 && zmienna % 2 ==0){
            System.out.print("Liczba "+ zmienna + " nie jest liczbą pierwszą.");
        }else if (zmienna > 3 && zmienna % 3 == 0){
            System.out.print("Liczba "+ zmienna + " nie jest liczbą pierwszą.");
        }else if (zmienna > 3 && zmienna % 5 == 0){
            System.out.print("Liczba "+ zmienna + " nie jest liczbą pierwszą.");
        }else {
            System.out.print("Liczba "+ zmienna + " jest liczbą pierwszą.");
        }
    }

    public static void zadanie2(int v){
        int[] tab = new int[100001];

        for (int i = 2; i * i < tab.length; i++){
            for (int j = i * i; j  < tab.length; j += i){
                tab[j] = 1;
            }
        }
        if (tab [v] == 0){
            System.out.println("Liczba " + v + " jest liczbą pierwszą");
        }else{
            System.out.println("Liczba " + v + " nie jest liczbą pierwszą");
        }
    }

}
