import java.util.Scanner;

public class liczbyPierwsze {
    public static void main(String[] args) {

        zadanie1();


    }

    public static void zadanie1() {

        Scanner dane = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int x = dane.nextInt();

        boolean pierwsza = true;
        for(int i = 2; i * i <= x; i++)
            if(x % i == 0)
                pierwsza = false;

        if(pierwsza)
            System.out.println("TAK");
        else
            System.out.println("NIE");
    }
}

