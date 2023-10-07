import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VendingMachineHotDrinks implements VendingMachine {
    List<HotDrinkTemperature> hotDrinkTemperatureList = new ArrayList<>();
    List<HotDrinkTemperature> resultFind = new ArrayList<>();
    @Override
    public void initProduct() {
    }
    public void initProduct(List<HotDrinkTemperature> list) {
        this.hotDrinkTemperatureList = list;
    }
    @Override
    public String getProduct() {
        return null;
    }
    public String getProduct(String name) {
        resultFind.clear();
        for (HotDrinkTemperature el : hotDrinkTemperatureList) {
            if (el.getName().equals(name)) resultFind.add(el);
        }
        return resultFind.toString();
    }
    public String getProduct(BigDecimal price) {
        resultFind.clear();
        for (HotDrinkTemperature el : hotDrinkTemperatureList) {
            if (el.getPrice().compareTo(price) <= 0) resultFind.add(el);
        }
        return resultFind.toString();
    }
    public String getProduct(int temperature) {
        resultFind.clear();
        for (HotDrinkTemperature el : hotDrinkTemperatureList) {
            if (el.getTemperature() <= temperature) resultFind.add(el);
        }
        return resultFind.toString();
    }
}