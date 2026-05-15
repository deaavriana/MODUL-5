import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMin
{
    public static void main(String[] args)
    {
        // data tinggi tim a
        Integer[] tinggiA = {168, 170, 165, 168, 172, 170, 169, 165, 171, 166};

        List<Integer> listTinggiA = Arrays.asList(tinggiA);

        System.out.println("Data Tinggi Tim A:");
        output(listTinggiA);

        // data berat badan tim a
        Integer[] beratA = {50, 60, 56, 55, 60, 70, 66, 56, 72, 56};

        List<Integer> listBeratA = Arrays.asList(beratA);

        System.out.println("\nData Berat Tim A:");
        output(listBeratA);

        // data tinggi tim b
        Integer[] tinggiB = {170, 167, 165, 166, 175, 172, 171, 168, 169};

        List<Integer> listTinggiB = Arrays.asList(tinggiB);

        System.out.println("\nData Tinggi Tim B:");
        output(listTinggiB);

        // data berat badan tim b
        Integer[] beratB = {66, 60, 59, 58, 58, 71, 68, 68, 65, 60};

        List<Integer> listBeratB = Arrays.asList(beratB);

        System.out.println("\nData Berat Tim B:");
        output(listBeratB);
    }

    private static void output(List<Integer> listRef)
    {
        System.out.print("Data : ");

        for (Integer element : listRef)
            System.out.printf("%s ", element);

        System.out.printf("\nMax : %s", Collections.max(listRef));

        System.out.printf("\nMin : %s\n", Collections.min(listRef));
    }
}
