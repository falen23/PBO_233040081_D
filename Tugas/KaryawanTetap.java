package Tugas;

// Kelas KaryawanTetap: turunan dari Karyawan dan implementasi interface CetakSlipGaji
public class KaryawanTetap extends Karyawan implements cetakSlipGaji {
    private double gajiBulanan;

    // Konstruktor: menerima nama, ID, dan gaji bulanan
    public KaryawanTetap(String nama, int id, double gajiBulanan) {
        super(nama, id);
        this.gajiBulanan = gajiBulanan;
    }

    // Implementasi method dari Karyawan
    @Override
    public double hitungGaji() {
        return gajiBulanan;
    }


    // Implementasi method dari interface CetakSlipGaji
    @Override
    public void cetakSlip() {
        System.out.println("Slip Gaji Karyawan");
        System.out.println("Nama: " + nama);
        System.out.println("ID: " + id);
        System.out.println("Gaji: Rp " + gajiBulanan);
    }
}
