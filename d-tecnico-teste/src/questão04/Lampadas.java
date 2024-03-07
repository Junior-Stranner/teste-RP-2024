package questão04;

import java.util.Scanner;

public class Lampadas {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Simula o estado inicial das lâmpadas
        boolean[] lampadas = new boolean[3];

        // Primeira visita
        System.out.println("Primeira visita:");
        System.out.println("Ligando o primeiro interruptor...");
        lampadas[0] = true; // Liga o primeiro interruptor
        System.out.println("Desligando o primeiro interruptor e ligando o segundo interruptor...");
        lampadas[0] = false; // Desliga o primeiro interruptor
        lampadas[1] = true; // Liga o segundo interruptor

        // Segunda visita
        System.out.println("\nSegunda visita:");
        System.out.println("Você está na sala das lâmpadas. Qual lâmpada está acesa? (1, 2 ou 3)");
        int lampadaAcessa = scanner.nextInt();

        // Determina qual interruptor controla cada lâmpada com base na resposta
        if (lampadas[lampadaAcessa - 1]) {
            System.out.println("O interruptor " + (lampadaAcessa == 1 ? "primeiro" : "segundo") + " controla a lâmpada " + lampadaAcessa);
            System.out.println("O terceiro interruptor controla a lâmpada restante.");
        } else {
            System.out.println("O terceiro interruptor controla a lâmpada " + lampadaAcessa);
            System.out.println("Os interruptores restantes controlam as outras lâmpadas.");
        }
    }
    /* como eu liguei a lampada 1 e logo desliguei ,
     na segunda visita ao escolher a lampada 1 ele irá ser controlado pelo 3 interruptor*/
}
