package Pertemuan6;

import Pertemuan5.Matakuliah;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
    private Date tglCetak;
    private double ipk = 0.0;
    private List<Semester> daftarSemester;
    private Mahasiswa mahasiswa;

    public TranskripNilai(Mahasiswa mahasiswa) {
        super();
        this.mahasiswa = mahasiswa;
        this.daftarSemester = new ArrayList<>();
        this.tglCetak = new Date();
    }

    public void hitungIPK() {
        double totalNilai = 0.0;
        int jumlahSemester = 0;

        for (Semester semester : daftarSemester) {
        for (KartuHasilStudi khs : semester.getDaftarKHS()) {
            totalNilai += khs.getIps(); // Hitung IPS untuk setiap KHS
            jumlahSemester++;

//            for (Matakuliah m : daftarMatakuliah) {
//                totalNilai += m.nilainIndex() * m.getSks(); // Menggunakan nilaiIndex() untuk nilai numerik
//                totalSks += m.getSks();
            }
        }

        if (jumlahSemester > 0) {
            ipk = totalNilai / jumlahSemester;
        } else {
            ipk = 0;
        }
    }

    public void addSemester(Semester semester) {
        daftarSemester.add(semester);
    }

    public void display() {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tglCetak.toString());
        System.out.println("IPK: " + ipk);

        for (Semester semester : daftarSemester) {
            System.out.println(semester.display());
        }
    }

    // Setter Getter
    public Date getTglCetak() {
        return tglCetak;
    }

    public void setTglCetak(Date tglCetak) {
        this.tglCetak = tglCetak;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
}