import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       System.out.println("--------- ПОИСК ГОРЯЧИХ НАПИТКОВ ---------");
       VendingMachineHotDrinks vmHotDrinkTemperature = new VendingMachineHotDrinks();
       List<HotDrinkTemperature> hotDrinkTemperatureList = new ArrayList<>(Arrays.asList(
                new HotDrinkTemperature("Coffee", new BigDecimal(3), 0.3, 90),
                new HotDrinkTemperature("Tea", new BigDecimal(1), 0.4, 80),
                new HotDrinkTemperature("Milk", new BigDecimal(3), 1.0, 50)));
       vmHotDrinkTemperature.initProduct(hotDrinkTemperatureList);
       System.out.println("Поиск по названию: " + vmHotDrinkTemperature.getProduct("Coffee"));
       System.out.println("Поиск по цене <=: " + vmHotDrinkTemperature.getProduct(new BigDecimal(2.5)));
       System.out.println("Поиск по температуре <=: " + vmHotDrinkTemperature.getProduct(70));
    }
}