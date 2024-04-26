package atividade08.classes;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Divisor {
    public double numerador;
    public double denominador;

    public double getNumerador() {
        return this.numerador;
    }

    public double getDenominador() {
        return this.denominador;
    }

    public double dividir() {
        if (getDenominador() == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }

        return getNumerador() / getDenominador();
    }

    public void executar() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o numerador: ");
            this.numerador = scanner.nextDouble();

            System.out.print("Digite o denominador: ");
            this.denominador = scanner.nextDouble();

            double resultado = dividir();
            System.out.println("O resultado da divisão é: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: O valor informado não é numérico.");
        } finally {
            scanner.close();
        }    
    }
}
