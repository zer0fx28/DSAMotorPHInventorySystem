import java.util.ArrayList;

public class StockBST {
    private Node root;

    public StockBST() {
        this.root = null;
    }

    public void add(Stock stock) {
        root = insert(root, stock);
    }

    private Node insert(Node node, Stock stock) {
        if (node == null) {
            return new Node(stock);
        }

        if (stock.getBrand().compareToIgnoreCase(node.data.getBrand()) < 0) {
            node.left = insert(node.left, stock);
        } else {
            node.right = insert(node.right, stock);
        }

        return node;
    }

    public Stock search(String brand) {
        return search(root, brand);
    }

    private Stock search(Node node, String brand) {
        if (node == null) {
            return null;
        }

        if (brand.equalsIgnoreCase(node.data.getBrand())) {
            return node.data;
        }

        if (brand.compareToIgnoreCase(node.data.getBrand()) < 0) {
            return search(node.left, brand);
        } else {
            return search(node.right, brand);
        }
    }

    public ArrayList<Stock> searchByBrand(String brand) {
        ArrayList<Stock> results = new ArrayList<>();
        searchByBrand(root, brand, results);
        return results;
    }

    private void searchByBrand(Node node, String brand, ArrayList<Stock> results) {
        if (node == null) {
            return;
        }

        if (brand.equalsIgnoreCase(node.data.getBrand())) {
            results.add(node.data);
        }

        searchByBrand(node.left, brand, results);
        searchByBrand(node.right, brand, results);
    }

    public ArrayList<Stock> getAllSorted() {
        ArrayList<Stock> result = new ArrayList<>();
        inOrder(root, result);
        return result;
    }

    private void inOrder(Node node, ArrayList<Stock> result) {
        if (node == null) {
            return;
        }

        inOrder(node.left, result);
        result.add(node.data);
        inOrder(node.right, result);
    }

    public void displayAll() {
        System.out.println("\n--- All Stocks (Sorted by Brand A-Z) ---");
        ArrayList<Stock> sorted = getAllSorted();
        for (Stock stock : sorted) {
            System.out.println(stock);
        }
        System.out.println("Total: " + sorted.size() + " stocks");
    }
}
