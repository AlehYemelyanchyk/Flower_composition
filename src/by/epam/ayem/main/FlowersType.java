package by.epam.ayem.main;

public enum FlowersType  {

    ROSE("rose", 1), ORCHID("orchid", 2), LILY("lily", 3),
    GLADIOLUS("gladiolus", 4), GERANIUM("geranium", 5),
    HIBISCUS("hibiscus", 6), LAVENDER("lavender", 7);

    private String readable;
    private int number;

    FlowersType(String readable, int number) {
        this.readable = readable;
        this.number = number;
    }

    public static boolean hasNumber(int number) {
        for (FlowersType item : values()) {
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
