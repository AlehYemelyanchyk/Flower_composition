package by.epam.ayem.main;

public enum WrappingType {

    GLASS_VASE("glass vase", 1), WOODEN_BASKET("wooden basket", 2),
    COLORED_PAPER("colored paper", 3), RIBBONS("ribbons", 4);

    private String readable;
    private int number;

    WrappingType(String readable, int number) {
        this.readable = readable;
        this.number = number;
    }

    public static boolean hasNumber(int number) {
        for (WrappingType item : values()) {
            if(item.getNumber() == number){
                return true;
            }
        }
        return false;
    }

    public String getReadable() {
        return readable;
    }

    public void setReadable(String readable) {
        this.readable = readable;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
