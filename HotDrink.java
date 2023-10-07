import java.math.BigDecimal;

public class HotDrink extends Product {
    private double volume;

    public HotDrink(String name, BigDecimal price, double volume) {
        super(name,price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
