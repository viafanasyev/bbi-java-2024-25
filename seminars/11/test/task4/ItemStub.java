package task4;

/**
 * Класс-заглушка, реализующий интерфейс Item.
 * Хранит только необходимые для интерфейса поля (в отличие от монструозного ItemExample)
 * Такой класс удобен для тестирования класса Storage, если нам нужно проверять имена и вес предметов.
 */
public class ItemStub implements Item {
    private final String name;
    private final int weight;

    public ItemStub(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
