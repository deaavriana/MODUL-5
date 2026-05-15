import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CopyTim
{
    public static void main(String[] args)
    {
        // data Tim B
        Integer[] timB = {170, 167, 165, 166, 168, 175, 172, 171, 168, 169};

        // create and display list Tim B
        List<Integer> listB = Arrays.asList(timB);

        System.out.println("Data Tim B : ");
        output(listB);

        // buat array kosong untuk Tim C
        Integer[] timC = new Integer[10];

        // create List Tim C
        List<Integer> listC = Arrays.asList(timC);

        // copy data Tim B ke Tim C
        Collections.copy(listC, listB);

        System.out.println("\nData Tim C setelah copy : ");
        output(listC);
    }
    
    private static void output(List<Integer> listRef)
    {
        for (Integer element : listRef)
            System.out.printf("%s ", element);

        System.out.println();
    }
}
