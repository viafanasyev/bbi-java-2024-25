package task4;

public class ItemExample implements Item {
    private final String name;
    private final int weight;
    private final String originCountry;
    private final String manufacturer;
    private final int priceInDollars;
    private final int priceInEuros;
    private final int priceInRubles;
    private final String russianLocalName;

    public ItemExample(String name, int weight, String originCountry, String manufacturer, int priceInDollars, int priceInEuros, int priceInRubles, String russianLocalName) {
        this.name = name;
        this.weight = weight;
        this.originCountry = originCountry;
        this.manufacturer = manufacturer;
        this.priceInDollars = priceInDollars;
        this.priceInEuros = priceInEuros;
        this.priceInRubles = priceInRubles;
        this.russianLocalName = russianLocalName;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPriceInDollars() {
        return priceInDollars;
    }

    public int getPriceInEuros() {
        return priceInEuros;
    }

    public int getPriceInRubles() {
        return priceInRubles;
    }

    public String getRussianLocalName() {
        return russianLocalName;
    }
}
