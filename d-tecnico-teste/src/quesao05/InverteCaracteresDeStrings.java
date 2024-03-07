package quesao05;

import java.util.Scanner;

public class InverteCaracteresDeStrings {
    
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        String reversedString = "";

       /*pega i que vai até o final do caractere e deixa claro q irá fazer um - 1 em cada caractere 
        * dps tem i >= 0 eu deixo claro para ele pegar todos os caracteres 
        i-- ele vai diminuindo o length em -1 até ele for maior ou igual a 0 que seria o primeiro caracter que será o ultimo na inversão
       */
        for (int i = input.length() - 1 ; i>=0; i--) {

            reversedString += input.charAt(i);
        }
            System.out.println("String invertida: " + reversedString);
        }
    }
