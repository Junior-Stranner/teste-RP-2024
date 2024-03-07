package questao03;

public class Elementos {

    public static void doisEmDois() {
        System.out.println("\na)");
        System.out.print("1, 3, 5, 7, ___");

        int num = 7;
        for (int i = 0; i < 10; i++) {
            num += 2;
            System.out.print(num + " ");
        }
    }

    public static void multDois() {
        System.out.println("\nb)");
        System.out.print("2, 4, 8, 16, 32, 64 ___");

        int num = 64;
        for (int i = 0; i < 10; i++) {
            num *= 2;
            System.out.print(num + " ");
        }
    }

    public static void sequenciaDoisEmDois() {
        System.out.println("\nc)");
        System.out.print("0, 1, 4, 9, 16, 25, 36 ___");

        int num = 25;
        for (int i = 0; i < 10; i++) {
            num += i * i;
            System.out.print(", " + num);
        }
    }

    public static int multiplicaPorQuatro(){
        System.out.println("\nd)");
        System.out.print("4, 16, 32, 64 ___");

        int num = 64;
        for (int i = 0; i < 10; i++) {
            num *= 2;
            System.out.print(num + " ");
        }
       return num;
    }

    public static void fibonacciSequence() {
        System.out.println("\ne)");
     //   System.out.print("1, 1, 2, 3, 5, 8, ___");
        int a = 1, b = 1;
        for (int i = 1; i <= 20; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }

    public static void SequenceF() {
        System.out.println("\nf)");

            int start = 19; 
            int count = 20;
    
            for (int i = 0; i < count; i++) {
                int num;
                if (i % 2 == 0) {
                    num = start + 2 * i; // Gera número par
                } else {
                    num = start + 11 + i; // Gera número ímpar
                }
                System.out.print(num + " ");
            }
        }

    public static void main(String[] args) {
        System.out.println("a )");
        doisEmDois();
        System.out.println("\n-------------------------------------------");
        multDois();
        System.out.println("\n-------------------------------------------");
        sequenciaDoisEmDois();
        System.out.println("\n-------------------------------------------");
        multiplicaPorQuatro();
        System.out.println("\n-------------------------------------------");
        fibonacciSequence();
        System.out.println("\n-------------------------------------------");
        SequenceF();
        System.out.println("\n-------------------------------------------");


    }
}
