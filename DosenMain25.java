public class DosenMain25 {
    public static void main(String[] args) {

        Dosen25 d1 = new Dosen25();
        d1.idDosen = "D005";
        d1.nama = "Dr. Yuri";
        d1.statusAktif = true;
        d1.tahunBergabung = 2018;
        d1.bidangKeahlian = "Pemrograman";

        d1.tampilInformasi();
        System.out.println("Masa kerja: " + d1.hitungMasaKerja(2026) + " tahun");
        d1.ubahKeahlian("Struktur Data");
        d1.setStatusAktif(false);
        d1.tampilInformasi();

        Dosen25 d2 = new Dosen25("D002", "Dr. Triana", true, 2012, "Basis Data");

        d2.tampilInformasi();
        System.out.println("Masa kerja: " + d2.hitungMasaKerja(2026) + " tahun");
        d2.ubahKeahlian("Jaringan");
        d2.tampilInformasi();
    }
}