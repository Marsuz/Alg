package crack.dynamic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mzajda on 14/12/2016.
 */
public class MyBackpack {

    private List<Item> items = new ArrayList<>();

    public void addItem(int value, int weight) {
        items.add(new Item(value, weight));
    }

    public long getBestItems(int limit) {
        long backpack[][] = new long[limit + 1][items.size() + 1];
        for (int i = 0; i <= items.size(); i++) backpack[0][i] = 0;
        for (int i = 1; i <= items.size(); i++) {
            for (int j = 1; j <= limit; j++) {
                int weight = items.get(i - 1).weight;
                int value = items.get(i - 1).value;
                if (j < weight) {
                    backpack[j][i] = backpack[j][i - 1];
                } else {
                    backpack[j][i] = Math.max(backpack[j][i - 1], backpack[j - weight][i - 1] + (long) value);
                }
            }
        }
        for (int i = 0; i <= items.size(); i++) {
            for (int j = 0; j <= limit; j++) {
                System.out.print(backpack[j][i] + " ");
            }
            System.out.println();
        }
        return backpack[limit][items.size()];
    }

    private class Item {

        int value;
        int weight;

        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }

    }
}
