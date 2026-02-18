public class MataKuliahMain25 {
    public static void main(String[] args) {

        MataKuliah25 mk1 = new MataKuliah25();
        mk1.kodeMK = "ASD505";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();

        MataKuliah25 mk2 = new MataKuliah25("BD501", "Basis Data", 3, 4);

        mk2.tampilInformasi();
        mk2.tambahJam(2);
        mk2.kurangiJam(1);
        mk2.tampilInformasi();
    }
}