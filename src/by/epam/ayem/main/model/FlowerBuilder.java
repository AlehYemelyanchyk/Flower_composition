package by.epam.ayem.main.model;

/*Задача 5.
Создать консольное приложение, удовлетворяющее следующим требованиям:
1) Корректно спроектируйте и реализуйте предметную область задачи.
2) Для создания объектов из иерархии классов продумайте возможность использования пораждающих шаблонов проектирования.
3) Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
4) Меню выбора дейстий пользователем можно не реализовывать, используйте заглушку.
5) Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().

    Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
(объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы и упаковка. */

public class FlowerBuilder {

    private Flower flower = new Flower();

    public FlowerBuilder addFlowerType(int number) {
        if ((number - 1) >= 0 && (number - 1) < FlowerType.values().length) {
            flower.setFlowerType(FlowerType.values()[number]);
        } else {
            System.out.println("There are no flowers with such number.");
        }
        return this;
    }

    public FlowerBuilder addFlowersAmount(int amount) {
        flower.setAmount(amount);
        return this;
    }

    public Flower build() {
        return flower;
    }
}
