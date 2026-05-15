import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BeratBadan
{
    public static void main(String[] args)
    {
        Integer[] timA = {50, 60, 56, 55, 60, 70, 66, 56, 72, 56};

        Integer[] timB = {66, 60, 59, 58, 58, 71, 68, 68, 65, 60};

        // tim a
        List<Integer> listA = Arrays.asList(timA);

        System.out.printf("Data Berat Tim A Sebelum Sort    : %s\n", listA);

        Collections.sort(listA);

        System.out.printf("Data Berat Tim A Ascending       : %s\n", listA);

        Collections.sort(listA, Collections.reverseOrder());

        System.out.printf("Data Berat Tim A Descending      : %s\n\n", listA);

        // tim b 
        List<Integer> listB = Arrays.asList(timB);

        System.out.printf("Data Berat Tim B Sebelum Sort    : %s\n", listB);

        Collections.sort(listB);

        System.out.printf("Data Berat Tim B Ascending       : %s\n", listB);

        Collections.sort(listB, Collections.reverseOrder());

        System.out.printf("Data Berat Tim B Descending      : %s\n", listB);
    }
}
