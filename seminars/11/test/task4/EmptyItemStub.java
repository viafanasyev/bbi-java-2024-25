package task4;

/**
 * Класс-заглушка, реализующий интерфейс Item.
 * Не хранит никаких полей, а просто возвращает пустые значения.
 * Такой класс удобен для тестирования класса Storage, если нам не важны имена и веса предметов.
 */
public class EmptyItemStub implements Item {
    @Override
    public String getName() {
        return "";
    }

    @Override
    public int getWeight() {
        return 0;
    }
}
