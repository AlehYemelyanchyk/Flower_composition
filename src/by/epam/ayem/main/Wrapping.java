package by.epam.ayem.main;

public class Wrapping extends Composition {

    WrappingType wrappingType;

    public Wrapping(int number) {
        for (WrappingType wrapping: WrappingType.values()){
            if(wrapping.getNumber() == number){
                this.wrappingType = wrapping;
            }
        }
    }

    public Wrapping(WrappingType wrappingType) {
        this.wrappingType = wrappingType;
    }

    public WrappingType getWrappingType() {
        return wrappingType;
    }

    public void setWrappingType(WrappingType wrappingType) {
        this.wrappingType = wrappingType;
    }

    @Override
    public String toString() {
        return wrappingType.getReadable();
    }
}
