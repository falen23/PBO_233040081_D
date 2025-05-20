package Tugas;
// Kelas abstrak Karyawan: sebagai blueprint untuk semua jenis karyawan
public abstract class Karyawan {
    protected String nama;
    protected int id;

    // Konstruktor: digunakan oleh subclass untuk mengisi nama dan ID
    public Karyawan(String nama, int id) {
        this.nama = nama;
        this.id = id;
    }

    // Method abstrak: setiap subclass wajib mengimplementasikan cara hitung gaji
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public abstract double hitungGaji();
}
