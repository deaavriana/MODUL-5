public class Main1 {
    public static void main(String[] args) {

        Kue[] daftarKue = new Kue[20];

        daftarKue[0] = new KuePesanan("Brownies", 50000, 1.5);
        daftarKue[1] = new KueJadi("Donat", 3000, 10);
        daftarKue[2] = new KuePesanan("Lapis", 40000, 2);
        daftarKue[3] = new KueJadi("Klepon", 2000, 15);
        daftarKue[4] = new KuePesanan("Cheesecake", 80000, 1);
        daftarKue[5] = new KueJadi("Risoles", 2500, 20);
        daftarKue[6] = new KuePesanan("Tiramisu", 90000, 1.2);
        daftarKue[7] = new KueJadi("Pastel", 3000, 12);
        daftarKue[8] = new KuePesanan("Bolu", 35000, 2.5);
        daftarKue[9] = new KueJadi("Onde-onde", 2500, 18);
        daftarKue[10] = new KuePesanan("Blackforest", 100000, 1.5);
        daftarKue[11] = new KueJadi("Bakpia", 2000, 25);
        daftarKue[12] = new KuePesanan("Red Velvet", 95000, 1);
        daftarKue[13] = new KueJadi("Lemper", 3000, 14);
        daftarKue[14] = new KuePesanan("Puding", 20000, 3);
        daftarKue[15] = new KueJadi("Serabi", 2500, 16);
        daftarKue[16] = new KuePesanan("Cupcake", 15000, 2);
        daftarKue[17] = new KueJadi("Martabak Mini", 4000, 10);
        daftarKue[18] = new KuePesanan("Pie", 30000, 1.8);
        daftarKue[19] = new KueJadi("Kastengel", 5000, 8);

        double totalSemua = 0;
        double totalHargaPesanan = 0, totalBerat = 0;
        double totalHargaJadi = 0, totalJumlah = 0;

        Kue kueTermahal = daftarKue[0];

        System.out.println("==================== DAFTAR SEMUA KUE ====================\n");

        for (Kue k : daftarKue) {

            if (k instanceof KuePesanan) {
                KuePesanan kp = (KuePesanan) k;

                System.out.println("[Kue Pesanan]");
                System.out.println("Nama Kue   : " + kp.getNama());
                System.out.println("Harga      : " + formatRupiah(kp.harga));
                System.out.println("Berat      : " + kp.getBerat());
                System.out.println("Total Harga: " + formatRupiah(kp.hitungHarga()));
            } else {
                KueJadi kj = (KueJadi) k;

                System.out.println("[Kue Jadi]");
                System.out.println("Nama Kue   : " + kj.getNama());
                System.out.println("Harga      : " + formatRupiah(kj.harga));
                System.out.println("Jumlah     : " + kj.getJumlah());
                System.out.println("Total Harga: " + formatRupiah(kj.hitungHarga()));
            }

            System.out.println("---------------------------------------------------------\n");

            double hargaAkhir = k.hitungHarga();
            totalSemua += hargaAkhir;

            if (k instanceof KuePesanan) {
                totalHargaPesanan += hargaAkhir;
                totalBerat += ((KuePesanan) k).getBerat();
            } else {
                totalHargaJadi += hargaAkhir;
                totalJumlah += ((KueJadi) k).getJumlah();
            }

            if (hargaAkhir > kueTermahal.hitungHarga()) {
                kueTermahal = k;
            }
        }

        System.out.println("==================== RINGKASAN ====================\n");
        System.out.println("Total Harga Semua Kue : " + formatRupiah(totalSemua));

        System.out.println("\n--- Kue Pesanan ---");
        System.out.println("Total Harga : " + formatRupiah(totalHargaPesanan));
        System.out.println("Total Berat : " + totalBerat);

        System.out.println("\n--- Kue Jadi ---");
        System.out.println("Total Harga : " + formatRupiah(totalHargaJadi));
        System.out.println("Total Jumlah: " + totalJumlah);

        System.out.println("\n==================== KUE TERMAHAL ====================\n");

        if (kueTermahal instanceof KuePesanan) {
            KuePesanan kp = (KuePesanan) kueTermahal;
            System.out.println("Jenis       : Kue Pesanan");
            System.out.println("Nama Kue    : " + kp.getNama());
            System.out.println("Harga Awal  : " + formatRupiah(kp.harga));
            System.out.println("Berat       : " + kp.getBerat());
            System.out.println("Total Harga : " + formatRupiah(kp.hitungHarga()));
        } else {
            KueJadi kj = (KueJadi) kueTermahal;
            System.out.println("Jenis       : Kue Jadi");
            System.out.println("Nama Kue    : " + kj.getNama());
            System.out.println("Harga Awal  : " + formatRupiah(kj.harga));
            System.out.println("Jumlah      : " + kj.getJumlah());
            System.out.println("Total Harga : " + formatRupiah(kj.hitungHarga()));
        }
    }

    public static String formatRupiah(double angka) {
        String hasil = String.valueOf((long) angka);
        StringBuilder sb = new StringBuilder(hasil);

        int hitung = 0;
        for (int i = sb.length() - 1; i > 0; i--) {
            hitung++;
            if (hitung == 3) {
                sb.insert(i, ".");
                hitung = 0;
            }
        }
        return "Rp " + sb.toString();
    }
}