package by.epam.ayem.main;

/*Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
(объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы и упаковка. */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FlowerShop {

    private List<Composition> flowersComp;

    public FlowerShop() {
        this.flowersComp = new ArrayList<>();
    }

    public void showWrapping() {
        for (int i = 0; i < WrappingType.values().length; i++) {
            System.out.println((i + 1) + ". " + WrappingType.values()[i].getReadable());
        }
    }

    public void showFlowers() {
        for (int i = 0; i < FlowersType.values().length; i++) {
            System.out.println((i + 1) + ". " + FlowersType.values()[i].getReadable());
        }
    }

    public void addFlower(int number, int amount) {
        if (FlowersType.hasNumber(number)) {
            flowersComp.add(new Flower(number, amount));
        } else {
            System.out.println("There are no flowers with such number.");
        }
    }

    public void addWrapping(int number) {
        if (flowersComp.size() == 0) {
            System.out.println("The flower composition has no flowers to wrap.");
        } else if (flowersComp.get(0).getClass().equals(Wrapping.class)) {
            System.out.println("The flower composition has been wrapped already.");
        } else if (WrappingType.hasNumber(number)) {
            flowersComp.add(0, new Wrapping(number));
        } else {
            System.out.println("There are no wrapping with such number.");
        }
    }

    public void showComp(List<Composition> flowersComp) {
        ListIterator<Composition> flowerIterator = flowersComp.listIterator();
        if (flowersComp.size() == 0) {
            System.out.println("No flowers in the composition.");
            return;
        } else {
            System.out.println("Flower composition:");
            while (flowerIterator.hasNext()) {
                System.out.print(flowerIterator.next());
                if (flowerIterator.hasNext()) {
                    System.out.print(", ");
                } else if (!flowerIterator.hasNext()) {
                    System.out.print(".\n");
                }
            }
        }
    }

    public List<Composition> getFlowersComp() {
        return flowersComp;
    }

    public void setFlowersComp(List<Composition> flowersComp) {
        this.flowersComp = flowersComp;
    }
}
