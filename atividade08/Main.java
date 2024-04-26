package atividade08;

import atividade08.classes.Divisor;
import atividade08.classes.PreencheArray;

public class Main {
    public static void main(String[] args) {
        try {
            Divisor divisor = new Divisor();
            divisor.executar();
        } catch (Exception e) {
            System.out.println("Exceção na divisão");
        }

        try {
            PreencheArray preenche = new PreencheArray();
            preenche.executar();
        }
        catch (Exception e) {
            System.out.println("Exceção no preenchimento do array");
        }
    }
}
