package Pertemuan6;

import java.util.ArrayList;
import java.util.List;

public class Semester {
    private String kodeSemester;
    private List<KartuHasilStudi> daftarKHS;

    public Semester(String kodeSemester) {
        this.kodeSemester = kodeSemester;
        this.daftarKHS = new ArrayList<>();
    }

    public void addKHS(KartuHasilStudi khs) {
        daftarKHS.add(khs);
    }

    public String getKodeSemester() {
        return kodeSemester;
    }

    public List<KartuHasilStudi> getDaftarKHS() {
        return daftarKHS;
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        sb.append("semester: ").append(kodeSemester).append("\n");
        for (KartuHasilStudi khs : daftarKHS) {
            sb.append(khs.display()).append("\n");
        }
        return sb.toString();
    }
}
