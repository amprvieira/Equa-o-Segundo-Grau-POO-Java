package aula7;

import java.util.Scanner;

public class principal{
    public static void main(String[] args) {
        Delta delta = new Delta();
        EqXn x= new EqXn();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Vamos calcular as raízes da equação de 2º grau. Para isso, forneça os valores abaixo: ");
        
        System.out.println("Dê o valor de a:");
        delta.setA(entrada.nextDouble());
        while (delta.getA()==0) {
            System.out.println("Não é uma equação de segundo grau");
            System.out.println("Dê o valor de a válido:");
            delta.setA(entrada.nextDouble());
        }

            System.out.println("Dê o valor de b:");
            delta.setB(entrada.nextDouble());

            System.out.println("Dê o valor de c:");
            delta.setC(entrada.nextDouble());

            delta.calculaDelta();

            if (delta.getDelta() < 0) {
                System.out.println("A equação não possui raizes reais.");
            }else if(delta.getDelta()==0){
                System.out.println("A equação possui somente 1 raiz:" + x.calculaXn(delta) );
            }else {
                System.out.println("A raiz negativa é: " + x.calculaXn(delta));
                System.out.println("A raiz positiva é: " + x.calculaXp(delta));
            }
    } 
}