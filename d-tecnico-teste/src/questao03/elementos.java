package questao03;

public class Elementos {

    public static void sequenciaA() {
        System.out.println("\na)");
        System.out.print("1, 3, 5, 7, ___");

        int num = 7;
        for (int i = 0; i < 10; i++) {
            num += 2;
            System.out.print(num + " ");
        }
    }

    public static void sequenciaB() {
        System.out.println("\nb)");
        System.out.print("2, 4, 8, 16, 32, 64 ___");

        int num = 64;
        for (int i = 0; i < 10; i++) {
            num *= 2;
            System.out.print(num + " ");
        }
    }

    public static void sequenciaC() {
        int start = 7, count = 20;
        System.out.println("\nc)");
    //    System.out.print(" 0, 1, 4, 9, 16, 25, 36, ...");
        int num = start;
        for (int i = 1; i <= count; i++) {
            num = i * i;
            System.out.print(num + ", ");
        }
    }

    public static void sequenciaD() {
        System.out.println("\nd)");
        System.out.print(" 4, 16, 36, 64, ...");
        int start = 4 , count = 10;
        int num = start;
        for (int i = 1; i <= count; i++) {
            num += 4 * i; // Adiciona 4 vezes o número atual do loop
            System.out.print(num + ", ");
        }
    }

    public static void fibonacciSequence() {
        System.out.println("\ne)");
//     System.out.print("1, 1, 2, 3, 5, 8, ___");
        int a = 1, b = 1;
        for (int i = 1; i <= 20; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }

    public static void SequenceF() {
        System.out.println("\nf )");

        System.out.print(" 2, 10, 12, 16, 17, 18, 19, ...");
        int num = 22;
        for (int i = 0; i < 19; i++) {
            num += 1;
            System.out.print(num + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("a )");
        sequenciaA();
        System.out.println("\n-------------------------------------------");
        sequenciaB();
        System.out.println("\n-------------------------------------------");
        sequenciaC();
        System.out.println("\n-------------------------------------------");
        sequenciaD();
        System.out.println("\n-------------------------------------------");
        fibonacciSequence();
        System.out.println("\n-------------------------------------------");
        SequenceF();
        System.out.println("\n-------------------------------------------");


    }
}
