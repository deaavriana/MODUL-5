import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // MANUSIA
        Manusia a = new Manusia("A", true, "111", true);
        System.out.println(a);
        System.out.println();

        // MAHASISWA FILKOM
        MahasiswaFILKOM b = new MahasiswaFILKOM(
                "B",
                false,
                "111",
                false,
                "165150300111100",
                4.0);
        System.out.println(b);
        System.out.println();

        // PEKERJA
        Pekerja c = new Pekerja(
                "C",
                true,
                "111",
                true,
                1000,
                LocalDate.of(2016, 3, 2),
                4);
        System.out.println(c);
        System.out.println();

        // MANAGER
        Manager d = new Manager(
                "D",
                true,
                "111",
                true,
                1000,
                LocalDate.of(2017, 1, 2),
                3,
                "HRD");
        System.out.println(d);
    }
}