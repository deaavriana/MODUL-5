import java.util.ArrayList;

public class TimFutsal
{
    public static void main(String[] args)
    {
        // membuat ArrayList tim a
        ArrayList<Integer> timA = new ArrayList<Integer>();

        // menambahkan data tim a
        timA.add(168);
        timA.add(170);
        timA.add(165);
        timA.add(168);
        timA.add(172);
        timA.add(170);
        timA.add(169);
        timA.add(165);
        timA.add(171);
        timA.add(166);

        // membuat ArrayList tim b
        ArrayList<Integer> timB = new ArrayList<Integer>();

        // menambahkan data tim b
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

        // menampilkan data tim a
        System.out.println("Data Tim A : ");
        System.out.println(timA);

        // menampilkan data tim b
        System.out.println("\nData Tim B : ");
        System.out.println(timB);
    }
}
