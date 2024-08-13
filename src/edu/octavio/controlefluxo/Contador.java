package edu.octavio.controlefluxo;

import edu.octavio.controlefluxo.exceptions.ParametrosInvalidosException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        int parametroUm, parametroDois;

        try {
            System.out.println("Digite o primeiro parametro");
            parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo parametro");
            parametroDois = terminal.nextInt();
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        } catch (InputMismatchException e) {
            System.err.println("Os parametros têm que ser números inteiros");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois)
            throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;
        for(int i = 1; i <= contagem; i++)
            System.out.println("Imprimindo o número " + i);
    }
}
