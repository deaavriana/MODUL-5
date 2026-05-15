import java.util.ArrayList;
import java.util.Collections;

public class MencariTimA
{
    public static void main(String[] args)
    {
        // membuat ArrayList tim a
        ArrayList<Integer> timA = new ArrayList<Integer>();

        // tambahkan data berat badan tim a
        timA.add(50);
        timA.add(60);
        timA.add(56);
        timA.add(55);
        timA.add(60);
        timA.add(70);
        timA.add(66);
        timA.add(56);
        timA.add(72);
        timA.add(56);

        // mengurutkan data
        Collections.sort(timA);

        System.out.println("Data Berat Tim A : " + timA);

        // mencari berat badan
        cariData(timA, 56);
        cariData(timA, 53);
    }

    // method mencari data
    public static void cariData(ArrayList<Integer> list, int key)
    {
        int result = Collections.binarySearch(list, key);

        System.out.println("\nMencari berat badan : " + key + " kg");

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