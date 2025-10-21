// Sistema bancário simples feito em Java
// @author: Pedro Ivo Rocha (21/10/25)

package com.github.vegedra.banco;

import java.util.Scanner;

public class InputManager {
    public static final Scanner scanner = new Scanner(System.in);

    // Construtor
    private InputManager() {}

    // Pausa o programa
    public static void pause() {
        System.out.println("\n\nPressione Enter para continuar.");

        // Limpa qualquer Enter que ficou no buffer
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }

        // Aguarda o usuario apertar Enter
        scanner.nextLine();
    }

    // Encerra o scanner
    public static void close() {
        scanner.close();
    }
}