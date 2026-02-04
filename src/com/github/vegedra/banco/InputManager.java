// Sistema bancário simples feito em Java
// @author: Pedro Ivo Rocha (21/10/25)

package com.github.vegedra.banco;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputManager {
    public static final Scanner scanner = new Scanner(System.in);

    // Construtor
    private InputManager() {}

    // Verifica o input
    public static boolean verify(String type) {
        if (type.equals("int")) {
            if (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida!");
                scanner.next(); // descarta lixo
                return false;
            }
        }
        else if (type.equals("double")) {
            if (!scanner.hasNextDouble()) {
                System.out.println("Entrada inválida!");
                scanner.next(); // descarta lixo
                return false;
            }
        }
        return true;
    }

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