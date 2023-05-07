package com.mycompany.aepprog;

import java.util.Scanner;

public class Aepprog {

    public static void main(String[] args) {
        funcionarios f = new funcionarios();
        int cargo = 0;
        int horas = 0;
        int vendas = 0;
        while (cargo <= 5) {
            System.out.println("SELECIONE O CARGO DO FUNCIONARIO:");
            System.out.println("1.PROGRAMADOR JUNIOR \n2.PROGRAMADOR PLENO");
            System.out.println("3.PROGRAMADOR SENIOR \n4.GERENTE \n5.VENDEDOR: ");
            
            Scanner scanner = new Scanner(System.in);
            cargo = scanner.nextInt();
            if ((cargo == 1) || (cargo == 2) || (cargo == 3) || (cargo == 4)) {
                System.out.println("Informe o total de horas trabalhadas:");
                horas = scanner.nextInt();
                f.calcularSalario(cargo, horas);
            }else{
                System.out.println("Informe o numero de vendas: ");
                vendas = scanner.nextInt();
                f.vendedor(vendas);
            }

        }

}
}

