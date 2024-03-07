package questao02;

import java.util.Scanner;

public class Fibonacci_sequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
            int numero = scanner.nextInt();
            
            int a = 0, b = 1;
            boolean pertence = false;

            while (b <= numero) {
                if (b == numero) {
                    pertence = true; 
                    break; 
                }else{
                int temp = a + b;
                a = b;
                b = temp;
                }
            }

            if (pertence) {
                System.out.println("\n------------------------------------------------------------");
                System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
            }
        }
    }

    /* fiz ele fazer 10 repetições para testar se está funcionando bem certinho */
}

