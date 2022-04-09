import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class ListSortingTest {
    private List<Integer> list;
    private final List<Integer> expectedList;

    public ListSortingTest(List<Integer> list, List<Integer> expectedList) {
        this.list = list;
        this.expectedList = expectedList;
    }

    @Parameterized.Parameters
    public static List<Object[]> cases() {
        return Arrays.asList(new List[]{Arrays.asList(2, 1), Arrays.asList(1, 2)},
                new List[]{Arrays.asList(0, 0, 1, 0), Arrays.asList(0, 0, 0, 1)},
                new List[]{Arrays.asList(32, 0, 32, 32), Arrays.asList(0, 32, 32, 32)},
                new List[]{Arrays.asList(45, 89, 10, 1, 5, 89, 4), Arrays.asList(1, 4, 5, 10, 45, 89, 89)},
                new List[]{Arrays.asList(10, 8, 8, 8, 5, 3, 3, 0, 0), Arrays.asList(0, 0, 3, 3, 5, 8, 8, 8, 10)});
    }

    @Test
    public void sort() {
        ListSorting sorting = new ListSorting(list);
        sorting.sort();

        Assert.assertEquals(expectedList, list);
    }
}