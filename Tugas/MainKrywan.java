package Tugas;
// Kelas MainKrywan: tempat untuk menjalankan program
public class MainKrywan {
    public static void main(String[] args) {
        // Membuat objek Karyawan Tetap
        KaryawanTetap kt = new KaryawanTetap("budi",1,600000);
        // Membuat objek Karyawan Freelance
        KaryawanFreelance kf = new KaryawanFreelance("Intan",140,120,50000);

// Menampilkan slip gaji masing-masing karyawan
        kt.cetakSlip();
        System.out.println();
        kf.cetakSlip();
    }
}
