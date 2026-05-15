import java.util.ArrayList;
import java.util.Collections;

public class MencariTimB
{
    public static void main(String[] args)
    {
        // membuat ArrayList Tim B
        ArrayList<Integer> timB = new ArrayList<Integer>();

        // tambahkan data tinggi badan Tim B
        timB.add(170);
        timB.add(167);
        timB.add(165);
        timB.add(166);
        timB.add(168);
        timB.add(175);
        timB.add(172);
        timB.add(171);
        timB.add(168);
        timB.add(169);

        // mengurutkan data
        Collections.sort(timB);

        System.out.println("Data Tinggi Tim B : " + timB);

        // mencari tinggi badan
        cariData(timB, 168);
        cariData(timB, 160);
    }

    // method mencari data
    public static void cariData(ArrayList<Integer> list, int key)
    {
        int result = Collections.binarySearch(list, key);

        System.out.println("\nMencari tinggi badan : " + key + " cm");

        if(result >= 0)
        {
            int jumlah = Collections.frequency(list, key);

            System.out.println("Data ditemukan");
            System.out.println("Jumlah pemain : " + jumlah);
        }
        else
        {
            System.out.println("Data tidak ditemukan");
            System.out.println("Jumlah pemain : 0");
        }
    }
}
