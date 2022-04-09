import java.util.ArrayList;
import java.util.List;

public class ListSorting {

    private List<Integer> list;

    public ListSorting(List<Integer> list) {
        this.list = list;
    }

    public void sort() {
        int maximum = findMaximumElement();

        List<Integer> listQuantitiesRepetitionsEachElement = new ArrayList<>();
        for (int i = 0; i <= maximum; i++) {
            int quantity = findQuantityRepetitionsThisElement(i);
            listQuantitiesRepetitionsEachElement.add(quantity);
        }

        int element = 0;
        int index = 0;
        for (Integer quantity : listQuantitiesRepetitionsEachElement) {
            if (quantity != 0) {
                for (int i = index; i < index + quantity; i++) {
                    list.set(i, element);
                }
            }
            index += quantity;
            element++;
        }
    }

    private int findMaximumElement() {
        int maximum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > maximum) {
                maximum = list.get(i);
            }
        }
        return maximum;
    }

    private int findQuantityRepetitionsThisElement(int index) {
        int quantity = 0;
        for (Integer element : list) {
            if (element == index) {
                quantity++;
            }
        }
        return quantity;
    }
}