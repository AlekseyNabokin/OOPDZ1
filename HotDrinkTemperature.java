import java.math.BigDecimal;

public class HotDrinkTemperature extends HotDrink{
    private int temperature;

    public HotDrinkTemperature(String name, BigDecimal price, double volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
