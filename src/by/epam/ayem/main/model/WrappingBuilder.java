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

public class WrappingBuilder {

    private Wrapping wrapping = new Wrapping();

    public WrappingBuilder addWrappingType(int number) {
        if (WrappingType.hasNumber(number)) {
            for (WrappingType wrappingType : WrappingType.values()) {
                if (wrappingType.getNumber() == number) {
                    wrapping.setWrappingType(wrappingType);
                }
            }
        } else {
            System.out.println("There are no wrapping with such number.");
        }
        return this;
    }

    public Wrapping build() {
        return wrapping;
    }
}
