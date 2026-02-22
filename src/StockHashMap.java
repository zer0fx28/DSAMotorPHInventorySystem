import java.util.HashMap;

public class StockHashMap {
    private HashMap<String, Stock> map;

    public StockHashMap() {
        this.map = new HashMap<>();
    }

    public void put(Stock stock) {
        map.put(stock.getEngineNumber().toLowerCase(), stock);
    }

    public Stock get(String engineNumber) {
        return map.get(engineNumber.toLowerCase());
    }

    public boolean contains(String engineNumber) {
        return map.containsKey(engineNumber.toLowerCase());
    }

    public void remove(String engineNumber) {
        map.remove(engineNumber.toLowerCase());
    }

    public int size() {
        return map.size();
    }
}
