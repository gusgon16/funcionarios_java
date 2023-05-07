package com.mycompany.aepprog;

import java.util.Scanner;

public class funcionarios {

    public void calcularSalario(int cargo, int horas) {
        if (horas <= 160) {
            if (cargo == 1) {
                System.out.println("Salario do mes: " + horas * 30);
            } else if (cargo == 2) {
                System.out.println("Salario do mes: " + horas * 45);
            } else if (cargo == 3) {
                System.out.println("Salario do mes: " + horas * 80);
            } else {
                int bonus = 0;
                System.out.println("Selecione a quantidade de bonus: ");
                Scanner ler = new Scanner(System.in);
                bonus = ler.nextInt();
                if (bonus >= 10) {
                    System.out.println("Salario do mes: " + ((100 * horas) + ((10*horas)/100)));
                } else {
                    System.out.println("O Bonus nao pode ser inferior a 10%");
                }

            }

        } else {
            System.out.println("Nao pode ultrapassar 160 horas trabalhadas");
        }

    }

    public void vendedor(int vendas) {
        System.out.println("Salario do mes: "+(2000+(vendas*0.1)));
    }
}
