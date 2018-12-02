public class algorytmyExample {
    public static void main(String[] args) {
        System.out.println(zad1(5));
        System.out.println(zad2(3));
        System.out.println(zad3(8));
        System.out.println(zad4(5));
        System.out.println(zad5(5));

    }

    public static int zad1(int n) {
        int a = 1;
        for(int i = 1; i < n; i++)
            a = a + 2;
        return a;

    }

    public static int zad2(int n) {
        int a = 1;
        for(int i = 1; i < n; i++){
            if (i % 2 == 0)
            a = a + 1;
        }

            if (n % 2 == 0) {
                a = a * 10;
            } else {
                a = a * 100;
            }

        return a;
    }

    public static int zad3(int n) {
        n = n%6;
        int wynik = 0;
        for (int i = 0; i < 3 && i < n; i++) {
            wynik = wynik + 2;
        }
        int i;
        for (i = 3; i < n; i++){
            wynik = wynik - 2;
        }
        return wynik;
    }

    public static int zad4(int n){
        int a = 1;
        for(int i = 1; i < n; i++)
        a = n * n;
        return a;
    }

    public static int zad5(int n){
        int a = 1;
        int b = 1;

        for (int i = 1; i < n; i++){
            a = a+b;
        }
        return a;
    }

    public static void zad15(){
        int[] A = new int[]{1,2,3,4,5,6,7,8};

    }

}
