import java.util.ArrayList;

public class MergeSort {

    public static ArrayList<Stock> sortByBrand(ArrayList<Stock> list) {
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;

        ArrayList<Stock> left = new ArrayList<>(list.subList(0, mid));
        ArrayList<Stock> right = new ArrayList<>(list.subList(mid, list.size()));

        left = sortByBrand(left);
        right = sortByBrand(right);

        return merge(left, right);
    }

    private static ArrayList<Stock> merge(ArrayList<Stock> left, ArrayList<Stock> right) {
        ArrayList<Stock> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getBrand().compareToIgnoreCase(right.get(j).getBrand()) <= 0) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result;
    }
}
