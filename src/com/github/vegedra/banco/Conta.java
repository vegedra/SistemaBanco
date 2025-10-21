// Sistema bancário simples feito em Java
// @author: Pedro Ivo Rocha (21/10/25)

package com.github.vegedra.banco;

public class Conta {

    // Variaveis
    private double saldo;
    private String nome;

    // Construtor
    public Conta(String nome) {
        this.nome = nome;
        this.saldo = 0;
    }

    // Getters
    public String getNome() {
        return nome;
    }
    public double getSaldo() {
        return saldo;
    }

    // Metodos
    public void mostrarSaldo() {
        System.out.printf("\nSaldo: R$ %.2f", saldo);
        InputManager.pause();
    }
    public void fazerDeposito() {
        System.out.print("\nValor do depósito: ");
        double valor = InputManager.scanner.nextDouble();

        if (valor > 0) {
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.", valor);
            saldo += valor;
        } else {
            System.out.print("Valor inválido!");
        }
        mostrarSaldo();
    }
    public void fazerSaque() {
        System.out.print("\nValor do saque: ");
        double valor = InputManager.scanner.nextDouble();

        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.", valor);
        } else {
            System.out.print("Saldo insuficiente ou valor inválido!");
        }
        mostrarSaldo();
    }
}
