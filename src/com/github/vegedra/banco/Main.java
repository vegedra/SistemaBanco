// Sistema bancário simples feito em Java
// @author: Pedro Ivo Rocha (21/10/25)

/*
TODO:
    Leitura e Saída de dados (salvar e carregar)

 */

package com.github.vegedra.banco;

import java.util.InputMismatchException;

public class Main {

    // Variaveis
    public static boolean running = true;

    // Menu inicial
    public static void main(String[] args) {

        Conta conta = new Conta("user");
        int ch;

        do {
            System.out.println("\n*********************");
            System.out.println("  Sistema Bancário   ");
            System.out.println("Seja bem vindo(a), " + conta.getNome() + ".");
            System.out.println("*********************");
            System.out.println("1) Saldo");
            System.out.println("2) Depósito");
            System.out.println("3) Saque");
            System.out.println("4) Sair");
            System.out.println("*********************");

            // Input
            System.out.print("\n> ");

            // Verifica se o input é válido
            if (!InputManager.verify("int")) {
                continue; // volta pro menu
            }

            ch = InputManager.scanner.nextInt();

            // Opçções
            switch (ch) {
                case 1 -> conta.mostrarSaldo();
                case 2 -> conta.fazerDeposito();
                case 3 -> conta.fazerSaque();
                case 4 -> running = false;
                default -> System.out.println("Comando inválido!");
            }
        } while (running);
        System.out.println("Saindo...");
        InputManager.close();
    }
}