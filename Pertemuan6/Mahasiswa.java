package Pertemuan6;

public class Mahasiswa {
    private String nama;
    private String nrp;

    // Konstruktor default
    public Mahasiswa() {
        this.nrp = "233040081";
        this.nama = "Muhammad Fauzan Nur";
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nama, String nRP) {
        super();
        this.nrp = nRP;
        this.nama = nama;
    }

    // Metode untuk menampilkan informasi mahasiswa
    public String display() {
        return "nrp: " + nrp + " nama: " + nama;
    }

    // Getter dan Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Setter untuk nrp
    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    // Getter untuk nrp
    public String getNrp() {
        return nrp;
    }
}
