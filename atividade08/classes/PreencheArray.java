package atividade08.classes;

import java.util.Scanner;
import java.util.InputMismatchException;

public class PreencheArray {
    public PreencheArray() {
        vetor = new int[10];
    }
    
    private int[] vetor;

    public int[] getVetor() {
        return this.vetor;
    }

    public void executar() {
        Scanner scanner = new Scanner(System.in);

        try {
            int indice = 0;

            while (true) {
                int valor = scanner.nextInt();

                this.vetor[indice] = valor;

                if (valor == 0) break;

                indice++;
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Foram preenchidos mais de 10 valores para o vetor.");
        }
        catch (InputMismatchException e) {
            System.out.println("Erro: O valor informado não é numérico.");
        } finally {
            scanner.close();
        } 
    }
}
