import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        List<Integer> list = Utils.readListFromFile("src/main/resources/input.txt");

        ListSorting sorting = new ListSorting(list);
        sorting.sort();

        Utils.writeListToConsole(list);
    }
}