import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TinggiBadan
{
    public static void main(String[] args)
    {
        Integer[] timA = {168, 170, 165, 168, 172, 170, 169, 165, 171, 166};

        Integer[] timB = {170, 167, 165, 166, 168, 175, 172, 171, 168, 169};

        // tim a
        List<Integer> listA = Arrays.asList(timA);

        System.out.printf("Data Tinggi Tim A Sebelum Sort   : %s\n", listA);

        Collections.sort(listA);

        System.out.printf("Data Tinggi Tim A Ascending      : %s\n", listA);

        Collections.sort(listA, Collections.reverseOrder());

        System.out.printf("Data Tinggi Tim A Descending     : %s\n\n", listA);

        // tim b
        List<Integer> listB = Arrays.asList(timB);

        System.out.printf("Data Tinggi Tim B Sebelum Sort   : %s\n", listB);

        Collections.sort(listB);

        System.out.printf("Data Tinggi Tim B Ascending      : %s\n", listB);

        Collections.sort(listB, Collections.reverseOrder());

        System.out.printf("Data Tinggi Tim B Descending     : %s\n", listB);
    }
}