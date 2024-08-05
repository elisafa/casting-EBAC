package br.com.elisafa;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int valorLido = leitor.nextInt();
        System.out.println("Valor lido no console: " +valorLido);
        Integer valorAlterado = valorLido;
        System.out.println("Valor com autoboxing: " +valorAlterado);
        leitor.close();
    }
}
