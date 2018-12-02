public class rekurencje {
    public static void main(String[] args) {
        String slowo = "oget ejazc ein";
        wspak(slowo,slowo.length()-1);


    }

        static int gcd (int a, int b){
            return b > 0 ? a * gcd(a , b - 1 ): 1;
        }

        static int gcd2 (int a){
            return a > 1 ? gcd2(a - 1) + gcd2(a - 2): 1;
        }

    static void wspak(String slowo, int i){
        System.out.print(slowo.charAt(i));
        if(i > 0)
            wspak(slowo,i-1);

    }


}
