package com.bichinho.service;

import com.bichinho.model.Animal;

public class AnimalService {

    public void comer(Animal animal) {
        if (!animal.isVivo()) {
            System.out.println("O animal está morto e não pode comer.");
            return;
        }
        if (animal.getCaloria() < 100) {
            animal.setCaloria(animal.getCaloria() + 10);
            animal.setForca(animal.getForca() - 2);
            System.out.println("O animal comeu e agora sua força é " + animal.getForca() + 
                               " e suas calorias valem " + animal.getCaloria() + ".");
        } else {
            System.out.println("O animal está cheio e não pode comer mais.");
        }
    }

    public void correr(Animal animal) {
        if (!animal.isVivo()) {
            System.out.println("O animal está morto e não pode correr.");
            return;
        }
        if (animal.getCaloria() > 0) {
            animal.setForca(animal.getForca() - 5);
            animal.setCaloria(animal.getCaloria() - 5);
            System.out.println("O animal está correndo!! Agora sua força é de " + animal.getForca() + 
                               " e suas calorias valem " + animal.getCaloria() + ".");
            if (animal.getForca() <= 0) {
                morrer(animal);
            }
        } else {
            System.out.println("O animal está exausto e não pode correr.");
        }
    }

    public void dormir(Animal animal) {
        if (!animal.isVivo()) {
            System.out.println("O animal está morto e não pode dormir.");
            return;
        }
        animal.setForca(animal.getForca() + 10);
        animal.setCaloria(animal.getCaloria() - 2);
        System.out.println("O animal está dormindo agora! Sua força aumentou para " + animal.getForca() + 
                           " e suas calorias diminuíram para " + animal.getCaloria() + ".");
    }

    public void morrer(Animal animal) {
        animal.setVivo(false);
        animal.setForca(0);
        System.out.println("O animal morreu!");
    }
}
