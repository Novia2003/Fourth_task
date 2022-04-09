import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {
    public static List<Integer> readListFromFile(String fileName) throws FileNotFoundException {
        List<Integer> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()) {
                list.add(scanner.nextInt());
            }
        }
        return list;
    }

    public static void writeListToConsole(List<Integer> list) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            builder.append(list.get(i));
            if (i != list.size() - 1) {
                builder.append(", ");
            }
        }
        String line = builder.toString();
        System.out.print(line);
    }
}
