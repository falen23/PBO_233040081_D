package Tugas;

// Kelas KaryawanFreelance: turunan dari Karyawan dan implementasi interface CetakSlipGaji
public class KaryawanFreelance extends  Karyawan implements cetakSlipGaji{
    private int jamKerja;
    private double tarifperjam;

    // Konstruktor: menerima nama, ID, jam kerja, dan tarif per jam
    public KaryawanFreelance(String nama, int id, int jamKerja, double tarifperjam) {
    super(nama, id);
    this.jamKerja = jamKerja;
    this.tarifperjam = tarifperjam;
    }


    // Implementasi method dari Karyawan
    @Override
    public double hitungGaji() {
        return jamKerja * tarifperjam;
    }


    // Implementasi method dari interface CetakSlipGaji
    @Override
    public void cetakSlip() {
        System.out.println("Slip gaji karyawan freelance");
        System.out.println("nama = " + nama);
        System.out.println("id = " + id);
        System.out.println("jamKerja = " + jamKerja);
        System.out.println("gaji: Rp = " + hitungGaji());
    }



}
