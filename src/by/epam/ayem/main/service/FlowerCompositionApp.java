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

import by.epam.ayem.main.model.FlowerComposition;
import java.util.Scanner;

public class FlowerCompositionApp {

    private static Scanner scanner = new Scanner(System.in);
    private static FlowerComposition flowerComposition = new FlowerComposition();
    private static FlowerCompositionService flowerCompositionService = new FlowerCompositionService();

    public void run() {

        System.out.println("Welcome to our flower shop!");

        boolean quit = false;

        while (!quit) {

            System.out.println("\nPlease, make your choice:\n" +
                    "1. Add flowers.\n" +
                    "2. Add wrapping.\n" +
                    "3. Show the flower composition.\n" +
                    "0. Quit.");

            while (!scanner.hasNextInt()) {
                scanner.next();
            }
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    flowerCompositionService.addFlower(flowerComposition);
                    break;
                case 2:
                    flowerCompositionService.addWrapping(flowerComposition);
                    break;
                case 3:
                    flowerCompositionService.showComposition(flowerComposition);
                    break;
                case 0:
                    quit = true;
                    break;
            }
        }
    }
}
