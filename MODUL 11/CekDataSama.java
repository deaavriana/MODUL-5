import java.util.ArrayList;

public class CekDataSama
{
    public static void main(String[] args)
    {
        // data tinggi Tim A
        ArrayList<Integer> tinggiA = new ArrayList<Integer>();

        tinggiA.add(168);
        tinggiA.add(170);
        tinggiA.add(165);
        tinggiA.add(168);
        tinggiA.add(172);
        tinggiA.add(170);
        tinggiA.add(169);
        tinggiA.add(165);
        tinggiA.add(171);
        tinggiA.add(166);

        // data tinggi Tim B
        ArrayList<Integer> tinggiB = new ArrayList<Integer>();

        tinggiB.add(170);
        tinggiB.add(167);
        tinggiB.add(165);
        tinggiB.add(166);
        tinggiB.add(168);
        tinggiB.add(175);
        tinggiB.add(172);
        tinggiB.add(171);
        tinggiB.add(168);
        tinggiB.add(169);

        // data berat Tim A
        ArrayList<Integer> beratA = new ArrayList<Integer>();

        beratA.add(50);
        beratA.add(60);
        beratA.add(56);
        beratA.add(55);
        beratA.add(60);
        beratA.add(70);
        beratA.add(66);
        beratA.add(56);
        beratA.add(72);
        beratA.add(56);

        // data berat Tim B
        ArrayList<Integer> beratB = new ArrayList<Integer>();

        beratB.add(66);
        beratB.add(60);
        beratB.add(59);
        beratB.add(58);
        beratB.add(58);
        beratB.add(71);
        beratB.add(68);
        beratB.add(68);
        beratB.add(65);
        beratB.add(60);

        // cek tinggi badan yang sama
        System.out.println("Data Tinggi Badan yang Sama");

        for(Integer dataA : tinggiA)
        {
            if(tinggiB.contains(dataA))
            {
                System.out.println(dataA + " cm");
            }
        }

        System.out.println();

        // cek berat badan yang sama
        System.out.println("Data Berat Badan yang Sama");

        for(Integer dataA : beratA)
        {
            if(beratB.contains(dataA))
            {
                System.out.println(dataA + " kg");
            }
        }
    }
}
