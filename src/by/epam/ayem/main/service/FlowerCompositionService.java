package by.epam.ayem.main.service;

/*Задача 5.
Создать консольное приложение, удовлетворяющее следующим требованиям:
1) Корректно спроектируйте и реализуйте предметную область задачи.
2) Для создания объектов из иерархии классов продумайте возможность использования пораждающих шаблонов проектирования.
3) Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
4) Меню выбора дейстий пользователем можно не реализовывать, используйте заглушку.
5) Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().

    Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
(объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы и упаковка. */

import by.epam.ayem.main.model.*;

import java.util.ListIterator;
import java.util.Scanner;

public class FlowerCompositionService {

    private Scanner scanner = new Scanner(System.in);

    public void addFlower(FlowerComposition flowerComposition) {
        System.out.println("Choose a flower type:");
        showFlowers();

        int number = getInteger();

        if (number != 0) {
            System.out.println("Choose the amount of flowers:");

            int amount = getInteger();
            addFlower(flowerComposition, number, amount);
        }
    }

    public void addWrapping(FlowerComposition flowerComposition) {
        System.out.println("Choose a wrapping type:");
        showWrapping();

        int number = getInteger();

        if (number != 0) {
            addWrapping(flowerComposition, number);
        }
    }

    private int getInteger() {
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    private void showFlowers() {
        for (int i = 0; i < FlowerType.values().length; i++) {
            System.out.println((i + 1) + ". " + FlowerType.values()[i]);
        }
        System.out.println("0. Back.");
    }

    private void addFlower(FlowerComposition flowerComposition, int number, int amount) {
        Flower flower = new FlowerBuilder().addFlowerType(number).addFlowersAmount(amount).build();
        flowerComposition.getFlowers().add(flower);
    }

    private void showWrapping() {
        for (int i = 0; i < WrappingType.values().length; i++) {
            System.out.println((i + 1) + ". " + WrappingType.values()[i].toString().toLowerCase().replace("_", " "));
        }
        System.out.println("0. Back.");
    }

    private void addWrapping(FlowerComposition flowerComposition, int number) {
        if (flowerComposition.getFlowers().size() == 0) {
            System.out.println("The flower composition has no flowers to wrap.");
        } else {
            Wrapping wrapping = new WrappingBuilder().addWrappingType(number).build();
            flowerComposition.setWrapping(wrapping);
        }
    }

    public void showComposition(FlowerComposition flowerComposition) {
        ListIterator<Flower> flowerIterator = flowerComposition.getFlowers().listIterator();
        if (flowerComposition.getFlowers().size() == 0) {
            System.out.println("No flowers in the composition.");
        } else {
            System.out.println("Flower composition:");
            while (flowerIterator.hasNext()) {
                System.out.print(flowerIterator.next());
                if (flowerIterator.hasNext()) {
                    System.out.print(", ");
                } else {
                    System.out.print(" ");
                }
            }
            if (flowerComposition.getWrapping() != null) {
                System.out.println("in " +
                        flowerComposition.getWrapping().getWrappingType().toString().toLowerCase().replace("_", " "));
            }
        }
    }
}
