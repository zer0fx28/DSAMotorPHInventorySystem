import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static StockBST bst = new StockBST();
    private static StockHashMap hashMap = new StockHashMap();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("  MotorPH Inventory System");
        System.out.println("  Milestone 2 Implementation");
        System.out.println("=================================");

        loadSampleData();
        runMenu();
    }

    private static void addStock(Stock stock) {
        bst.add(stock);
        hashMap.put(stock);
    }

    private static void loadSampleData() {
        addStock(new Stock("2/1/2023", "Old", "Honda", "142QVTSIUR", "On-hand"));
        addStock(new Stock("2/1/2023", "Old", "Honda", "PZCT1S00XE", "Sold"));
        addStock(new Stock("2/1/2023", "Old", "Honda", "4VBTV8YNM7", "Sold"));
        addStock(new Stock("2/1/2023", "Old", "Honda", "95AN3AWVF4", "On-hand"));
        addStock(new Stock("2/3/2023", "Old", "Kawasaki", "483QHIM661", "On-hand"));
        addStock(new Stock("2/3/2023", "Old", "Kymco", "SPHA17SSEE", "On-hand"));
        addStock(new Stock("2/3/2023", "Old", "Kymco", "0AV7SWGX93", "Sold"));
        addStock(new Stock("2/4/2023", "Old", "Kymco", "QMUB6UYLKL", "Sold"));
        addStock(new Stock("2/4/2023", "Old", "Honda", "V96GMTFFEI", "Sold"));
        addStock(new Stock("2/5/2023", "Old", "Kawasaki", "4J8UA0FMVY", "Sold"));
        addStock(new Stock("2/5/2023", "Old", "Kawasaki", "A8BDL926FA", "Sold"));
        addStock(new Stock("2/5/2023", "Old", "Kawasaki", "X8G5ZZ7A69", "Sold"));
        addStock(new Stock("2/6/2023", "Old", "Honda", "TY5SU0WPDX", "On-hand"));
        addStock(new Stock("2/6/2023", "Old", "Honda", "5Q0EZG7WKB", "On-hand"));
        addStock(new Stock("2/6/2023", "Old", "Suzuki", "9XUOUOJ2XZ", "On-hand"));
        addStock(new Stock("2/6/2023", "Old", "Kymco", "YUL4UTC4FU", "On-hand"));
        addStock(new Stock("2/6/2023", "Old", "Kymco", "2ESQRHAXWG", "On-hand"));
        addStock(new Stock("2/7/2023", "Old", "Kymco", "J8JA99VWZE", "Sold"));
        addStock(new Stock("2/7/2023", "Old", "Kymco", "NS530HOT9H", "Sold"));
        addStock(new Stock("2/7/2023", "Old", "Suzuki", "URIA0XXM05", "Sold"));
        addStock(new Stock("2/7/2023", "Old", "Yamaha", "IDN93SI4KW", "Sold"));
        addStock(new Stock("2/7/2023", "Old", "Honda", "PVAWKD51CE", "Sold"));
        addStock(new Stock("2/7/2023", "Old", "Honda", "K4KHCQAU41", "Sold"));
        addStock(new Stock("2/8/2023", "Old", "Honda", "Z4NY5JGZZT", "Sold"));
        addStock(new Stock("2/8/2023", "Old", "Honda", "IRQACSKUNZ", "Sold"));
        addStock(new Stock("2/8/2023", "Old", "Yamaha", "TMZCTALNDL", "Sold"));
        addStock(new Stock("2/8/2023", "Old", "Yamaha", "DVFUIA0YVB", "Sold"));
        addStock(new Stock("2/8/2023", "Old", "Kymco", "4M793VVAHI", "On-hand"));
        addStock(new Stock("2/8/2023", "Old", "Suzuki", "5N7IQVJ2BA", "On-hand"));
        addStock(new Stock("3/1/2023", "New", "Suzuki", "NO8VW05PU9", "On-hand"));
        addStock(new Stock("3/1/2023", "New", "Yamaha", "NWIP2MQEIN", "Sold"));
        addStock(new Stock("3/1/2023", "New", "Kawasaki", "1HCWCVZSX8", "Sold"));
        addStock(new Stock("3/3/2023", "New", "Kawasaki", "Z46VKPIJBY", "Sold"));
        addStock(new Stock("3/3/2023", "New", "Kawasaki", "LYQVEHJ6IU", "Sold"));
        addStock(new Stock("3/3/2023", "New", "Yamaha", "BVGQQNMATL", "Sold"));
        addStock(new Stock("3/4/2023", "New", "Kymco", "URWMSQZCBU", "Sold"));
        addStock(new Stock("3/4/2023", "New", "Yamaha", "5NGI5UZ8T2", "On-hand"));
        addStock(new Stock("3/5/2023", "New", "Honda", "W2UYM0EIRS", "On-hand"));
        addStock(new Stock("3/5/2023", "New", "Honda", "AITLTSJUK2", "On-hand"));
        addStock(new Stock("3/5/2023", "New", "Yamaha", "45CNYV7IFF", "On-hand"));
        addStock(new Stock("3/6/2023", "New", "Kymco", "MXS36NKV96", "Sold"));
        addStock(new Stock("3/6/2023", "New", "Kymco", "PWM3MJWPYE", "Sold"));
        addStock(new Stock("3/6/2023", "New", "Kymco", "5I80N9HB7W", "Sold"));
        addStock(new Stock("3/6/2023", "New", "Yamaha", "D01JMJL9PG", "On-hand"));
        addStock(new Stock("3/6/2023", "New", "Suzuki", "1R88BOJW8W", "On-hand"));
        addStock(new Stock("3/7/2023", "New", "Suzuki", "LAMH9Y1YD6", "On-hand"));
        addStock(new Stock("3/7/2023", "New", "Yamaha", "02G7NJCRGS", "On-hand"));
        addStock(new Stock("3/7/2023", "New", "Kawasaki", "392XSUBMUW", "On-hand"));

        System.out.println("Loaded 47 stocks from MotorPH inventory data.\n");
    }

    private static void runMenu() {
        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add New Stock");
            System.out.println("2. Search by Engine Number (HashMap)");
            System.out.println("3. Search by Brand (BST)");
            System.out.println("4. Display All (BST In-Order)");
            System.out.println("5. Sort by Brand (Merge Sort)");
            System.out.println("6. Delete Stock");
            System.out.println("7. Exit");
            System.out.print("Choose: ");

            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input.");
                continue;
            }

            switch (choice) {
                case 1:
                    addNewStock();
                    break;
                case 2:
                    searchByEngine();
                    break;
                case 3:
                    searchBrand();
                    break;
                case 4:
                    bst.displayAll();
                    break;
                case 5:
                    displayMergeSorted();
                    break;
                case 6:
                    deleteStock();
                    break;
                case 7:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void addNewStock() {
        System.out.print("Date Entered: ");
        String date = scanner.nextLine();
        System.out.print("Stock Label (Old/New): ");
        String label = scanner.nextLine();
        System.out.print("Brand: ");
        String brand = scanner.nextLine();
        System.out.print("Engine Number: ");
        String engine = scanner.nextLine();
        System.out.print("Status (On-hand/Sold): ");
        String status = scanner.nextLine();

        Stock stock = new Stock(date, label, brand, engine, status);
        addStock(stock);
        System.out.println("Stock added: " + stock);
    }

    private static void searchByEngine() {
        System.out.print("Enter Engine Number: ");
        String engine = scanner.nextLine();
        Stock found = hashMap.get(engine);
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Not found.");
        }
    }

    private static void searchBrand() {
        System.out.print("Enter Brand: ");
        String brand = scanner.nextLine();
        ArrayList<Stock> found = bst.searchByBrand(brand);
        if (!found.isEmpty()) {
            System.out.println("\n--- Found " + found.size() + " stock(s) for brand: " + brand + " ---");
            for (Stock stock : found) {
                System.out.println(stock);
            }
        } else {
            System.out.println("Not found.");
        }
    }

    private static void displayMergeSorted() {
        ArrayList<Stock> all = bst.getAllSorted();
        ArrayList<Stock> sorted = MergeSort.sortByBrand(all);

        System.out.println("\n--- Stocks Sorted by Merge Sort ---");
        for (Stock stock : sorted) {
            System.out.println(stock);
        }
        System.out.println("Total: " + sorted.size() + " stocks");
    }

    private static void deleteStock() {
        System.out.print("Enter Engine Number to delete: ");
        String engine = scanner.nextLine();
        if (hashMap.contains(engine)) {
            hashMap.remove(engine);
            System.out.println("Deleted from HashMap.");
        } else {
            System.out.println("Stock not found.");
        }
    }
}
