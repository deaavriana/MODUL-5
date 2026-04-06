public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, boolean menikah, String nim, double ipk) {
        super(nama, jenisKelamin, nik, menikah);

        this.nim = nim;
        this.ipk = ipk;

    }

    public String getStatus() {
        String angkatan = "20" + nim.substring(0, 2);
        char kodeProdi = nim.charAt(6);
        String prodi = "";

        if (kodeProdi == '2') {
            prodi = "Teknik Informatika";
        } else if (kodeProdi == '3') {
            prodi = "Teknik Komputer";
        } else if (kodeProdi == '4') {
            prodi = "Sistem Informasi";
        } else if (kodeProdi == '6') {
            prodi = "Pendidikan Teknologi Informasi";
        } else if (kodeProdi == '7') {
            prodi = "Teknologi Informasi";
        } else {
            prodi = "Prodi Tidak Diketahui";
        }

        return prodi + ", " + angkatan;
    }

    public double getBeasiswa() {
        if (ipk >= 3.0 && ipk < 3.5) {
            return 50;
        } else if (ipk >= 3.5 && ipk <= 4.0) {
            return 75;
        }
        return 0;
    }

    @Override
    public double getPendapatan() {
        return super.getTunjangan() + getBeasiswa();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                String.format(
                        "NIM           : %s\n" +
                                "IPK           : %.2f\n" +
                                "Status        : %s\n" +
                                "Beasiswa      : $%.2f",
                        nim, ipk, getStatus(), getBeasiswa());
    }
}