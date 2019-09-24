package by.epam.ayem.main.model;

public enum FlowerType {

    ROSE("rose"), ORCHID("orchid"), LILY("lily"),
    GLADIOLUS("gladiolus"), GERANIUM("geranium"),
    HIBISCUS("hibiscus"), LAVENDER("lavender");

    private final String readable;

    FlowerType(String readable) {
        this.readable = readable;
    }

    public String getReadable() {
        return readable;
    }
}
