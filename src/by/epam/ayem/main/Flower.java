package by.epam.ayem.main;

/*Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
(объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы и упаковка. */

public class Flower extends Composition {

    FlowersType flowersType;
    int amount;

    public Flower(FlowersType flowersType, int amount) {
        this.amount = amount;
        this.flowersType = flowersType;
    }

    public Flower(int number, int amount) {
        for (FlowersType flower: FlowersType.values()){
            if(flower.getNumber() == number){
                this.flowersType = flower;
                this.amount = amount;
            }
        }
    }

    public FlowersType getFlowersType() {
        return flowersType;
    }

    public void setFlowersType(FlowersType flowersType) {
        this.flowersType = flowersType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return amount + " " + flowersType.getReadable();
    }


}
