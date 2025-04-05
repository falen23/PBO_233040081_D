package Pertemuan6;

import Pertemuan5.Matakuliah;

import java.util.ArrayList;
import java.util.List;


public class KartuHasilStudi {
    private String Semester;
    private double ips;
    private List<Matakuliah> daftarMatakuliah;

    public KartuHasilStudi(String Semester) {
        this.Semester = Semester;
        this.daftarMatakuliah = new ArrayList<>();
    }

    public void addMatakuliah(Matakuliah Matakuliah) {
        daftarMatakuliah.add(Matakuliah);
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        sb.append("Periode Semester: ").append(Semester).append("\n");
        for (Matakuliah m : daftarMatakuliah) {
            sb.append(m.display());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void hitungIPS() {
    double totalNilai = 0;
    int totalSks = 0;

    for (Matakuliah m : daftarMatakuliah) {
        totalNilai += m.nilainIndex() * m.getSks();
        totalSks+= m.getSks();
    }
    if (totalNilai > 0) {
        ips = totalNilai / totalSks;
    } else {
        ips = 0;
    }

    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    // Getter untuk Semester
    public String getSemester() {
        return Semester;
    }

    // Setter untuk ips
    public void setIps(double ips) {
        this.ips = ips;
    }

    // Getter untuk ips
    public double getIps() {
        return ips;
    }

    // Setter untuk daftarMatakuliah
    public void setDaftarMatakuliah(List<Matakuliah> daftarMatakuliah) {
        this.daftarMatakuliah = daftarMatakuliah;
    }

    // Getter untuk daftarMatakuliah
    public List<Matakuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }
}
