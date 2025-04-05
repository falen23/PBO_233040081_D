package Pertemuan6;

import Pertemuan5.Matakuliah;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        // Create objek matakuliah dengan informasi dosen pengampu
        Matakuliah mk1 = new Matakuliah("001","Algoritma Pemograman 1","A",3, "FAJAR DARMAWAN, ST., M.KOM");
        Matakuliah mk2 = new Matakuliah("002","Algoritma Pemograman 2","BC",3, "DR. IR Leony Lidya, MT");
        Matakuliah mk3 = new Matakuliah("003","Pemograman Berorientasi Objek","B",3,"Siroj Nur Ulum, S.T., M.T.");

        // Create objek KHS
        KartuHasilStudi khs = new KartuHasilStudi("2022");
        khs.addMatakuliah(mk1);
        khs.addMatakuliah(mk2);
        khs.addMatakuliah(mk3);
        khs.hitungIPS();

        // Create objek Mahasiswa
        Mahasiswa mhs = new Mahasiswa("jhon","303040001");

        // Create objek TranskripNilai
        TranskripNilai transkrip = new TranskripNilai (mhs);

        // Create objek Semester dan hubungkan dengan KHS
        Semester semester1 = new Semester("Semester 1");
        semester1.addKHS(khs);

        // Tambahkan semester ke transkrip nilai
        transkrip.addSemester(semester1);

        // Hitung IPK dan tampilkan hasil
        transkrip.hitungIPK();
        transkrip.display();
    }
}
