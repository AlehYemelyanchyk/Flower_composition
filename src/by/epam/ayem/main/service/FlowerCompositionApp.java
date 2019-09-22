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

import java.util.Scanner;

public class FlowerCompositionApp {

    public void run() {

        Scanner scanner = new Scanner(System.in);
        FlowerCompositionService flowerCompositionService = new FlowerCompositionService();
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
                    flowerCompositionService.addFlower();
                    break;
                case 2:
                    flowerCompositionService.addWrapping();
                    break;
                case 3:
                    flowerCompositionService.showComposition();
                    break;
                case 0:
                    quit = true;
                    break;
            }
        }
    }
}
