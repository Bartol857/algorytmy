public class rekurencje {
    public static void main(String[] args) {
        gcd2(4);
        System.out.println(gcd2(4));


    }

        static int gcd (int a, int b){
            return b > 0 ? a * gcd(a , b - 1 ): 1;
        }

        static int gcd2 (int a){
            return a > 1 ? gcd2(a - 1) + gcd2(a - 2): 1;
        }


}
