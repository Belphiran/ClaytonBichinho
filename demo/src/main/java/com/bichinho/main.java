package com.bichinho;

import java.util.Scanner;

import com.bichinho.model.Animal;
import com.bichinho.service.AnimalService;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnimalService service = new AnimalService();

        // Criando o animal ao nascer
        System.out.println("Crie seu novo animal");
        System.out.print("Insira o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Insira a classe: ");
        String classe = scanner.nextLine();
        System.out.print("Insira a família: ");
        String familia = scanner.nextLine();

        Animal animal = new Animal(nome, classe, familia);
        System.out.println("O animal se chama " + animal.getNome() + " é da classe " + animal.getClasse() +
                           " da família " + animal.getFamilia() + ". O animal possui força " + animal.getForca() +
                           ", caloria de " + animal.getCaloria() + " e " + animal.getIdade() + " idade.");

        int opcao = 0;
        while (opcao != 4 && animal.isVivo()) {
            System.out.println("O que o " + animal.getNome() + " vai fazer agora?");
            System.out.println("1- Comer\n2- Correr\n3- Dormir\n4- Morrer");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    service.comer(animal);
                    break;
                case 2:
                    service.correr(animal);
                    break;
                case 3:
                    service.dormir(animal);
                    break;
                case 4:
                    service.morrer(animal);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

        System.out.println("GAME OVER!");
        scanner.close();
    }
}
